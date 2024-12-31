/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.kampusku.dao;

import com.kampusku.model.Dosen;
import com.kampusku.util.ConnectDB;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ACER
 */
public class DosenDAO {
    public List<Dosen> getAllDosen() {
        List<Dosen> dosenList = new ArrayList<>();
        Connection connection = ConnectDB.connect();

        if (connection != null) {
            String query = "SELECT * FROM dosen ORDER BY kode_dosen ASC";

            try (Statement statement = connection.createStatement();
                 ResultSet resultSet = statement.executeQuery(query)) {

                while (resultSet.next()) {
                    int kodeDosen = resultSet.getInt("kode_dosen");
                    String namaDosen = resultSet.getString("nama_dosen");
                    String email = resultSet.getString("email");
                    String alamat = resultSet.getString("alamat");
                    String noTelepon = resultSet.getString("no_telepon");
                    String jenisKelamin = resultSet.getString("jenis_kelamin");

                    Dosen dosen = new Dosen(kodeDosen, namaDosen, email, noTelepon, alamat, jenisKelamin);
                    dosenList.add(dosen);
                }

            } catch (SQLException e) {
                System.err.println("Error fetching dosen data.");
                e.printStackTrace();
            } finally {
                try {
                    connection.close();
                } catch (SQLException e) {
                    System.err.println("Failed to close the connection.");
                    e.printStackTrace();
                }
            }
        }

        return dosenList;
    }
    
    public Dosen getOneDosen(int inputKodeDosen) {
        Connection connection = ConnectDB.connect();
        Dosen dosen = null;

        if (connection != null) {
            String query = "SELECT * FROM dosen WHERE kode_dosen = ? ORDER BY kode_dosen ASC";
           
            try (PreparedStatement statement = connection.prepareStatement(query)) {
                statement.setInt(1, inputKodeDosen);

                try (ResultSet resultSet = statement.executeQuery()) {
                    if (resultSet.next()) {  // Ensure we are getting data
                        int kodeDosen = resultSet.getInt("kode_dosen");
                        String namaDosen = resultSet.getString("nama_dosen");
                        String email = resultSet.getString("email");
                        String alamat = resultSet.getString("alamat");
                        String noTelepon = resultSet.getString("no_telepon");
                        String jenisKelamin = resultSet.getString("jenis_kelamin");

                        dosen = new Dosen(kodeDosen, namaDosen, email, noTelepon, alamat, jenisKelamin);
                    }
                }

            } catch (SQLException e) {
                System.err.println("Error fetching dosen data.");
                e.printStackTrace();
            } finally {
                try {
                    if (connection != null) {
                        connection.close();
                    }
                } catch (SQLException e) {
                    System.err.println("Failed to close the connection.");
                    e.printStackTrace();
                }
            }
        }
        return dosen;
    }

//    menambahkan dosen
    public boolean addDosen(Dosen dosen) {
        Connection connection = ConnectDB.connect();
        boolean isSuccess = false;

        if (connection != null) {
            String query = "INSERT INTO dosen (kode_dosen, nama_dosen, email, alamat, no_telepon, jenis_kelamin) VALUES (?, ?, ?, ?, ?, ?)";

            try (PreparedStatement statement = connection.prepareStatement(query)) {
                statement.setInt(1, dosen.getKodeDosen());
                statement.setString(2, dosen.getNamaDosen());
                statement.setString(3, dosen.getEmail());
                statement.setString(4, dosen.getAlamat());
                statement.setString(5, dosen.getNoTelepon());
                statement.setString(6, dosen.getJenisKelamin());

                isSuccess = statement.executeUpdate() > 0;

            } catch (SQLException e) {
                System.err.println("Error adding dosen data.");
                e.printStackTrace();
            } finally {
                try {
                    connection.close();
                } catch (SQLException e) {
                    System.err.println("Failed to close the connection.");
                    e.printStackTrace();
                }
            }
        }

        return isSuccess;
    }

//    Update data dosen
    public boolean updateDosen(Dosen dosen) {
        Connection connection = ConnectDB.connect();
        boolean isSuccess = false;

        if (connection != null) {
            String query = "UPDATE dosen SET nama_dosen = ?, email = ?, alamat = ?, no_telepon = ?, jenis_kelamin = ? WHERE kode_dosen = ?";

            try (PreparedStatement statement = connection.prepareStatement(query)) {
                statement.setString(1, dosen.getNamaDosen());
                statement.setString(2, dosen.getEmail());
                statement.setString(3, dosen.getAlamat());
                statement.setString(4, dosen.getNoTelepon());
                statement.setString(5, dosen.getJenisKelamin());
                statement.setInt(6, dosen.getKodeDosen());

                isSuccess = statement.executeUpdate() > 0;

            } catch (SQLException e) {
                System.err.println("Error updating dosen data.");
                e.printStackTrace();
            } finally {
                try {
                    connection.close();
                } catch (SQLException e) {
                    System.err.println("Failed to close the connection.");
                    e.printStackTrace();
                }
            }
        }

        return isSuccess;
    }

//    HapusDataDosen
    public boolean deleteDosen(int kodeDosen) {
        Connection connection = ConnectDB.connect();
        boolean isSuccess = false;

        if (connection != null) {
            String query = "DELETE FROM dosen WHERE kode_dosen = ?";

            try (PreparedStatement statement = connection.prepareStatement(query)) {
                statement.setInt(1, kodeDosen);

                isSuccess = statement.executeUpdate() > 0;

            } catch (SQLException e) {
                System.err.println("Error deleting dosen data.");
                e.printStackTrace();
            } finally {
                try {
                    connection.close();
                } catch (SQLException e) {
                    System.err.println("Failed to close the connection.");
                    e.printStackTrace();
                }
            }
        }

        return isSuccess;
    }
    
    public int getJumlahDosen() {
        int jumlahDosen = 0;
        Connection connection = ConnectDB.connect();  // Ganti dengan method untuk koneksi database Anda

        if (connection != null) {
            String query = "SELECT COUNT(*) FROM dosen";  // Query untuk menghitung jumlah baris di tabel dosen

            try (Statement statement = connection.createStatement();
                 ResultSet resultSet = statement.executeQuery(query)) {

                if (resultSet.next()) {
                    jumlahDosen = resultSet.getInt(1);  // Mengambil hasil COUNT(*) dari query
                }

            } catch (SQLException e) {
                System.err.println("Error fetching jumlah dosen.");
                e.printStackTrace();
            } finally {
                try {
                    connection.close();
                } catch (SQLException e) {
                    System.err.println("Failed to close the connection.");
                    e.printStackTrace();
                }
            }
        }

        return jumlahDosen;  // Mengembalikan jumlah dosen
    }
}
