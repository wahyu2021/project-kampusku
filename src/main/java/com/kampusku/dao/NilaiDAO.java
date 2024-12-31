/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.kampusku.dao;

import com.kampusku.model.Nilai;
import com.kampusku.util.ConnectDB;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ACER
 */
public class NilaiDAO {
    // Method untuk mengambil satu data nilai berdasarkan NIM
    public List<Nilai> getNilaiByNIM(String inputNIM) {
        List<Nilai> nilaiList = new ArrayList<>();
        Connection connection = ConnectDB.connect();

        if (connection != null) {
            String query = "SELECT n.kode_MK, mk.nama_MK, n.NIM, m.nama_mhs, n.tugas, n.uts, n.uas " +
                           "FROM nilai n " +
                           "LEFT JOIN mataKuliah mk ON n.kode_MK = mk.kode_MK " +
                           "LEFT JOIN mahasiswa m ON n.NIM = m.NIM " +
                           "WHERE n.NIM = ? " +
                           "ORDER BY n.kode_MK ASC";

            try (PreparedStatement statement = connection.prepareStatement(query)) {
                statement.setString(1, inputNIM);

                try (ResultSet resultSet = statement.executeQuery()) {
                    while (resultSet.next()) {
                        int kodeMK = resultSet.getInt("kode_MK");
                        String namaMK = resultSet.getString("nama_MK");
                        String NIM = resultSet.getString("NIM");
                        String namaMhs = resultSet.getString("nama_mhs");
                        double tugas = resultSet.getDouble("tugas");
                        double uts = resultSet.getDouble("uts");
                        double uas = resultSet.getDouble("uas");

                        // Buat objek Nilai dari hasil query
                        Nilai nilai = new Nilai(kodeMK, namaMK, NIM, namaMhs, tugas, uts, uas);
                        nilaiList.add(nilai);
                    }
                }

            } catch (SQLException e) {
                System.err.println("Error fetching nilai data by NIM.");
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
        return nilaiList;
    }

    // Method untuk menambahkan data nilai
    public boolean addNilai(Nilai nilai) {
        Connection connection = ConnectDB.connect();
        boolean isSuccess = false;

        if (connection != null) {
            String query = "INSERT INTO nilai (kode_MK, NIM, tugas, uts, uas) VALUES (?, ?, ?, ?, ?)";

            try (PreparedStatement statement = connection.prepareStatement(query)) {
                statement.setInt(1, nilai.getKodeMK());
                statement.setString(2, nilai.getNIM());
                statement.setDouble(3, nilai.getTugas());
                statement.setDouble(4, nilai.getUts());
                statement.setDouble(5, nilai.getUas());

                isSuccess = statement.executeUpdate() > 0;

            } catch (SQLException e) {
                System.err.println("Error adding nilai data.");
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

    // Method untuk memperbarui data nilai
    public boolean updateNilai(Nilai nilai) {
        Connection connection = ConnectDB.connect();
        boolean isSuccess = false;

        if (connection != null) {
            String query = "UPDATE nilai SET tugas = ?, uts = ?, uas = ? WHERE kode_MK = ? AND NIM = ?";

            try (PreparedStatement statement = connection.prepareStatement(query)) {
                statement.setDouble(1, nilai.getTugas());
                statement.setDouble(2, nilai.getUts());
                statement.setDouble(3, nilai.getUas());
                statement.setInt(4, nilai.getKodeMK());
                statement.setString(5, nilai.getNIM());

                isSuccess = statement.executeUpdate() > 0;

            } catch (SQLException e) {
                System.err.println("Error updating nilai data.");
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

    // Method untuk menghapus data nilai
    public boolean deleteNilai(int kodeMK, String NIM) {
        Connection connection = ConnectDB.connect();
        boolean isSuccess = false;

        if (connection != null) {
            String query = "DELETE FROM nilai WHERE kode_MK = ? AND NIM = ?";

            try (PreparedStatement statement = connection.prepareStatement(query)) {
                statement.setInt(1, kodeMK);
                statement.setString(2, NIM);

                isSuccess = statement.executeUpdate() > 0;

            } catch (SQLException e) {
                System.err.println("Error deleting nilai data.");
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


}
