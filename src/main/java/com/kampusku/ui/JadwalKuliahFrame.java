/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.kampusku.ui;

import com.kampusku.dao.JadwalDAO;
import com.kampusku.model.Jadwal;
import java.awt.Color;
import java.util.List;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ACER
 */
public class JadwalKuliahFrame extends javax.swing.JFrame {

    /**
     * Creates new form DashboardFrame
     */
    public JadwalKuliahFrame() {
        initComponents();
        setLocationRelativeTo(null);
        loadDataJadwal();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        sidebar = new javax.swing.JPanel();
        navJadwalKuliah = new javax.swing.JLabel();
        navDashboard = new javax.swing.JLabel();
        navDaftarMK = new javax.swing.JLabel();
        navLogout = new javax.swing.JLabel();
        navDaftarKelas = new javax.swing.JLabel();
        navDataMhs = new javax.swing.JLabel();
        header = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        main = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tableJadwalKuliah = new javax.swing.JTable();
        searchField = new javax.swing.JTextField();
        btnSearch = new javax.swing.JButton();
        rbDosen = new javax.swing.JRadioButton();
        rbMK = new javax.swing.JRadioButton();
        rbKelas = new javax.swing.JRadioButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        kodeMKField = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        kodeKelasField = new javax.swing.JTextField();
        btnHapusJadwal = new javax.swing.JButton();
        btnEditJadwal = new javax.swing.JButton();
        btnTambahJadwal = new javax.swing.JButton();
        jOptionPane = new javax.swing.JOptionPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Dashboard");
        setBackground(new java.awt.Color(204, 204, 204));
        setMinimumSize(new java.awt.Dimension(800, 600));
        setName("Kampusku - Dahsboard"); // NOI18N
        setUndecorated(true);
        setResizable(false);
        setSize(new java.awt.Dimension(800, 600));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        sidebar.setBackground(new java.awt.Color(124, 68, 79));
        sidebar.setPreferredSize(new java.awt.Dimension(200, 230));

        navJadwalKuliah.setFont(new java.awt.Font("Poppins Medium", 0, 16)); // NOI18N
        navJadwalKuliah.setForeground(new java.awt.Color(255, 255, 255));
        navJadwalKuliah.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        navJadwalKuliah.setText("Jadwal Kuliah");
        navJadwalKuliah.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        navJadwalKuliah.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                navJadwalKuliahMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                navJadwalKuliahMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                navJadwalKuliahMouseExited(evt);
            }
        });

        navDashboard.setFont(new java.awt.Font("Poppins Medium", 0, 16)); // NOI18N
        navDashboard.setForeground(new java.awt.Color(204, 204, 204));
        navDashboard.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        navDashboard.setText("Dashboard");
        navDashboard.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        navDashboard.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                navDashboardMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                navDashboardMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                navDashboardMouseExited(evt);
            }
        });

        navDaftarMK.setFont(new java.awt.Font("Poppins Medium", 0, 16)); // NOI18N
        navDaftarMK.setForeground(new java.awt.Color(204, 204, 204));
        navDaftarMK.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        navDaftarMK.setText("Daftar MK");
        navDaftarMK.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        navDaftarMK.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                navDaftarMKMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                navDaftarMKMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                navDaftarMKMouseExited(evt);
            }
        });

        navLogout.setFont(new java.awt.Font("Poppins Medium", 0, 16)); // NOI18N
        navLogout.setForeground(new java.awt.Color(204, 204, 204));
        navLogout.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        navLogout.setText("Logout");
        navLogout.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        navLogout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                navLogoutMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                navLogoutMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                navLogoutMouseExited(evt);
            }
        });

        navDaftarKelas.setFont(new java.awt.Font("Poppins Medium", 0, 16)); // NOI18N
        navDaftarKelas.setForeground(new java.awt.Color(204, 204, 204));
        navDaftarKelas.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        navDaftarKelas.setText("Daftar Kelas");
        navDaftarKelas.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        navDaftarKelas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                navDaftarKelasMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                navDaftarKelasMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                navDaftarKelasMouseExited(evt);
            }
        });

        navDataMhs.setFont(new java.awt.Font("Poppins Medium", 0, 16)); // NOI18N
        navDataMhs.setForeground(new java.awt.Color(204, 204, 204));
        navDataMhs.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        navDataMhs.setText("Data Mahasiswa");
        navDataMhs.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        navDataMhs.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                navDataMhsMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                navDataMhsMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                navDataMhsMouseExited(evt);
            }
        });

        javax.swing.GroupLayout sidebarLayout = new javax.swing.GroupLayout(sidebar);
        sidebar.setLayout(sidebarLayout);
        sidebarLayout.setHorizontalGroup(
            sidebarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sidebarLayout.createSequentialGroup()
                .addContainerGap(31, Short.MAX_VALUE)
                .addGroup(sidebarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, sidebarLayout.createSequentialGroup()
                        .addGroup(sidebarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, sidebarLayout.createSequentialGroup()
                                .addGroup(sidebarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(navDaftarKelas, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(navDaftarMK, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(navJadwalKuliah)
                                    .addComponent(navDashboard, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(13, 13, 13))
                            .addComponent(navDataMhs, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(24, 24, 24))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, sidebarLayout.createSequentialGroup()
                        .addComponent(navLogout, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37))))
        );
        sidebarLayout.setVerticalGroup(
            sidebarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sidebarLayout.createSequentialGroup()
                .addContainerGap(186, Short.MAX_VALUE)
                .addComponent(navDashboard)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(navJadwalKuliah)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(navDaftarMK)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(navDaftarKelas)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(navDataMhs)
                .addGap(192, 192, 192)
                .addComponent(navLogout)
                .addGap(24, 24, 24))
        );

        getContentPane().add(sidebar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 190, 600));

        header.setBackground(new java.awt.Color(239, 243, 234));

        jLabel6.setBackground(new java.awt.Color(239, 243, 234));
        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 51, 51));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("JADWAL KULIAH");
        jLabel6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel6.setOpaque(true);

        javax.swing.GroupLayout headerLayout = new javax.swing.GroupLayout(header);
        header.setLayout(headerLayout);
        headerLayout.setHorizontalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 555, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(35, Short.MAX_VALUE))
        );
        headerLayout.setVerticalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, headerLayout.createSequentialGroup()
                .addContainerGap(10, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addContainerGap())
        );

        getContentPane().add(header, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 0, 620, 60));

        main.setBackground(new java.awt.Color(239, 243, 234));
        main.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tableJadwalKuliah.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, ""},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Kode Dosen", "Dosen Pengampuh", "Kode MK", "Mata Kuliah", "Kode Kelas", "Kelas", "Waktu"
            }
        ));
        jScrollPane2.setViewportView(tableJadwalKuliah);

        main.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(36, 98, 542, 300));
        main.add(searchField, new org.netbeans.lib.awtextra.AbsoluteConstraints(122, 63, 181, -1));

        btnSearch.setBackground(new java.awt.Color(51, 204, 0));
        btnSearch.setForeground(new java.awt.Color(255, 255, 255));
        btnSearch.setText("Search");
        btnSearch.setMargin(new java.awt.Insets(2, 5, 2, 5));
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });
        main.add(btnSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(309, 63, -1, -1));

        rbDosen.setForeground(new java.awt.Color(51, 51, 51));
        rbDosen.setText("Dosen");
        main.add(rbDosen, new org.netbeans.lib.awtextra.AbsoluteConstraints(374, 64, -1, -1));

        rbMK.setForeground(new java.awt.Color(51, 51, 51));
        rbMK.setText("Mata Kuliah");
        main.add(rbMK, new org.netbeans.lib.awtextra.AbsoluteConstraints(436, 64, -1, -1));

        rbKelas.setForeground(new java.awt.Color(51, 51, 51));
        rbKelas.setText("Kelas");
        main.add(rbKelas, new org.netbeans.lib.awtextra.AbsoluteConstraints(528, 64, -1, -1));

        jLabel2.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setText("Searching");
        main.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 64, -1, -1));

        jLabel3.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 51));
        jLabel3.setText("Kode MK");
        main.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 410, -1, 12));
        main.add(kodeMKField, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 430, 181, -1));

        jLabel5.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 51, 51));
        jLabel5.setText("Kode Kelas");
        main.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 410, -1, 12));
        main.add(kodeKelasField, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 430, 181, -1));

        btnHapusJadwal.setBackground(new java.awt.Color(220, 76, 100));
        btnHapusJadwal.setFont(new java.awt.Font("Poppins Medium", 0, 12)); // NOI18N
        btnHapusJadwal.setForeground(new java.awt.Color(255, 255, 255));
        btnHapusJadwal.setText("Hapus Jadwal");
        btnHapusJadwal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHapusJadwalActionPerformed(evt);
            }
        });
        main.add(btnHapusJadwal, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 470, -1, -1));

        btnEditJadwal.setBackground(new java.awt.Color(228, 161, 27));
        btnEditJadwal.setFont(new java.awt.Font("Poppins Medium", 0, 12)); // NOI18N
        btnEditJadwal.setForeground(new java.awt.Color(255, 255, 255));
        btnEditJadwal.setText("Edit Jadwal");
        btnEditJadwal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditJadwalActionPerformed(evt);
            }
        });
        main.add(btnEditJadwal, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 470, -1, -1));

        btnTambahJadwal.setBackground(new java.awt.Color(59, 113, 202));
        btnTambahJadwal.setFont(new java.awt.Font("Poppins Medium", 0, 12)); // NOI18N
        btnTambahJadwal.setForeground(new java.awt.Color(255, 255, 255));
        btnTambahJadwal.setText("Tambah Jadwal Kuliah");
        btnTambahJadwal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTambahJadwalActionPerformed(evt);
            }
        });
        main.add(btnTambahJadwal, new org.netbeans.lib.awtextra.AbsoluteConstraints(409, 31, -1, -1));
        main.add(jOptionPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 200, -1, -1));

        getContentPane().add(main, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 50, 620, 550));

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void loadDataJadwal() {
        // Mengambil semua data jadwal dari database
        JadwalDAO jadwalDAO = new JadwalDAO();
        List<Jadwal> jadwalList = jadwalDAO.getAllJadwal();
        // Memuat data ke tabel
        updateTableData(jadwalList);
    }

    private void handleSearch() {
        String keyword = searchField.getText();
        List<Jadwal> results = null;

        // Memilih metode pencarian berdasarkan radio button yang dipilih
        if (rbDosen.isSelected()) {
            results = getJadwalByNamaDosen(keyword);
        } else if (rbMK.isSelected()) {
            results = getJadwalByNamaMK(keyword);
        } else if (rbKelas.isSelected()) {
            results = getJadwalByNamaKelas(keyword);
        } else {
            jOptionPane.showMessageDialog(this, "Pilih filter pencarian!", "Error", jOptionPane.ERROR_MESSAGE);
            return;
        }

        // Jika hasil pencarian ditemukan, tampilkan di tabel
        if (results != null && !results.isEmpty()) {
            updateTableData(results);
        } else {
            jOptionPane.showMessageDialog(this, "Tidak ada data yang ditemukan!", "Informasi", jOptionPane.INFORMATION_MESSAGE);
            // Opsional: Kosongkan tabel jika tidak ada hasil
            updateTableData(List.of());
        }
    }

    private void updateTableData(List<Jadwal> jadwalList) {
        // Mendapatkan model tabel
        DefaultTableModel model = (DefaultTableModel) tableJadwalKuliah.getModel();

        // Menghapus data lama di tabel
        model.setRowCount(0);

        // Menambahkan data baru ke tabel
        for (Jadwal jadwal : jadwalList) {
            model.addRow(new Object[]{
                jadwal.getKodeDosen(),
                jadwal.getNamaDosen(),
                jadwal.getKodeMK(),
                jadwal.getNamaMK(),
                jadwal.getKodeKelas(),
                jadwal.getNamaKelas(),
                jadwal.getWaktu()
            });
        }
    }

    // metode pencarian berdasarkan filter
    private List<Jadwal> getJadwalByNamaDosen(String namaDosen) {
        JadwalDAO jadwalDAO = new JadwalDAO();
        return jadwalDAO.getJadwalByNamaDosen(namaDosen);
    }

    private List<Jadwal> getJadwalByNamaMK(String namaMK) {
        JadwalDAO jadwalDAO = new JadwalDAO();
        return jadwalDAO.getJadwalByNamaMK(namaMK);
    }

    private List<Jadwal> getJadwalByNamaKelas(String namaKelas) {
        JadwalDAO jadwalDAO = new JadwalDAO();
        return jadwalDAO.getJadwalByNamaKelas(namaKelas);
    }
    
    // navJadwalKuliah
    private void navJadwalKuliahMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_navJadwalKuliahMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_navJadwalKuliahMouseExited

    private void navJadwalKuliahMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_navJadwalKuliahMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_navJadwalKuliahMouseEntered

    // navDaftarMK
    private void navDaftarMKMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_navDaftarMKMouseEntered
        // TODO add your handling code here:
        navDaftarMK.setForeground(Color.WHITE);
    }//GEN-LAST:event_navDaftarMKMouseEntered

    private void navDaftarMKMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_navDaftarMKMouseExited
        // TODO add your handling code here:
        navDaftarMK.setForeground(new Color(204,204,204));
    }//GEN-LAST:event_navDaftarMKMouseExited

    //navDaftarKelas
    private void navDaftarKelasMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_navDaftarKelasMouseEntered
        // TODO add your handling code here:
        navDaftarKelas.setForeground(Color.WHITE);
    }//GEN-LAST:event_navDaftarKelasMouseEntered
    
    private void navDaftarKelasMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_navDaftarKelasMouseExited
        // TODO add your handling code here:
        navDaftarKelas.setForeground(new Color(204, 204, 204));
    }//GEN-LAST:event_navDaftarKelasMouseExited
    
    // navDataMhs
    private void navDataMhsMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_navDataMhsMouseEntered
        // TODO add your handling code here:
        navDataMhs.setForeground(Color.WHITE);
    }//GEN-LAST:event_navDataMhsMouseEntered

    private void navDataMhsMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_navDataMhsMouseExited
        // TODO add your handling code here:
        navDataMhs.setForeground(new Color(204, 204, 204));
    }//GEN-LAST:event_navDataMhsMouseExited
    
    // navLogout
    private void navLogoutMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_navLogoutMouseEntered
        // TODO add your handling code here:
        navLogout.setForeground(Color.WHITE);
    }//GEN-LAST:event_navLogoutMouseEntered

    private void navLogoutMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_navLogoutMouseExited
        // TODO add your handling code here:
        navLogout.setForeground(new Color(204, 204, 204));
    }//GEN-LAST:event_navLogoutMouseExited

    private void navLogoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_navLogoutMouseClicked
        // TODO add your handling code here:
        new LoginFrame().setVisible(true);
        dispose();
    }//GEN-LAST:event_navLogoutMouseClicked

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        // TODO add your handling code here:
        handleSearch();
    }//GEN-LAST:event_btnSearchActionPerformed

    private void btnHapusJadwalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHapusJadwalActionPerformed
        // TODO add your handling code here:
        // Mengambil nilai dari field
        String kodeMK = kodeMKField.getText();
        String kodeKelas = kodeKelasField.getText();

        // Mengecek apakah ada field yang kosong
        if (kodeMK.isEmpty() || kodeKelas.isEmpty()) {
            // Menampilkan pesan error jika ada field yang kosong
            jOptionPane.showMessageDialog(null, "Semua field harus diisi!", "Error", jOptionPane.ERROR_MESSAGE);
        } else {
            int kodeMKInt = Integer.parseInt(kodeMK);
            int kodeKelasInt = Integer.parseInt(kodeKelas);
            
            JadwalDAO jadwalDAO = new JadwalDAO();
            if(jadwalDAO.deleteJadwal(kodeMKInt, kodeKelasInt)){
                jOptionPane.showMessageDialog(null, "Data berhasil dihapus", "Success", jOptionPane.INFORMATION_MESSAGE);
                loadDataJadwal();
            } else{
                jOptionPane.showMessageDialog(null, "Data gagal dihapus", "Error", jOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_btnHapusJadwalActionPerformed

    private void navDashboardMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_navDashboardMouseClicked
        // TODO add your handling code here:
        new DashboardFrame().setVisible(true);
        dispose();
    }//GEN-LAST:event_navDashboardMouseClicked

    private void navDashboardMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_navDashboardMouseEntered
        // TODO add your handling code here:
        navDashboard.setForeground(Color.WHITE);
    }//GEN-LAST:event_navDashboardMouseEntered

    private void navDashboardMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_navDashboardMouseExited
        // TODO add your handling code here:
        navDashboard.setForeground(new Color(204, 204, 204));
    }//GEN-LAST:event_navDashboardMouseExited

    private void btnEditJadwalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditJadwalActionPerformed
        // TODO add your handling code here:
        // Mengambil nilai dari field
        String kodeMK = kodeMKField.getText();
        String kodeKelas = kodeKelasField.getText();

        // Mengecek apakah ada field yang kosong
        if (kodeMK.isEmpty() || kodeKelas.isEmpty()) {
            // Menampilkan pesan error jika ada field yang kosong
            jOptionPane.showMessageDialog(null, "Semua field harus diisi!", "Error", jOptionPane.ERROR_MESSAGE);
        } else {
            try {
                int kodeMKInt = Integer.parseInt(kodeMK);
                int kodeKelasInt = Integer.parseInt(kodeKelas);

                // Lanjutkan dengan membuka EditJadwalFrame
                EditJadwalFrame editJadwalFrame = new EditJadwalFrame(kodeMKInt, kodeKelasInt);
                editJadwalFrame.setVisible(true);
                dispose();
            } catch (NumberFormatException e) {
                jOptionPane.showMessageDialog(null, "Kode MK dan Kode Kelas harus berupa angka!", "Error", jOptionPane.ERROR_MESSAGE);
            }

        }
    }//GEN-LAST:event_btnEditJadwalActionPerformed

    private void btnTambahJadwalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTambahJadwalActionPerformed
        // TODO add your handling code here:
        new AddJadwalFrame().setVisible(true);
        dispose();
    }//GEN-LAST:event_btnTambahJadwalActionPerformed

    private void navJadwalKuliahMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_navJadwalKuliahMouseClicked
        // TODO add your handling code here:
        new JadwalKuliahFrame().setVisible(true);
        dispose();
    }//GEN-LAST:event_navJadwalKuliahMouseClicked

    private void navDaftarMKMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_navDaftarMKMouseClicked
        // TODO add your handling code here:
        new DaftarMKFrame().setVisible(true);
        dispose();
    }//GEN-LAST:event_navDaftarMKMouseClicked

    private void navDaftarKelasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_navDaftarKelasMouseClicked
        // TODO add your handling code here:
        new DaftarKelasFrame().setVisible(true);
        dispose();
    }//GEN-LAST:event_navDaftarKelasMouseClicked

    private void navDataMhsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_navDataMhsMouseClicked
        // TODO add your handling code here:
        new DataMhsFrame().setVisible(true);
        dispose();
    }//GEN-LAST:event_navDataMhsMouseClicked

    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(JadwalKuliahFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JadwalKuliahFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JadwalKuliahFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JadwalKuliahFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JadwalKuliahFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEditJadwal;
    private javax.swing.JButton btnHapusJadwal;
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton btnTambahJadwal;
    private javax.swing.JPanel header;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JOptionPane jOptionPane;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField kodeKelasField;
    private javax.swing.JTextField kodeMKField;
    private javax.swing.JPanel main;
    private javax.swing.JLabel navDaftarKelas;
    private javax.swing.JLabel navDaftarMK;
    private javax.swing.JLabel navDashboard;
    private javax.swing.JLabel navDataMhs;
    private javax.swing.JLabel navJadwalKuliah;
    private javax.swing.JLabel navLogout;
    private javax.swing.JRadioButton rbDosen;
    private javax.swing.JRadioButton rbKelas;
    private javax.swing.JRadioButton rbMK;
    private javax.swing.JTextField searchField;
    private javax.swing.JPanel sidebar;
    private javax.swing.JTable tableJadwalKuliah;
    // End of variables declaration//GEN-END:variables
}
