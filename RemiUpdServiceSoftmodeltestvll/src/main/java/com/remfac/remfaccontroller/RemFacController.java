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

    //CONSULTA A 2 TABLAS SIMULTANEAMENTE - CON DATO DE ENTRADA
   public void displayDataFromBothTables(JTextArea textArea) {
        try {
            String query = "SELECT TOP(20) * FROM dboProducto.productos; SELECT TOP(20) * FROM dboProducto.prodComp";
            PreparedStatement statement = conn.prepareStatement(query);
            boolean hasResults = statement.execute();

            StringBuilder resultText = new StringBuilder();

            // Resultados de la tabla dboProducto.productos
            resultText.append("Resultados de dboProducto.productos:\n");
            ResultSet resultSet = statement.getResultSet();
            while (resultSet.next()) {
                resultText.append(resultSet.getString("Codigo")).append(", ")
                          .append(resultSet.getString("Producto")).append(", ")
                          .append(resultSet.getString("Cantidad")).append("\n");
            }

            // Moverse a la siguiente consulta
            if (statement.getMoreResults()) {
                resultText.append("\nResultados de dboProducto.prodComp:\n");
                resultSet = statement.getResultSet();
                while (resultSet.next()) {
                    resultText.append(resultSet.getString("Codigo")).append(", ")
                              .append(resultSet.getString("Producto")).append(", ")
                              .append(resultSet.getString("Cantidad")).append("\n");
                }
            }

            textArea.setText(resultText.toString());

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al obtener los datos: " + ex.getMessage());
            ex.printStackTrace();
        }
    }
   /*
       //CONSULTA A 2 TABLAS SIMULTANEAMENTE - CON DATO DE ENTRADA - SIN SUBTITULOS LIMITES
    public void displayDataFromBothTables(JTextArea textArea) {
        try {
            String query = "SELECT TOP(20)* FROM dboProducto.productos; SELECT TOP(20)* FROM dboProducto.prodComp";
            PreparedStatement statement = conn.prepareStatement(query);
            boolean hasResults = statement.execute();

            StringBuilder resultText = new StringBuilder();

            // Iterar sobre los resultados de ambas consultas
            do {
                ResultSet resultSet = statement.getResultSet();
                while (resultSet.next()) {
                    resultText.append(resultSet.getString("Codigo")).append(", ")
                            .append(resultSet.getString("Producto")).append(", ")
                            .append(resultSet.getString("Cantidad")).append("\n");
                }
                resultText.append("\n"); // Agregar una línea en blanco entre los resultados de cada consulta
            } while (statement.getMoreResults()); // Verificar si hay más resultados

            textArea.setText(resultText.toString());

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al obtener los datos: " + ex.getMessage());
            ex.printStackTrace();
        }
    }
   */


    /*
        //CONSULTA A 1 TABLA - CON DATO DE ENTRADA
        public void displayDataByCode(String codigo, JTextArea textArea) {
        try {
            //String query = "SELECT TOP(20)* FROM dboProducto.productos WHERE Codigo='234567'";
            String query = "SELECT TOP(20)* FROM dboProducto.productos WHERE Codigo = ?";
            PreparedStatement statement = conn.prepareStatement(query);
            statement.setString(1, codigo);
            ResultSet resultSet = statement.executeQuery();

            StringBuilder resultText = new StringBuilder();
            while (resultSet.next()) {
                resultText.append(resultSet.getString("Codigo")).append(", ")
                          .append(resultSet.getString("Producto")).append(", ")
                          .append(resultSet.getString("Cantidad")).append("\n");
            }

            textArea.setText(resultText.toString());

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al obtener los datos: " + ex.getMessage());
            ex.printStackTrace();
        }
    }
     */
 /*
    //CONSULTA A 1 TABLA - SIN DATOS DE ENTRADA
    public void displayData(JTextArea textArea) {
        try {
            String query = "SELECT TOP(20)* FROM dboProducto.productos WHERE Codigo='234567'";
            PreparedStatement statement = conn.prepareStatement(query);
            ResultSet resultSet = statement.executeQuery();

            StringBuilder resultText = new StringBuilder();
            while (resultSet.next()) {
                resultText.append(resultSet.getString("Codigo")).append(", ")
                          .append(resultSet.getString("Producto")).append(", ")
                          .append(resultSet.getString("Cantidad")).append("\n");
            }

            textArea.setText(resultText.toString());

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al obtener los datos: " + ex.getMessage());
            ex.printStackTrace();
        }
    }
     */
    public void updateDataRemFac() {
        JOptionPane.showMessageDialog(null, "Test, al botón ACTUALIZAR.");
    }
}
