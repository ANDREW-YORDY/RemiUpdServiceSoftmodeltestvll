/* *** UPDATES *** */
package com.remfac.remfaccontroller.core;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class CORERemfactRevise {

    private final Connection conn;

    public CORERemfactRevise(Connection conn) {
        this.conn = conn;
    }
    
//    public void testBTN()
//    {
//        JOptionPane.showMessageDialog(null, "TEST, AL BOTON UPDATE.");
//    }

    // Método para actualizar el NRODCTO en ambas tablas
    public void UpdateRemifactNRInBothTables(String oldRemifactNR, String newRemifactNR) {
        String updateQuery1 = "UPDATE TRADE SET REMIFACT = ? WHERE NRODCTO = ?";
        String updateQuery2 = "UPDATE MVTRADE SET REMIFACT = ? WHERE NRODCTO = ?";

        try {
            PreparedStatement statement1 = conn.prepareStatement(updateQuery1);
            PreparedStatement statement2 = conn.prepareStatement(updateQuery2);

            statement1.setString(1, newRemifactNR);
            statement1.setString(2, oldRemifactNR);
            statement2.setString(1, newRemifactNR);
            statement2.setString(2, oldRemifactNR);

            int rowsUpdated1 = statement1.executeUpdate();
            int rowsUpdated2 = statement2.executeUpdate();

            if (rowsUpdated1 > 0 && rowsUpdated2 > 0) {
                JOptionPane.showMessageDialog(null, "Código actualizado correctamente en ambas tablas.");
            } else {
                JOptionPane.showMessageDialog(null, "No se encontraron registros con el código especificado.");
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al actualizar el código: " + ex.getMessage());
            ex.printStackTrace();
        }
    }

}
