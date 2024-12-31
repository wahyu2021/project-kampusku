/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.kampusku.dao;
import com.kampusku.model.Jadwal;
import com.kampusku.util.ConnectDB;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.sql.Time;
/**
 *
 * @author ACER
 */
public class JadwalDAO {
    public List<Jadwal> getClassJadwal(String kelas) {
        List<Jadwal> jadwalList = new ArrayList<>();
        String query = "SELECT j.kode_dosen, d.nama_dosen, j.kode_MK, mk.nama_MK, j.kode_kelas, k.nama_kelas, j.hari, j.jam_mulai, j.jam_berakhir "
                     + "FROM jadwal j "
                     + "LEFT JOIN dosen d ON j.kode_dosen = d.kode_dosen "
                     + "LEFT JOIN matakuliah mk ON j.kode_MK = mk.kode_MK "
                     + "LEFT JOIN kelas k ON j.kode_kelas = k.kode_kelas AND k.nama_kelas = ?";
        
        try (Connection connection = ConnectDB.connect();
             PreparedStatement statement = connection.prepareStatement(query)) {
             
            if (connection == null) {
                System.err.println("Database connection failed.");
                return jadwalList; 
            }

            statement.setString(1, kelas);

            try (ResultSet resultSet = statement.executeQuery()) {
                while (resultSet.next()) {
                    int kodeMK = resultSet.getInt("kode_MK");
                    int kodeDosen = resultSet.getInt("kode_dosen");
                    int kodeKelas = resultSet.getInt("kode_kelas");
                    String namaDosen = resultSet.getString("nama_dosen");
                    String namaMK = resultSet.getString("nama_MK");
                    String namaKelas = resultSet.getString("nama_kelas");
                    String hari = resultSet.getString("hari");
                    Time jamMulai = resultSet.getTime("jam_mulai");
                    Time jamBerakhir = resultSet.getTime("jam_berakhir");

                    Jadwal jadwal = new Jadwal(kodeDosen, namaDosen, kodeMK, namaMK, kodeKelas, namaKelas, hari, jamMulai, jamBerakhir);
                    jadwalList.add(jadwal);
                }
            }
        } catch (SQLException e) {
            System.err.println("Error fetching jadwal data for class: " + kelas);
            e.printStackTrace();
        }

        return jadwalList;
    }
    
    public List<Jadwal> getAllJadwal() {
        List<Jadwal> jadwalList = new ArrayList<>();
        String query = "SELECT j.kode_dosen, d.nama_dosen, j.kode_MK, mk.nama_MK, j.kode_kelas, k.nama_kelas, j.hari, j.jam_mulai, j.jam_berakhir "
                     + "FROM jadwal j "
                     + "LEFT JOIN dosen d ON j.kode_dosen = d.kode_dosen "
                     + "LEFT JOIN matakuliah mk ON j.kode_MK = mk.kode_MK "
                     + "LEFT JOIN kelas k ON j.kode_kelas = k.kode_kelas";
        
        try (Connection connection = ConnectDB.connect();
             PreparedStatement statement = connection.prepareStatement(query)) {
             
            if (connection == null) {
                System.err.println("Database connection failed.");
                return jadwalList; 
            }
            try (ResultSet resultSet = statement.executeQuery()) {
                while (resultSet.next()) {
                    int kodeMK = resultSet.getInt("kode_MK");
                    int kodeDosen = resultSet.getInt("kode_dosen");
                    int kodeKelas = resultSet.getInt("kode_kelas");
                    String namaDosen = resultSet.getString("nama_dosen");
                    String namaMK = resultSet.getString("nama_MK");
                    String namaKelas = resultSet.getString("nama_kelas");
                    String hari = resultSet.getString("hari");
                    Time jamMulai = resultSet.getTime("jam_mulai");
                    Time jamBerakhir = resultSet.getTime("jam_berakhir");

                    Jadwal jadwal = new Jadwal(kodeDosen, namaDosen, kodeMK, namaMK, kodeKelas, namaKelas, hari, jamMulai, jamBerakhir);
                    jadwalList.add(jadwal);
                }
            }
        } catch (SQLException e) {
            System.err.println("Error fetching jadwal data");
            e.printStackTrace();
        }

        return jadwalList;
    }

