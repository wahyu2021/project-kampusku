/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.kampusku.dao;

import com.kampusku.model.Kelas;
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
public class KelasDAO {
    public List<Kelas> getAllKelas() {
        List<Kelas> kelasList = new ArrayList<>();
        Connection connection = ConnectDB.connect();

        if (connection != null) {
            String query = "SELECT * FROM kelas ORDER BY kode_kelas ASC";

            try (Statement statement = connection.createStatement();
                 ResultSet resultSet = statement.executeQuery(query)) {

                while (resultSet.next()) {
                    int kodeKelas = resultSet.getInt("kode_kelas");
                    String namaKelas = resultSet.getString("nama_kelas");
                    
                    Kelas kelas = new Kelas(kodeKelas, namaKelas);
                    kelasList.add(kelas);
                }

            } catch (SQLException e) {
                System.err.println("Error fetching kelas data.");
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

        return kelasList;
    }
    
    public Kelas getOneKelas(int inputKodeKelas) {
        Connection connection = ConnectDB.connect();
        Kelas kelas = null;

        if (connection != null) {
            String query = "SELECT * FROM kelas WHERE kode_kelas = ? ORDER BY kode_kelas ASC";
           
            try (PreparedStatement statement = connection.prepareStatement(query)) {
                statement.setInt(1, inputKodeKelas);

                try (ResultSet resultSet = statement.executeQuery()) {
                    if (resultSet.next()) {  // Ensure we are getting data
                        int kodeKelas = resultSet.getInt("kode_kelas");
                        String namaKelas = resultSet.getString("nama_kelas");

                        kelas = new Kelas(kodeKelas, namaKelas);
                    }
                }

            } catch (SQLException e) {
                System.err.println("Error fetching kelas data.");
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

        return kelas;
    }

    public boolean addKelas(Kelas kelas) {
        Connection connection = ConnectDB.connect();
        boolean isSuccess = false;

        if (connection != null) {
            String query = "INSERT INTO kelas (kode_kelas, nama_kelas) VALUES (?, ?)";

            try (PreparedStatement statement = connection.prepareStatement(query)) {
                statement.setInt(1, kelas.getKodeKelas());
                statement.setString(2, kelas.getNamaKelas());

                isSuccess = statement.executeUpdate() > 0;

            } catch (SQLException e) {
                System.err.println("Error adding kelas data.");
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

    public boolean updateKelas(Kelas kelas) {
        Connection connection = ConnectDB.connect();
        boolean isSuccess = false;

        if (connection != null) {
            String query = "UPDATE kelas SET nama_kelas = ? WHERE kode_kelas = ?";

            try (PreparedStatement statement = connection.prepareStatement(query)) {
                statement.setString(1, kelas.getNamaKelas());
                statement.setInt(2, kelas.getKodeKelas());

                isSuccess = statement.executeUpdate() > 0;

            } catch (SQLException e) {
                System.err.println("Error updating kelas data.");
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

    public boolean deleteKelas(String namaKelas) {
        Connection connection = ConnectDB.connect();
        boolean isSuccess = false;

        if (connection != null) {
            String query = "DELETE FROM kelas WHERE nama_kelas = ?";

            try (PreparedStatement statement = connection.prepareStatement(query)) {
                statement.setString(1, namaKelas);

                isSuccess = statement.executeUpdate() > 0;

            } catch (SQLException e) {
                System.err.println("Error deleting kelas data.");
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
    
    public int getJumlahKelas() {
        int jumlahKelas = 0;
        Connection connection = ConnectDB.connect();  // Ganti dengan method untuk koneksi database Anda

        if (connection != null) {
            String query = "SELECT COUNT(*) FROM kelas";  // Query untuk menghitung jumlah baris di tabel kelas

            try (Statement statement = connection.createStatement();
                 ResultSet resultSet = statement.executeQuery(query)) {

                if (resultSet.next()) {
                    jumlahKelas = resultSet.getInt(1);  // Mengambil hasil COUNT(*) dari query
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

        return jumlahKelas;  // Mengembalikan jumlah kelas
    }
    
    public List<Kelas> getAllKelasByNama(String nama) {
        List<Kelas> kelasList = new ArrayList<>();
        String query = "SELECT * FROM kelas WHERE nama_kelas LIKE ? ORDER BY kode_kelas ASC";

        try (Connection connection = ConnectDB.connect();
             PreparedStatement statement = connection.prepareStatement(query)) {

            statement.setString(1, "%" + nama + "%"); // Menambahkan wildcard untuk pencarian LIKE

            try (ResultSet resultSet = statement.executeQuery()) {
                while (resultSet.next()) {
                    int kodeKelas = resultSet.getInt("kode_kelas");
                    String namaKelas = resultSet.getString("nama_kelas");

                    Kelas kelas = new Kelas(kodeKelas, namaKelas);
                    kelasList.add(kelas);
                }
            }

        } catch (SQLException e) {
            System.err.println("Error fetching kelas data for nama: " + nama);
            e.printStackTrace();
        }

        return kelasList;
    }
    
    public Kelas getKelasByNama(String nama) {
        Kelas kelas = null; // Variabel untuk menyimpan data kelas yang ditemukan
        String query = "SELECT * FROM kelas WHERE nama_kelas = ? ORDER BY kode_kelas ASC";

        try (Connection connection = ConnectDB.connect();
             PreparedStatement statement = connection.prepareStatement(query)) {

            statement.setString(1, nama); // Menetapkan nama kelas untuk pencarian

            try (ResultSet resultSet = statement.executeQuery()) {
                if (resultSet.next()) { // Hanya mengambil data pertama yang ditemukan
                    int kodeKelas = resultSet.getInt("kode_kelas");
                    String namaKelas = resultSet.getString("nama_kelas");

                    // Membuat objek Kelas dan mengisi data yang ditemukan
                    kelas = new Kelas(kodeKelas, namaKelas);
                }
            }

        } catch (SQLException e) {
            System.err.println("Error fetching kelas data for nama: " + nama);
            e.printStackTrace();
        }

        return kelas; // Mengembalikan objek kelas yang ditemukan (atau null jika tidak ditemukan)
    }



}
