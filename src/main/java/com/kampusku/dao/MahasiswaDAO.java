/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.kampusku.dao;

/**
 *
 * @author ACER
 */
import com.kampusku.model.Mahasiswa;
import com.kampusku.util.ConnectDB;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MahasiswaDAO {

    public List<Mahasiswa> getAllMahasiswa() {
        List<Mahasiswa> mahasiswaList = new ArrayList<>();
        Connection connection = ConnectDB.connect();

        if (connection != null) {
            String query = "SELECT m.NIM, m.kode_kelas, k.nama_kelas, m.nama_mhs, m.email, m.alamat, m.tgl_lahir, m.no_telepon, m.jenis_kelamin "
                    + "FROM mahasiswa m "
                    + "LEFT JOIN kelas k ON m.kode_kelas = k.kode_kelas "
                    + "ORDER BY m.NIM ASC";

            try (Statement statement = connection.createStatement();
                 ResultSet resultSet = statement.executeQuery(query)) {

                while (resultSet.next()) {
                    String nim = resultSet.getString("NIM");
                    int kodeKelas = resultSet.getInt("kode_kelas");
                    String kelas = resultSet.getString("nama_kelas");
                    String nama = resultSet.getString("nama_mhs");
                    String email = resultSet.getString("email");
                    String alamat = resultSet.getString("alamat");
                    Date tglLahir = resultSet.getDate("tgl_lahir");
                    String noTelepon = resultSet.getString("no_telepon");
                    String jenisKelamin = resultSet.getString("jenis_kelamin");

                    Mahasiswa mahasiswa = new Mahasiswa(nim, kodeKelas, kelas, nama, email, alamat, tglLahir, noTelepon, jenisKelamin);
                    mahasiswaList.add(mahasiswa);
                }

            } catch (SQLException e) {
                System.err.println("Error fetching mahasiswa data.");
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

        return mahasiswaList;
    }

    
    public List<Mahasiswa> getAllMahasiswaByClass(String namaKelas) {
        List<Mahasiswa> mahasiswaList = new ArrayList<>();
        Connection connection = ConnectDB.connect();

        if (connection != null) {
            String query = "SELECT m.NIM, m.kode_kelas, k.nama_kelas, m.nama_mhs, m.email, m.alamat, m.tgl_lahir, m.no_telepon, m.jenis_kelamin "
                    + "FROM mahasiswa m "
                    + "LEFT JOIN kelas k ON m.kode_kelas = k.kode_kelas "
                    + "WHERE k.nama_kelas = ? ORDER BY m.NIM ASC";  // Use WHERE to filter by class name

            try (PreparedStatement statement = connection.prepareStatement(query)) {
                // Set the namaKelas parameter
                statement.setString(1, namaKelas);

                try (ResultSet resultSet = statement.executeQuery()) {
                    while (resultSet.next()) {
                        String nim = resultSet.getString("NIM");
                        int kodeKelas = resultSet.getInt("kode_kelas");
                        String kelas = resultSet.getString("nama_kelas");
                        String nama = resultSet.getString("nama_mhs");
                        String email = resultSet.getString("email");
                        String alamat = resultSet.getString("alamat");
                        Date tglLahir = resultSet.getDate("tgl_lahir");
                        String noTelepon = resultSet.getString("no_telepon");
                        String jenisKelamin = resultSet.getString("jenis_kelamin");

                        Mahasiswa mahasiswa = new Mahasiswa(nim, kodeKelas, kelas, nama, email, alamat, tglLahir, noTelepon, jenisKelamin);
                        mahasiswaList.add(mahasiswa);
                    }
                } catch (SQLException e) {
                    System.err.println("Error fetching mahasiswa data.");
                    e.printStackTrace();
                }
            } catch (SQLException e) {
                System.err.println("Error preparing the query.");
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

        return mahasiswaList;  // Return the list of mahasiswa objects
    }

    public Mahasiswa getOneMahasiswa(String inputNim) {
        Connection connection = ConnectDB.connect();
        Mahasiswa mahasiswa = null;  // Initialize mahasiswa object here

        if (connection != null) {
            // SQL query with WHERE clause to fetch a single student by NIM
            String query = "SELECT m.NIM, m.kode_kelas, k.nama_kelas, m.nama_mhs, m.email, m.alamat, m.tgl_lahir, m.no_telepon, m.jenis_kelamin "
                    + "FROM mahasiswa m "
                    + "LEFT JOIN kelas k ON m.kode_kelas = k.kode_kelas "
                    + "WHERE m.NIM = ? ORDER BY m.NIM ASC";  // Use NIM to fetch a specific student

            try (PreparedStatement statement = connection.prepareStatement(query)) {
                // Set the NIM parameter
                statement.setString(1, inputNim);

                try (ResultSet resultSet = statement.executeQuery()) {
                    if (resultSet.next()) {  // Ensure we are getting data
                        String nim = resultSet.getString("NIM");
                        int kodeKelas = resultSet.getInt("kode_kelas");
                        String kelas = resultSet.getString("nama_kelas");
                        String nama = resultSet.getString("nama_mhs");
                        String email = resultSet.getString("email");
                        String alamat = resultSet.getString("alamat");
                        Date tglLahir = resultSet.getDate("tgl_lahir");
                        String noTelepon = resultSet.getString("no_telepon");
                        String jenisKelamin = resultSet.getString("jenis_kelamin");

                        mahasiswa = new Mahasiswa(nim, kodeKelas, kelas, nama, email, alamat, tglLahir, noTelepon, jenisKelamin);
                    }
                }

            } catch (SQLException e) {
                System.err.println("Error fetching mahasiswa data.");
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
        return mahasiswa;  // Return mahasiswa, may be null if no data is fetched
    }

    public boolean addMahasiswa(Mahasiswa mahasiswa) {
        Connection connection = ConnectDB.connect();
        boolean isSuccess = false;

        if (connection != null) {
            String query = "INSERT INTO mahasiswa (NIM, kode_kelas, nama_mhs, email, alamat, tgl_lahir, no_telepon, jenis_kelamin) "
                    + "VALUES (?, ?, ?, ?, ?, ?, ?, ?)";

            try (PreparedStatement statement = connection.prepareStatement(query)) {
                statement.setString(1, mahasiswa.getNIM());
                statement.setInt(2, mahasiswa.getKodeKelas());
                statement.setString(3, mahasiswa.getNamaMhs());
                statement.setString(4, mahasiswa.getEmail());
                statement.setString(5, mahasiswa.getAlamat());
                statement.setDate(6, new java.sql.Date(mahasiswa.getTglLahir().getTime()));
                statement.setString(7, mahasiswa.getNoTelepon());
                statement.setString(8, mahasiswa.getJenisKelamin());

                isSuccess = statement.executeUpdate() > 0;

            } catch (SQLException e) {
                System.err.println("Error adding mahasiswa data.");
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

    public boolean updateMahasiswa(Mahasiswa mahasiswa) {
        Connection connection = ConnectDB.connect();
        boolean isSuccess = false;

        if (connection != null) {
            String query = "UPDATE mahasiswa SET kode_kelas = ?, nama_mhs = ?, email = ?, alamat = ?, tgl_lahir = ?, no_telepon = ?, jenis_kelamin = ? "
                    + "WHERE NIM = ?";

            try (PreparedStatement statement = connection.prepareStatement(query)) {
                statement.setInt(1, mahasiswa.getKodeKelas());
                statement.setString(2, mahasiswa.getNamaMhs());
                statement.setString(3, mahasiswa.getEmail());
                statement.setString(4, mahasiswa.getAlamat());
                statement.setDate(5, new java.sql.Date(mahasiswa.getTglLahir().getTime()));
                statement.setString(6, mahasiswa.getNoTelepon());
                statement.setString(7, mahasiswa.getJenisKelamin());
                statement.setString(8, mahasiswa.getNIM());

                isSuccess = statement.executeUpdate() > 0;

            } catch (SQLException e) {
                System.err.println("Error updating mahasiswa data.");
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

    public boolean deleteMahasiswa(String nim) {
        Connection connection = ConnectDB.connect();
        boolean isSuccess = false;

        if (connection != null) {
            String query = "DELETE FROM mahasiswa WHERE NIM = ?";

            try (PreparedStatement statement = connection.prepareStatement(query)) {
                statement.setString(1, nim);

                isSuccess = statement.executeUpdate() > 0;

            } catch (SQLException e) {
                System.err.println("Error deleting mahasiswa data.");
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

    public int getJumlahMahasiswa() {
        int jumlahMhs = 0;
        Connection connection = ConnectDB.connect();  // Ganti dengan method untuk koneksi database Anda

        if (connection != null) {
            String query = "SELECT COUNT(*) FROM mahasiswa";  // Query untuk menghitung jumlah baris di tabel mhs

            try (Statement statement = connection.createStatement();
                 ResultSet resultSet = statement.executeQuery(query)) {

                if (resultSet.next()) {
                    jumlahMhs = resultSet.getInt(1);  // Mengambil hasil COUNT(*) dari query
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

        return jumlahMhs;  // Mengembalikan jumlah mhs
    }
    
    public List<Mahasiswa> getMahasiswaByNIM(String NIM) {
        List<Mahasiswa> mahasiswaList = new ArrayList<>();
        Connection connection = ConnectDB.connect();

        if (connection != null) {
            String query = "SELECT m.NIM, m.kode_kelas, k.nama_kelas, m.nama_mhs, m.email, m.alamat, m.tgl_lahir, m.no_telepon "
                    + "FROM mahasiswa m "
                    + "LEFT JOIN kelas k ON m.kode_kelas = k.kode_kelas "
                    + "WHERE m.NIM = ? ORDER BY m.NIM ASC";  // Use WHERE to filter by class name

            try (PreparedStatement statement = connection.prepareStatement(query)) {
                // Set the namaKelas parameter
                statement.setString(1, NIM);

                try (ResultSet resultSet = statement.executeQuery()) {
                    while (resultSet.next()) {
                        String nim = resultSet.getString("NIM");
                        int kodeKelas = resultSet.getInt("kode_kelas");
                        String kelas = resultSet.getString("nama_kelas");
                        String nama = resultSet.getString("nama_mhs");
                        String email = resultSet.getString("email");
                        String alamat = resultSet.getString("alamat");
                        Date tglLahir = resultSet.getDate("tgl_lahir");
                        String noTelepon = resultSet.getString("no_telepon");
                        String jenisKelamin = resultSet.getString("jenis_kelamin");

                        Mahasiswa mahasiswa = new Mahasiswa(nim, kodeKelas, kelas, nama, email, alamat, tglLahir, noTelepon, jenisKelamin);
                        mahasiswaList.add(mahasiswa);
                    }
                } catch (SQLException e) {
                    System.err.println("Error fetching mahasiswa data.");
                    e.printStackTrace();
                }
            } catch (SQLException e) {
                System.err.println("Error preparing the query.");
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

        return mahasiswaList;  // Return the list of mahasiswa objects
    }
    
    public List<Mahasiswa> getMahasiswaByNama(String namaMahasiswa) {
        List<Mahasiswa> mahasiswaList = new ArrayList<>();
        Connection connection = ConnectDB.connect();

        if (connection != null) {
            // Query untuk mencari mahasiswa berdasarkan nama
            String query = "SELECT m.NIM, m.kode_kelas, k.nama_kelas, m.nama_mhs, m.email, m.alamat, m.tgl_lahir, m.no_telepon, m.jenis_kelamin "
                         + "FROM mahasiswa m "
                         + "LEFT JOIN kelas k ON m.kode_kelas = k.kode_kelas "
                         + "WHERE m.nama_mhs LIKE ? "
                         + "ORDER BY m.NIM ASC";

            try (PreparedStatement preparedStatement = connection.prepareStatement(query)) {
                // Menambahkan parameter untuk pencarian
                preparedStatement.setString(1, "%" + namaMahasiswa + "%");

                try (ResultSet resultSet = preparedStatement.executeQuery()) {
                    // Mengambil data dari hasil query
                    while (resultSet.next()) {
                        String nim = resultSet.getString("NIM");
                        int kodeKelas = resultSet.getInt("kode_kelas");
                        String kelas = resultSet.getString("nama_kelas");
                        String nama = resultSet.getString("nama_mhs");
                        String email = resultSet.getString("email");
                        String alamat = resultSet.getString("alamat");
                        Date tglLahir = resultSet.getDate("tgl_lahir");
                        String noTelepon = resultSet.getString("no_telepon");
                        String jenisKelamin = resultSet.getString("jenis_kelamin");

                        Mahasiswa mahasiswa = new Mahasiswa(nim, kodeKelas, kelas, nama, email, alamat, tglLahir, noTelepon, jenisKelamin);
                        mahasiswaList.add(mahasiswa);
                    }
                }
            } catch (SQLException e) {
                System.err.println("Error fetching mahasiswa data.");
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

        return mahasiswaList;
    }
    
    public boolean isMahasiswaExist(String inputNim) {
        Connection connection = ConnectDB.connect();
        boolean isExist = false;  // Variabel untuk menyimpan status keberadaan mahasiswa

        if (connection != null) {
            // Query SQL untuk memeriksa apakah ada mahasiswa dengan NIM tertentu
            String query = "SELECT 1 FROM mahasiswa WHERE NIM = ? LIMIT 1";  // Cek apakah ada NIM yang cocok

            try (PreparedStatement statement = connection.prepareStatement(query)) {
                // Set parameter NIM
                statement.setString(1, inputNim);

                try (ResultSet resultSet = statement.executeQuery()) {
                    if (resultSet.next()) {  // Jika ada baris hasil
                        isExist = true;  // Mahasiswa ditemukan
                    }
                }

            } catch (SQLException e) {
                System.err.println("Error checking mahasiswa existence.");
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
        return isExist;  // Mengembalikan true jika mahasiswa ditemukan, false jika tidak ada
    }


}