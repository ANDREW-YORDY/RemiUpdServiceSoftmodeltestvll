package com.remfac.remfaccontroller.core;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class CORERemfactRevise {

    private final Connection conn;

    public CORERemfactRevise(Connection conn) {
        this.conn = conn;
    }

    // Método para actualizar el REMIFACT en ambas tablas
    public void updateRemifactNRInBothTables(String remisionNum) {
        // Verificar que el campo no esté vacío
        if (remisionNum.isEmpty()) {
            JOptionPane.showMessageDialog(null, "El campo de remisión no puede estar vacío.");
            return;
        }

        // Concatenar el prefijo 'NR' al número de remisión
        String remifactNR = "NR" + remisionNum;

        // Verificar si el número de remisión existe en la tabla TRADE antes de actualizar
        String checkQuery = "SELECT COUNT(*) FROM dbop.TRADE WHERE REMISION = ?";
        try {
            PreparedStatement checkStatement = conn.prepareStatement(checkQuery);
            checkStatement.setString(1, remisionNum);
            ResultSet resultSet = checkStatement.executeQuery();
            resultSet.next();
            int rowCount = resultSet.getInt(1);
            if (rowCount == 0) {
                JOptionPane.showMessageDialog(null, "El número de remisión especificado no existe en la tabla TRADE.");
                return;
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al verificar el número de remisión en la tabla TRADE: " + ex.getMessage());
            ex.printStackTrace();
            return;
        }

        String updateQuery1 = "UPDATE dbop.TRADE SET REMIFACT = ? WHERE REMISION = ?";
        String updateQuery2 = "UPDATE dbop.MVTRADE SET REMIFACT = ?";

        try {
            PreparedStatement statement1 = conn.prepareStatement(updateQuery1);
            PreparedStatement statement2 = conn.prepareStatement(updateQuery2);

            statement1.setString(1, remifactNR);
            statement1.setString(2, remisionNum);

            statement2.setString(1, remifactNR);

            int rowsUpdated1 = statement1.executeUpdate();
            int rowsUpdated2 = statement2.executeUpdate();

            if (rowsUpdated1 > 0 && rowsUpdated2 > 0) {
                JOptionPane.showMessageDialog(null, "Código actualizado correctamente en ambas tablas.");
            } else if (rowsUpdated1 > 0) {
                JOptionPane.showMessageDialog(null, "Código actualizado correctamente en la tabla TRADE, pero no se encontró en MVTRADE.");
            } else if (rowsUpdated2 > 0) {
                JOptionPane.showMessageDialog(null, "Código actualizado correctamente en la tabla MVTRADE, pero no se encontró en TRADE.");
            } else {
                JOptionPane.showMessageDialog(null, "No se encontraron registros con el código especificado en ninguna tabla.");
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al actualizar el código: " + ex.getMessage());
            ex.printStackTrace();
        }
    }
}
