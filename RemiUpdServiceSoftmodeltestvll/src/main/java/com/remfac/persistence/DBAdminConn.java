package com.remfac.persistence;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class DBAdminConn {

    String user = "rootDB";
    String passw = "1611propio";
    String DB = "DBTESTcanvas";
    String pto = "1433";
    String ip = "localhost";

    Connection conn = null;

    public Connection DBGoToConnection() {

        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");

            String StrDB = "jdbc:sqlserver://" + ip + ":" + pto + ";" + "databaseName=" + DB + ";" + "encrypt=true;trustServerCertificate=true";
            conn = DriverManager.getConnection(StrDB, user, passw);

            JOptionPane.showMessageDialog(null, "CONEXIÓN EXITOSA!... A LA DB.");

        } catch (HeadlessException | ClassNotFoundException | SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "CONEXIÓN FALLIDA ... A LA DB.");
        }
        return conn;
    }
}
