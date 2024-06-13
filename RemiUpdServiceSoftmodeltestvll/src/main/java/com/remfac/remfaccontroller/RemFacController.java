package com.remfac.remfaccontroller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class RemFacController {

    private Connection conn;

    public RemFacController(Connection conn) {
        this.conn = conn;
    }

    //CD: 234567   -  123456
    // Nuevo método para consultar ambas tablas utilizando un código de entrada
    public void displayDataFromBothTablesByCode(String codigo, JTextArea textArea) {
        try {
            String query1 = "SELECT * FROM dboProducto.productos WHERE Codigo = ?";
            String query2 = "SELECT * FROM dboProducto.prodComp WHERE Codigo = ?";
            PreparedStatement statement1 = conn.prepareStatement(query1);
            PreparedStatement statement2 = conn.prepareStatement(query2);

            //Esta instruccion se añadio al nuevo metodo
            statement1.setString(1, codigo);
            statement2.setString(1, codigo);

            StringBuilder resultText = new StringBuilder();

            // Resultados de la tabla dboProducto.productos
            resultText.append("*DATA TRADE*:\n");
            ResultSet resultSet1 = statement1.executeQuery();
            while (resultSet1.next()) {
                resultText.append("Código: ").append(resultSet1.getString("Codigo")).append(", ")
                          .append("Producto: ").append(resultSet1.getString("Producto")).append(", ")
                          .append("Cantidad: ").append(resultSet1.getString("Cantidad")).append("\n");
            }
            
            resultText.append("- - - - - - - - - - - -  - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -");

            // Resultados de la tabla dboProducto.prodComp
            resultText.append("\n*DATA MVTRADE*:\n");
            ResultSet resultSet2 = statement2.executeQuery();
            while (resultSet2.next()) {
                resultText.append("Código: ").append(resultSet2.getString("Codigo")).append(", ")
                          .append("Producto: ").append(resultSet2.getString("Producto")).append(", ")
                          .append("Cantidad: ").append(resultSet2.getString("Cantidad")).append("\n");
            }

            textArea.setText(resultText.toString());

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al obtener los datos: " + ex.getMessage());
            ex.printStackTrace();
        }
    }

    // UPDATE 'Codigo' in both tables.
    public void updateCodigoInBothTables(String oldCod, String newCod) {
        try {
            String updateQuery1 = "UPDATE dboProducto.productos SET Codigo = ? WHERE Codigo = ?";
            String updateQuery2 = "UPDATE dboProducto.prodComp SET Codigo = ? WHERE Codigo = ?";
            PreparedStatement statement1 = conn.prepareStatement(updateQuery1);
            PreparedStatement statement2 = conn.prepareStatement(updateQuery2);

            statement1.setString(1, newCod);
            statement1.setString(2, oldCod);
            statement2.setString(1, newCod);
            statement2.setString(2, oldCod);

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

    public void limpiarCampos(javax.swing.JTextField jTextField_NRODOC_IN, javax.swing.JTextField jTextField_NEWNRODOC_IN, javax.swing.JTextArea jTextArea_ViewPrevRemFac) {
        jTextField_NRODOC_IN.setText("");
        jTextField_NEWNRODOC_IN.setText("");
        jTextArea_ViewPrevRemFac.setText("");
    }

}
