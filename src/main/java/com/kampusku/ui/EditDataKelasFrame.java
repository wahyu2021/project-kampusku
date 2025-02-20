/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.kampusku.ui;

import com.kampusku.dao.KelasDAO;
import com.kampusku.model.Kelas;
import java.awt.Color;

/**
 *
 * @author ACER
 */
public class EditDataKelasFrame extends javax.swing.JFrame {

    /**
     * Creates new form EditJadwalFrame
     */
    public EditDataKelasFrame(int data1) {
        initComponents();
        setLocationRelativeTo(null);
        loadDataKelas(data1);
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
        kodeKelasField = new javax.swing.JTextField();
        namaKelasField = new javax.swing.JTextField();
        btnSimpan = new javax.swing.JButton();
        backLabel = new javax.swing.JLabel();
        errLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(239, 243, 234));
        setMinimumSize(new java.awt.Dimension(600, 500));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(239, 243, 234));

        jLabel1.setFont(new java.awt.Font("Poppins Medium", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setText("DATA DATA KELAS");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(136, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(134, 134, 134))
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

        jLabel2.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setText("Kode Kelas");

        jLabel3.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 51));
        jLabel3.setText("Nama Kelas");

        kodeKelasField.setEnabled(false);

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

        backLabel.setForeground(new java.awt.Color(51, 51, 51));
        backLabel.setText("<< BACK");
        backLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backLabelMouseClicked(evt);
            }
        });

        errLabel.setForeground(new java.awt.Color(255, 51, 51));
        errLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        errLabel.setMinimumSize(new java.awt.Dimension(300, 20));
        errLabel.setPreferredSize(new java.awt.Dimension(300, 20));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(162, 162, 162)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(kodeKelasField)
                            .addComponent(namaKelasField, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(53, 53, 53)
                                .addComponent(btnSimpan, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(244, 244, 244)
                        .addComponent(jLabel2))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(241, 241, 241)
                        .addComponent(jLabel3))
                    .addComponent(backLabel)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(89, 89, 89)
                        .addComponent(errLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(101, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(77, 77, 77)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(kodeKelasField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(namaKelasField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(btnSimpan, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52)
                .addComponent(errLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 101, Short.MAX_VALUE)
                .addComponent(backLabel))
        );

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
                new DaftarKelasFrame().setVisible(true);
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
        new DaftarKelasFrame().setVisible(true);
        dispose();
    }//GEN-LAST:event_backLabelMouseClicked

    private boolean ambilDataForm(){
        int kodeKelas = Integer.parseInt(kodeKelasField.getText());
        String namaKelas = namaKelasField.getText();
        
        Kelas kelas = new Kelas(kodeKelas, namaKelas);
        KelasDAO kelasDAO = new KelasDAO();
        
        return kelasDAO.updateKelas(kelas);
    }
    
    private boolean validasiInput(){
        String kodeKelas = kodeKelasField.getText();
        String namaKelas = namaKelasField.getText();
        
        if(kodeKelas.isEmpty() || namaKelas.isEmpty()){
            errLabel.setText("Isi semua input!!!");
            errLabel.setForeground(Color.RED);
            errLabel.setVisible(true);
            return false;
        }
        
        return true;
    }
    
    private void loadDataKelas(int kodeKelas) {
        // Assuming you have a DAO class for Mata Kuliah (MK) and it has a method getMKByKodeMK
        KelasDAO kelasDAO = new KelasDAO();
        Kelas kelas = kelasDAO.getOneKelas(kodeKelas);

        if (kelas != null) {
            // Set the data to your form fields (assuming MataKuliah class has appropriate getter methods)
            kodeKelasField.setText(String.valueOf(kelas.getKodeKelas()));
            namaKelasField.setText(kelas.getNamaKelas());
        } else {
            // Handle the case where no data is found
            errLabel.setText("Mata Kuliah tidak ditemukan.");
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
    private javax.swing.JLabel errLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField kodeKelasField;
    private javax.swing.JTextField namaKelasField;
    // End of variables declaration//GEN-END:variables
}
