/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package java.testing;
import static com.kampusku.util.ConnectDB.connect;
import java.sql.Connection;
import java.sql.SQLException;
/**
 *
 * @author ACER
 */
public class ConnectDBTesting {
    public static void main(String[] args){
        // Test the connection
        Connection connection = connect();
        
        // Close the connection if it's not null
        if (connection != null) {
            try {
                connection.close();
                System.out.println("Connection closed.");
            } catch (SQLException e) {
                System.err.println("Failed to close the connection.");
                e.printStackTrace();
            }
        }

    }
}
