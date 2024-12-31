/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.kampusku.util;
    import java.sql.Connection;
    import java.sql.DriverManager;
    import java.sql.SQLException;
/**
 *
 * @author ACER
 */
public class ConnectDB {
     // JDBC URL, username, and password of MySQL server
    private static final String URL = "jdbc:mysql://localhost:3306/kampusku";
    private static final String USER = "root";
    private static final String PASSWORD = "";

    // Method for connecting databases
    public static Connection connect() {
        Connection connection = null;
        try {
            // Load the MySQL JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Establish the connection
            connection = DriverManager.getConnection(URL, USER, PASSWORD);
            System.out.println("Connection to database 'kampusku' established successfully!");
        } catch (ClassNotFoundException e) {
            System.err.println("MySQL JDBC Driver not found. Include it in your library path.");
            e.printStackTrace();
        } catch (SQLException e) {
            System.err.println("Failed to connect to the database.");
            e.printStackTrace();
        }

        return connection;
    }
}
