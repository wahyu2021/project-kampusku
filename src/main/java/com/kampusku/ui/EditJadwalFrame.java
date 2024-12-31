/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.kampusku.ui;

import com.kampusku.dao.JadwalDAO;
import com.kampusku.model.Jadwal;
import java.awt.Color;

/**
 *
 * @author ACER
 */
public class EditJadwalFrame extends javax.swing.JFrame {
    /**
     * Creates new form EditJadwalFrame
     * @param data1
     * @param data2
     */
    public EditJadwalFrame(int data1, int data2) {
        initComponents();
        setLocationRelativeTo(null);
        loadDataJadwal(data1, data2);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        kodeDosenField = new javax.swing.JTextField();
        kodeMKField = new javax.swing.JTextField();
        kodeKelasField = new javax.swing.JTextField();
        cmbHari = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        waktuMulaiJam = new javax.swing.JSpinner();
        waktuMulaiMenit = new javax.swing.JSpinner();
        jLabel11 = new javax.swing.JLabel();
        waktuBerakhirJam = new javax.swing.JSpinner();
        jLabel12 = new javax.swing.JLabel();
        waktuBerakhirMenit = new javax.swing.JSpinner();
        btnSimpan = new javax.swing.JButton();
        errLabel = new javax.swing.JLabel();
        backLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(239, 243, 234));
        setMinimumSize(new java.awt.Dimension(600, 500));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(239, 243, 234));

        jLabel1.setFont(new java.awt.Font("Poppins Medium", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setText("EDIT JADWAL");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(190, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(167, 167, 167))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(9, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 70));

        jPanel2.setBackground(new java.awt.Color(239, 243, 234));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setText("Kode Dosen");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 40, -1, -1));

        jLabel3.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 51));
        jLabel3.setText("Kode MK");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 100, -1, -1));

        jLabel4.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 51, 51));
        jLabel4.setText("Kode Kelas");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 150, -1, -1));
        jPanel2.add(kodeDosenField, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 70, 170, -1));
        jPanel2.add(kodeMKField, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 130, 170, -1));
        jPanel2.add(kodeKelasField, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 180, 170, -1));

        cmbHari.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Senin", "Selasa", "Rabu", "Kamis", "Jumat", "Sabtu" }));
        jPanel2.add(cmbHari, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 70, 108, -1));

        jLabel8.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(51, 51, 51));
        jLabel8.setText("Hari");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 40, -1, -1));

        jLabel9.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(51, 51, 51));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Waktu Mulai");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 100, 102, -1));

        jLabel10.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(51, 51, 51));
        jLabel10.setText("Waktu Berakhir");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 160, -1, -1));

        waktuMulaiJam.setModel(new javax.swing.SpinnerNumberModel(0, 0, 23, 1));
        jPanel2.add(waktuMulaiJam, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 130, 45, -1));

        waktuMulaiMenit.setModel(new javax.swing.SpinnerNumberModel(0, 0, 59, 1));
        jPanel2.add(waktuMulaiMenit, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 130, 45, -1));

        jLabel11.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(51, 51, 51));
        jLabel11.setText(":");
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 130, -1, -1));

        waktuBerakhirJam.setModel(new javax.swing.SpinnerNumberModel(0, 0, 23, 1));
        jPanel2.add(waktuBerakhirJam, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 190, 45, -1));

        jLabel12.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(51, 51, 51));
        jLabel12.setText(":");
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 190, -1, -1));

        waktuBerakhirMenit.setModel(new javax.swing.SpinnerNumberModel(0, 0, 59, 1));
        jPanel2.add(waktuBerakhirMenit, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 190, 45, -1));

        btnSimpan.setBackground(new java.awt.Color(51, 204, 0));
        btnSimpan.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        btnSimpan.setForeground(new java.awt.Color(255, 255, 255));
        btnSimpan.setText("Simpan");
        btnSimpan.setMargin(new java.awt.Insets(2, 5, 2, 5));
        btnSimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSimpanActionPerformed(evt);
            }
        });
        jPanel2.add(btnSimpan, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 240, 122, 30));

        errLabel.setForeground(new java.awt.Color(255, 51, 51));
        errLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        errLabel.setMinimumSize(new java.awt.Dimension(300, 20));
        errLabel.setPreferredSize(new java.awt.Dimension(300, 20));
        jPanel2.add(errLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 310, 410, -1));

        backLabel.setForeground(new java.awt.Color(51, 51, 51));
        backLabel.setText("<< BACK");
        backLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backLabelMouseClicked(evt);
            }
        });
        jPanel2.add(backLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 410, 54, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 600, 430));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSimpanActionPerformed
        // TODO add your handling code here:
        if(validasiInput()){
            if(ambilDataForm()){
                errLabel.setText("Data berhasil disimpan");
                errLabel.setForeground(Color.GREEN);
                errLabel.setVisible(true);
                new JadwalKuliahFrame().setVisible(true);
                dispose();
            } else{
                errLabel.setText("Data gagal disimpan");
                errLabel.setForeground(Color.RED);
                errLabel.setVisible(true);
            }
        }
    }//GEN-LAST:event_btnSimpanActionPerformed

    private void backLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backLabelMouseClicked
        // TODO add your handling code here:
        new JadwalKuliahFrame().setVisible(true);
        dispose();
    }//GEN-LAST:event_backLabelMouseClicked
    
    private boolean ambilDataForm() {
        // Ambil data dari setiap field
        int kodeDosen = Integer.parseInt(kodeDosenField.getText());
        int kodeMK = Integer.parseInt(kodeMKField.getText());
        int kodeKelas = Integer.parseInt(kodeKelasField.getText());
        String hari = (String) cmbHari.getSelectedItem();

        // Ambil data dari JSpinner untuk waktu mulai
        int jamMulai = (Integer) waktuMulaiJam.getValue();
        int menitMulai = (Integer) waktuMulaiMenit.getValue();
        java.sql.Time waktuMulai = java.sql.Time.valueOf(String.format("%02d:%02d:00", jamMulai, menitMulai));

        // Ambil data dari JSpinner untuk waktu berakhir
        int jamBerakhir = (Integer) waktuBerakhirJam.getValue();
        int menitBerakhir = (Integer) waktuBerakhirMenit.getValue();
        java.sql.Time waktuBerakhir = java.sql.Time.valueOf(String.format("%02d:%02d:00", jamBerakhir, menitBerakhir));

        // Mengecek keberadaan kodeDosen, kodeMK, dan kodeKelas di database
        JadwalDAO jadwalDAO = new JadwalDAO();
        if (!jadwalDAO.isDosenExist(kodeDosen)) {
            errLabel.setText("Kode Dosen tidak ditemukan di database!");
            errLabel.setForeground(Color.RED);
            errLabel.setVisible(true);
            return false;
        }
        if (!jadwalDAO.isMKExist(kodeMK)) {
            errLabel.setText("Kode Mata Kuliah tidak ditemukan di database!");
            errLabel.setForeground(Color.RED);
            errLabel.setVisible(true);
            return false;
        }
        if (!jadwalDAO.isKelasExist(kodeKelas)) {
            errLabel.setText("Kode Kelas tidak ditemukan di database!");
            errLabel.setForeground(Color.RED);
            errLabel.setVisible(true);
            return false;
        }

        // Simpan ke dalam objek model jika semua data valid
        Jadwal jadwal = new Jadwal(kodeDosen, kodeMK, kodeKelas, hari, waktuMulai, waktuBerakhir);
        return jadwalDAO.updateJadwal(jadwal);
    }
    
    private boolean validasiInput() {
         // Periksa apakah field kode dosen kosong atau bukan angka
        if (kodeDosenField.getText().isEmpty()) {
            errLabel.setText("Kode Dosen tidak boleh kosong!");
            errLabel.setForeground(Color.RED);
            errLabel.setVisible(true);
            return false;
        }
        try {
            Integer.valueOf(kodeDosenField.getText());
        } catch (NumberFormatException e) {
            errLabel.setText("Kode Dosen harus berupa angka!");
            errLabel.setForeground(Color.RED);
            errLabel.setVisible(true);
            return false;
        }

        // Periksa apakah field kode MK kosong atau bukan angka
        if (kodeMKField.getText().isEmpty()) {
            errLabel.setText("Kode MK tidak boleh kosong!");
            errLabel.setForeground(Color.RED);
            errLabel.setVisible(true);
            return false;
        }
        try {
            Integer.valueOf(kodeMKField.getText());
        } catch (NumberFormatException e) {
            errLabel.setText("Kode MK harus berupa angka!");
            errLabel.setForeground(Color.RED);
            errLabel.setVisible(true);
            return false;
        }

        // Periksa apakah field kode kelas kosong atau bukan angka
        if (kodeKelasField.getText().isEmpty()) {
            errLabel.setText("Kode Kelas tidak boleh kosong!");
            errLabel.setForeground(Color.RED);
            errLabel.setVisible(true);
            return false;
        }
        try {
            Integer.valueOf(kodeKelasField.getText());
        } catch (NumberFormatException e) {
            errLabel.setText("Kode Kelas harus berupa angka!");
            errLabel.setForeground(Color.RED);
            errLabel.setVisible(true);
            return false;
        }

        // Periksa apakah hari sudah dipilih
        if (cmbHari.getSelectedItem() == null || cmbHari.getSelectedItem().toString().isEmpty()) {
            errLabel.setText("Hari harus dipilih!");
            errLabel.setForeground(Color.RED);
            errLabel.setVisible(true);
            return false;
        }

        // Periksa apakah waktu mulai valid
        int jamMulai = (Integer) waktuMulaiJam.getValue();
        int menitMulai = (Integer) waktuMulaiMenit.getValue();
        if (jamMulai < 0 || jamMulai > 23 || menitMulai < 0 || menitMulai > 59) {
            errLabel.setText("Waktu mulai tidak valid!");
            errLabel.setForeground(Color.RED);
            errLabel.setVisible(true);
            return false;
        }

        // Periksa apakah waktu berakhir valid
        int jamBerakhir = (Integer) waktuBerakhirJam.getValue();
        int menitBerakhir = (Integer) waktuBerakhirMenit.getValue();
        if (jamBerakhir < 0 || jamBerakhir > 23 || menitBerakhir < 0 || menitBerakhir > 59) {
            errLabel.setText("Waktu berakhir tidak valid!");
            errLabel.setForeground(Color.RED);
            errLabel.setVisible(true);
            return false;
        }

        // Periksa apakah waktu berakhir setelah waktu mulai
        if ((jamMulai > jamBerakhir) || (jamMulai == jamBerakhir && menitMulai >= menitBerakhir)) {
            errLabel.setText("Waktu berakhir harus setelah waktu mulai!");
            errLabel.setForeground(Color.RED);
            errLabel.setVisible(true);
            return false;
        }

        // Semua input valid
        return true;
    }
    
    private void loadDataJadwal(int data1, int data2) {
        JadwalDAO jadwalDAO = new JadwalDAO();
        Jadwal jadwal = jadwalDAO.getJadwalByMKAndKelas(data1, data2);

        if (jadwal != null) {
            // Ambil jam dan menit dari waktu mulai
            int jamMulai = jadwal.getJamMulai().toLocalTime().getHour();
            int menitMulai = jadwal.getJamMulai().toLocalTime().getMinute();

            // Ambil jam dan menit dari waktu berakhir
            int jamBerakhir = jadwal.getJamBerakhir().toLocalTime().getHour();
            int menitBerakhir = jadwal.getJamBerakhir().toLocalTime().getMinute();

            // Set nilai pada spinner untuk waktu mulai
            waktuMulaiJam.setValue(jamMulai);
            waktuMulaiMenit.setValue(menitMulai);

            // Set nilai pada spinner untuk waktu berakhir
            waktuBerakhirJam.setValue(jamBerakhir);
            waktuBerakhirMenit.setValue(menitBerakhir);
            
            kodeMKField.setText(String.valueOf(jadwal.getKodeMK()));
            kodeDosenField.setText(String.valueOf(jadwal.getKodeDosen()));
            kodeKelasField.setText(String.valueOf(jadwal.getKodeKelas()));

        } else {
            // Tampilkan pesan jika data jadwal tidak ditemukan
            errLabel.setText("Jadwal tidak ditemukan.");
            errLabel.setForeground(Color.RED);
            errLabel.setVisible(true);
        }
    }



    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel backLabel;
    private javax.swing.JButton btnSimpan;
    private javax.swing.JComboBox<String> cmbHari;
    private javax.swing.JLabel errLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField kodeDosenField;
    private javax.swing.JTextField kodeKelasField;
    private javax.swing.JTextField kodeMKField;
    private javax.swing.JSpinner waktuBerakhirJam;
    private javax.swing.JSpinner waktuBerakhirMenit;
    private javax.swing.JSpinner waktuMulaiJam;
    private javax.swing.JSpinner waktuMulaiMenit;
    // End of variables declaration//GEN-END:variables
}