    public boolean addJadwal(Jadwal jadwal) {
        Connection connection = ConnectDB.connect();
        boolean isSuccess = false;

        if (connection != null) {
            String query = "INSERT INTO jadwal (kode_dosen, kode_MK, kode_kelas, hari, jam_mulai, jam_berakhir) "
                    + "VALUES (?, ?, ?, ?, ?, ?)";

            try (PreparedStatement statement = connection.prepareStatement(query)) {
                statement.setInt(1, jadwal.getKodeDosen());
                statement.setInt(2, jadwal.getKodeMK());
                statement.setInt(3, jadwal.getKodeKelas());
                statement.setString(4, jadwal.getHari());
                statement.setTime(5, jadwal.getJamMulai());
                statement.setTime(6, jadwal.getJamBerakhir());

                isSuccess = statement.executeUpdate() > 0;

            } catch (SQLException e) {
                System.err.println("Error adding jadwal data.");
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

    public boolean updateJadwal(Jadwal jadwal) {
        Connection connection = ConnectDB.connect();
        boolean isSuccess = false;

        if (connection != null) {
            String query = "UPDATE jadwal SET kode_dosen = ?, kode_MK = ?, kode_kelas = ?, hari = ?, jam_mulai = ?, jam_berakhir = ? "
                    + "WHERE kode_MK = ? AND kode_kelas = ?";

            try (PreparedStatement statement = connection.prepareStatement(query)) {
                statement.setInt(1, jadwal.getKodeDosen());
                statement.setInt(2, jadwal.getKodeMK());
                statement.setInt(3, jadwal.getKodeKelas());
                statement.setString(4, jadwal.getHari());
                statement.setTime(5, jadwal.getJamMulai());
                statement.setTime(6, jadwal.getJamBerakhir());
                statement.setInt(7, jadwal.getKodeMK());
                statement.setInt(8, jadwal.getKodeKelas());

                isSuccess = statement.executeUpdate() > 0;

            } catch (SQLException e) {
                System.err.println("Error updating jadwal data.");
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

    public boolean deleteJadwal(int kodeMK, int kodeKelas) {
        Connection connection = ConnectDB.connect();
        boolean isSuccess = false;

        if (connection != null) {
            String query = "DELETE FROM jadwal WHERE kode_MK = ? AND kode_kelas = ?";

            try (PreparedStatement statement = connection.prepareStatement(query)) {
                statement.setInt(1, kodeMK);
                statement.setInt(2, kodeKelas);

                isSuccess = statement.executeUpdate() > 0;

            } catch (SQLException e) {
                System.err.println("Error deleting jadwal data.");
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
    
    public List<Jadwal> getJadwalByNamaDosen(String namaDosen) {
        List<Jadwal> jadwalList = new ArrayList<>();
        String query = "SELECT j.kode_dosen, d.nama_dosen, j.kode_MK, mk.nama_MK, j.kode_kelas, k.nama_kelas, j.hari, j.jam_mulai, j.jam_berakhir "
                     + "FROM jadwal j "
                     + "LEFT JOIN dosen d ON j.kode_dosen = d.kode_dosen "
                     + "LEFT JOIN matakuliah mk ON j.kode_MK = mk.kode_MK "
                     + "LEFT JOIN kelas k ON j.kode_kelas = k.kode_kelas "
                     + "WHERE d.nama_dosen LIKE ?";
        try (Connection connection = ConnectDB.connect();
             PreparedStatement statement = connection.prepareStatement(query)) {
            if (connection == null) {
                System.err.println("Database connection failed.");
                return jadwalList; 
            }
            statement.setString(1, "%" + namaDosen + "%");
            try (ResultSet resultSet = statement.executeQuery()) {
                while (resultSet.next()) {
                    int kodeMK = resultSet.getInt("kode_MK");
                    int kodeDosen = resultSet.getInt("kode_dosen");
                    int kodeKelas = resultSet.getInt("kode_kelas");
                    namaDosen = resultSet.getString("nama_dosen");
                    String namaMK = resultSet.getString("nama_MK");
                    String namaKelas = resultSet.getString("nama_kelas");
                    String hari = resultSet.getString("hari");
                    Time jamMulai = resultSet.getTime("jam_mulai");
                    Time jamBerakhir = resultSet.getTime("jam_berakhir");

                    Jadwal jadwal = new Jadwal(kodeDosen, namaDosen, kodeMK, namaMK, kodeKelas, namaKelas, hari, jamMulai, jamBerakhir);
                    jadwalList.add(jadwal);
                }
            }
        } catch (SQLException e) {
            System.err.println("Error fetching jadwal data by nama dosen");
            e.printStackTrace();
        }
        return jadwalList;
    }

    public List<Jadwal> getJadwalByNamaKelas(String namaKelas) {
        List<Jadwal> jadwalList = new ArrayList<>();
        String query = "SELECT j.kode_dosen, d.nama_dosen, j.kode_MK, mk.nama_MK, j.kode_kelas, k.nama_kelas, j.hari, j.jam_mulai, j.jam_berakhir "
                     + "FROM jadwal j "
                     + "LEFT JOIN dosen d ON j.kode_dosen = d.kode_dosen "
                     + "LEFT JOIN matakuliah mk ON j.kode_MK = mk.kode_MK "
                     + "LEFT JOIN kelas k ON j.kode_kelas = k.kode_kelas "
                     + "WHERE k.nama_kelas LIKE ?";
        try (Connection connection = ConnectDB.connect();
             PreparedStatement statement = connection.prepareStatement(query)) {
            if (connection == null) {
                System.err.println("Database connection failed.");
                return jadwalList; 
            }
            statement.setString(1, "%" + namaKelas + "%");
            try (ResultSet resultSet = statement.executeQuery()) {
                while (resultSet.next()) {
                    int kodeMK = resultSet.getInt("kode_MK");
                    int kodeDosen = resultSet.getInt("kode_dosen");
                    int kodeKelas = resultSet.getInt("kode_kelas");
                    String namaDosen = resultSet.getString("nama_dosen");
                    String namaMK = resultSet.getString("nama_MK");
                    namaKelas = resultSet.getString("nama_kelas");
                    String hari = resultSet.getString("hari");
                    Time jamMulai = resultSet.getTime("jam_mulai");
                    Time jamBerakhir = resultSet.getTime("jam_berakhir");

                    Jadwal jadwal = new Jadwal(kodeDosen, namaDosen, kodeMK, namaMK, kodeKelas, namaKelas, hari, jamMulai, jamBerakhir);
                    jadwalList.add(jadwal);
                }
            }
        } catch (SQLException e) {
            System.err.println("Error fetching jadwal data by nama kelas");
            e.printStackTrace();
        }
        return jadwalList;
    }
    
    public List<Jadwal> getJadwalByNamaMK(String namaMK) {
        List<Jadwal> jadwalList = new ArrayList<>();
        String query = "SELECT j.kode_dosen, d.nama_dosen, j.kode_MK, mk.nama_MK, j.kode_kelas, k.nama_kelas, j.hari, j.jam_mulai, j.jam_berakhir "
                     + "FROM jadwal j "
                     + "LEFT JOIN dosen d ON j.kode_dosen = d.kode_dosen "
                     + "LEFT JOIN matakuliah mk ON j.kode_MK = mk.kode_MK "
                     + "LEFT JOIN kelas k ON j.kode_kelas = k.kode_kelas "
                     + "WHERE mk.nama_MK LIKE ?";
        try (Connection connection = ConnectDB.connect();
             PreparedStatement statement = connection.prepareStatement(query)) {
            if (connection == null) {
                System.err.println("Database connection failed.");
                return jadwalList; 
            }
            statement.setString(1, "%" + namaMK + "%");
            try (ResultSet resultSet = statement.executeQuery()) {
                while (resultSet.next()) {
                    int kodeMK = resultSet.getInt("kode_MK");
                    int kodeDosen = resultSet.getInt("kode_dosen");
                    int kodeKelas = resultSet.getInt("kode_kelas");
                    String namaDosen = resultSet.getString("nama_dosen");
                    namaMK = resultSet.getString("nama_MK");
                    String namaKelas = resultSet.getString("nama_kelas");
                    String hari = resultSet.getString("hari");
                    Time jamMulai = resultSet.getTime("jam_mulai");
                    Time jamBerakhir = resultSet.getTime("jam_berakhir");

                    Jadwal jadwal = new Jadwal(kodeDosen, namaDosen, kodeMK, namaMK, kodeKelas, namaKelas, hari, jamMulai, jamBerakhir);
                    jadwalList.add(jadwal);
                }
            }
        } catch (SQLException e) {
            System.err.println("Error fetching jadwal data by nama mata kuliah");
            e.printStackTrace();
        }
        return jadwalList;
    }
    
    // Cek apakah kodeDosen ada di database
    public boolean isDosenExist(int kodeDosen) {
        Connection connection = ConnectDB.connect();
        if (connection != null) {
            String query = "SELECT COUNT(*) FROM dosen WHERE kode_Dosen = ?";
            try (PreparedStatement preparedStatement = connection.prepareStatement(query)) {
                preparedStatement.setInt(1, kodeDosen);
                try (ResultSet resultSet = preparedStatement.executeQuery()) {
                    if (resultSet.next() && resultSet.getInt(1) > 0) {
                        return true;
                    }
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return false;
    }

    // Cek apakah kodeMK ada di database
    public boolean isMKExist(int kodeMK) {
        Connection connection = ConnectDB.connect();
        if (connection != null) {
            String query = "SELECT COUNT(*) FROM matakuliah WHERE kode_MK = ?";
            try (PreparedStatement preparedStatement = connection.prepareStatement(query)) {
                preparedStatement.setInt(1, kodeMK);
                try (ResultSet resultSet = preparedStatement.executeQuery()) {
                    if (resultSet.next() && resultSet.getInt(1) > 0) {
                        return true;
                    }
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return false;
    }

    // Cek apakah kodeKelas ada di database
    public boolean isKelasExist(int kodeKelas) {
        Connection connection = ConnectDB.connect();
        if (connection != null) {
            String query = "SELECT COUNT(*) FROM kelas WHERE kode_Kelas = ?";
            try (PreparedStatement preparedStatement = connection.prepareStatement(query)) {
                preparedStatement.setInt(1, kodeKelas);
                try (ResultSet resultSet = preparedStatement.executeQuery()) {
                    if (resultSet.next() && resultSet.getInt(1) > 0) {
                        return true;
                    }
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return false;
    }
    
    public Jadwal getJadwalByMKAndKelas(int kodeMK, int kodeKelas) {
        String query = "SELECT kode_dosen, kode_MK, kode_kelas, hari, jam_mulai, jam_berakhir "
                     + "FROM jadwal "
                     + "WHERE kode_MK = ? AND kode_kelas = ?";

        try (Connection connection = ConnectDB.connect();
             PreparedStatement statement = connection.prepareStatement(query)) {

            if (connection == null) {
                System.err.println("Database connection failed.");
                return null; 
            }

            // Set parameters for the prepared statement
            statement.setInt(1, kodeMK);
            statement.setInt(2, kodeKelas);

            try (ResultSet resultSet = statement.executeQuery()) {
                // If there is a result, create a Jadwal object and return it
                if (resultSet.next()) {
                    int kodeDosen = resultSet.getInt("kode_dosen");
                    String hari = resultSet.getString("hari");
                    Time jamMulai = resultSet.getTime("jam_mulai");
                    Time jamBerakhir = resultSet.getTime("jam_berakhir");

                    // Create and return a Jadwal object
                    return new Jadwal(kodeDosen, kodeMK, kodeKelas, hari, jamMulai, jamBerakhir);
                }
            }
        } catch (SQLException e) {
            System.err.println("Error fetching jadwal data for kodeMK: " + kodeMK + ", kodeKelas: " + kodeKelas);
            e.printStackTrace();
        }

        // Return null if no data is found or an error occurs
        return null;
    }


}
