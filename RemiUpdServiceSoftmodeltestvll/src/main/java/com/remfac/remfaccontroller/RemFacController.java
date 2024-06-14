package com.remfac.remfaccontroller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class RemFacController {

    private Connection conn;

    public RemFacController(Connection conn) {
        this.conn = conn;
    }


    // Método para mostrar datos de ambas tablas por código
    public void displayDataFromBothTablesByCode(String codigo, JTextArea textArea) {
        try {
            String query1 = "SELECT * FROM dboProducto.productos WHERE Codigo = ?";
            String query2 = "SELECT * FROM dboProducto.prodComp WHERE Codigo = ?";
            PreparedStatement statement1 = conn.prepareStatement(query1);
            PreparedStatement statement2 = conn.prepareStatement(query2);

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
            textArea.setEditable(false);
            textArea.setText(resultText.toString());

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al obtener los datos: " + ex.getMessage());
            ex.printStackTrace();
        }
    }

    // Método para actualizar el código en ambas tablas
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

    // Nuevo método para actualizar Producto y Cantidad en ambas tablas
    public void updateFieldsInBothTables(String codigo) {
        try {
            String updateQuery1 = "UPDATE dboProducto.productos SET Producto = '', Cantidad = 0 WHERE Codigo = ?";
            String updateQuery2 = "UPDATE dboProducto.prodComp SET Producto = '', Cantidad = 0 WHERE Codigo = ?";
            PreparedStatement statement1 = conn.prepareStatement(updateQuery1);
            PreparedStatement statement2 = conn.prepareStatement(updateQuery2);

            statement1.setString(1, codigo);
            statement2.setString(1, codigo);

            int rowsUpdated1 = statement1.executeUpdate();
            int rowsUpdated2 = statement2.executeUpdate();

            if (rowsUpdated1 > 0 && rowsUpdated2 > 0) {
                JOptionPane.showMessageDialog(null, "Campos actualizados correctamente en ambas tablas.");
            } else {
                JOptionPane.showMessageDialog(null, "No se encontraron registros con el código especificado.");
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al actualizar los campos: " + ex.getMessage());
            ex.printStackTrace();
        }
    }
    
      // Método para manejar la acción del checkbox
    public void handleCheckboxAction(boolean isSelected, JTextField jTextField_NEWNRODOC_IN) {
        if (isSelected) {
            int response = JOptionPane.showConfirmDialog(null, "¿Desea habilitar la opción de actualizar el número de documento?", "Confirmación", JOptionPane.YES_NO_OPTION);
            if (response == JOptionPane.YES_OPTION) {
                jTextField_NEWNRODOC_IN.setEnabled(true);
            } else {
                jTextField_NEWNRODOC_IN.setEnabled(false);
            }
        } else {
            jTextField_NEWNRODOC_IN.setEnabled(false);
        }
    }

    // Método para verificar si el campo está habilitado
    public boolean isFieldEnabled(JTextField jTextField_NEWNRODOC_IN) {
        return jTextField_NEWNRODOC_IN.isEnabled();
    }

    // Método para limpiar campos del formulario
    public void limpiarCampos(javax.swing.JTextField jTextField_NRODOC_IN, javax.swing.JTextField jTextField_NEWNRODOC_IN, javax.swing.JTextArea jTextArea_ViewPrevRemFac) {
        jTextField_NRODOC_IN.setText("");
        jTextField_NEWNRODOC_IN.setText("");
        jTextArea_ViewPrevRemFac.setText("");
    }
}
