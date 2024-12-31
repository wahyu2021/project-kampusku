/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.kampusku.dao;

import com.kampusku.model.MataKuliah;
import com.kampusku.util.ConnectDB;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ACER
 */
public class MataKuliahDAO {
    public List<MataKuliah> getAllMK() {
        List<MataKuliah> MKList = new ArrayList<>();
        Connection connection = ConnectDB.connect();

        if (connection != null) {
            String query = "SELECT * FROM matakuliah ORDER BY kode_MK ASC";

            try (Statement statement = connection.createStatement();
                 ResultSet resultSet = statement.executeQuery(query)) {

                while (resultSet.next()) {
                    int kodeMK = resultSet.getInt("kode_MK");
                    String namaMK = resultSet.getString("nama_MK");
                    int SKS = resultSet.getInt("SKS");
                    
                    MataKuliah MK = new MataKuliah(kodeMK, namaMK, SKS);
                    MKList.add(MK);
                }

            } catch (SQLException e) {
                System.err.println("Error fetching Jadwal data.");
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
        return MKList;
    }
    
     public MataKuliah getMKByKodeMK(int kodeMK) {
        MataKuliah mataKuliah = null;
        Connection connection = ConnectDB.connect(); // Pastikan ConnectDB.connect() mengembalikan koneksi yang valid

        if (connection != null) {
            String query = "SELECT * FROM matakuliah WHERE kode_MK = ?"; // Query untuk mencari berdasarkan kode_MK

            try (PreparedStatement preparedStatement = connection.prepareStatement(query)) {
                preparedStatement.setInt(1, kodeMK);  // Set kodeMK pada parameter query

                try (ResultSet resultSet = preparedStatement.executeQuery()) {
                    // Jika ada hasil yang ditemukan
                    if (resultSet.next()) {
                        String namaMK = resultSet.getString("nama_MK");
                        int SKS = resultSet.getInt("SKS");

                        // Membuat objek MataKuliah berdasarkan data yang ditemukan
                        mataKuliah = new MataKuliah(kodeMK, namaMK, SKS);
                    }
                }

                } catch (SQLException e) {
                    System.err.println("Error fetching Mata Kuliah by kodeMK.");
                    e.printStackTrace();
                } finally {
                    try {
                        // Menutup koneksi setelah selesai
                        connection.close();
                    } catch (SQLException e) {
                        System.err.println("Failed to close the connection.");
                        e.printStackTrace();
                    }
                }
            }
            return mataKuliah;  // Mengembalikan objek MataKuliah atau null jika tidak ditemukan
        }
    
    public boolean addMataKuliah(MataKuliah mataKuliah) {
        Connection connection = ConnectDB.connect();
        boolean isSuccess = false;

        if (connection != null) {
            String query = "INSERT INTO matakuliah (kode_MK, nama_MK, SKS) VALUES (?, ?, ?)";

            try (PreparedStatement statement = connection.prepareStatement(query)) {
                statement.setInt(1, mataKuliah.getKodeMK());
                statement.setString(2, mataKuliah.getNamaMK());
                statement.setInt(3, mataKuliah.getSKS());

                isSuccess = statement.executeUpdate() > 0;

            } catch (SQLException e) {
                System.err.println("Error adding Mata Kuliah data.");
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

    public boolean updateMataKuliah(MataKuliah mataKuliah) {
        Connection connection = ConnectDB.connect();
        boolean isSuccess = false;

        if (connection != null) {
            String query = "UPDATE matakuliah SET nama_MK = ?, SKS = ? WHERE kode_MK = ?";

            try (PreparedStatement statement = connection.prepareStatement(query)) {
                statement.setString(1, mataKuliah.getNamaMK());
                statement.setInt(2, mataKuliah.getSKS());
                statement.setInt(3, mataKuliah.getKodeMK());

                isSuccess = statement.executeUpdate() > 0;

            } catch (SQLException e) {
                System.err.println("Error updating Mata Kuliah data.");
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

    public boolean deleteMataKuliah(int kodeMK) {
        Connection connection = ConnectDB.connect();
        boolean isSuccess = false;

        if (connection != null) {
            String query = "DELETE FROM matakuliah WHERE kode_MK = ?";

            try (PreparedStatement statement = connection.prepareStatement(query)) {
                statement.setInt(1, kodeMK);

                isSuccess = statement.executeUpdate() > 0;

            } catch (SQLException e) {
                System.err.println("Error deleting Mata Kuliah data.");
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
    
    // Method to get MataKuliah by name
    public List<MataKuliah> getAllMKByNama(String namaMK) {
        List<MataKuliah> MKList = new ArrayList<>();
        Connection connection = ConnectDB.connect();

        if (connection != null) {
            String query = "SELECT * FROM matakuliah WHERE nama_MK LIKE ? ORDER BY kode_MK ASC";

            try (PreparedStatement statement = connection.prepareStatement(query)) {
                statement.setString(1, "%" + namaMK + "%"); // Use LIKE for partial match

                try (ResultSet resultSet = statement.executeQuery()) {
                    while (resultSet.next()) {
                        int kodeMK = resultSet.getInt("kode_MK");
                        String namaMKResult = resultSet.getString("nama_MK");
                        int SKS = resultSet.getInt("SKS");

                        MataKuliah MK = new MataKuliah(kodeMK, namaMKResult, SKS);
                        MKList.add(MK);
                    }
                }

            } catch (SQLException e) {
                System.err.println("Error fetching Mata Kuliah by name.");
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
        return MKList;
    }

    // Method to get MataKuliah by SKS
    public List<MataKuliah> getAllMKBySks(int sks) {
        List<MataKuliah> MKList = new ArrayList<>();
        Connection connection = ConnectDB.connect();

        if (connection != null) {
            String query = "SELECT * FROM matakuliah WHERE SKS = ? ORDER BY kode_MK ASC";

            try (PreparedStatement statement = connection.prepareStatement(query)) {
                statement.setInt(1, sks);

                try (ResultSet resultSet = statement.executeQuery()) {
                    while (resultSet.next()) {
                        int kodeMK = resultSet.getInt("kode_MK");
                        String namaMK = resultSet.getString("nama_MK");
                        int SKS = resultSet.getInt("SKS");

                        MataKuliah MK = new MataKuliah(kodeMK, namaMK, SKS);
                        MKList.add(MK);
                    }
                }

            } catch (SQLException e) {
                System.err.println("Error fetching Mata Kuliah by SKS.");
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
        return MKList;
    }

}
