/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.kampusku.ui;

import java.awt.*;
import javax.swing.*;
import com.kampusku.ui.component.GreenBtn;
import java.awt.event.*;
import static com.kampusku.controller.LoginController.auth;

/**
 *
 * @author ACER
 */
public class LoginFrame extends javax.swing.JFrame {

    /**
     * Creates new form LoginFrame
     */
    public LoginFrame() {
        setTitle("KampusKu Login");
        setSize(500, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null); // Menggunakan null layout untuk posisi bebas
        setResizable(false);
        setLocationRelativeTo(null); // Menempatkan JFrame di tengah layar
        setUndecorated(true); // Menghilangkan bar judul dan border

        // Panel background dengan gambar
        JPanel backgroundPanel = new JPanel() {
            Image background = new ImageIcon("src/main/resources/images/bg-login.png").getImage();

            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.drawImage(background, 0, 0, getWidth(), getHeight(), this);
            }
        };

        backgroundPanel.setBounds(0, 0, 500, 300);
        backgroundPanel.setLayout(null); // Layout bebas untuk menempatkan komponen

        // Komponen username field
        JTextField usernameField = new JTextField();
        usernameField.setBounds(75, 115, 170, 30);
        usernameField.setOpaque(false);
        usernameField.setBorder(BorderFactory.createEmptyBorder());
        backgroundPanel.add(usernameField);

        // Komponen password field
        JPasswordField passwordField = new JPasswordField();
        passwordField.setBounds(75, 160, 170, 30);
        passwordField.setOpaque(false);
        passwordField.setBorder(BorderFactory.createEmptyBorder());
        backgroundPanel.add(passwordField);

        // Tombol login
        GreenBtn btnLogin = new GreenBtn("Login");
        btnLogin.setBackground(new Color(40, 167, 69));
        btnLogin.setForeground(Color.WHITE);
        btnLogin.setBounds(75, 240, 170, 30);
        backgroundPanel.add(btnLogin);

        // Label error untuk menampilkan pesan
        JLabel errLabel = new JLabel();
        errLabel.setBounds(30, 200, 250, 30);
        errLabel.setForeground(Color.RED);
        errLabel.setHorizontalAlignment(SwingConstants.CENTER);
        backgroundPanel.add(errLabel);

        // Event listener untuk tombol login
        btnLogin.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String username = usernameField.getText();
                String password = new String(passwordField.getPassword());

                if (username.isEmpty() || password.isEmpty()) {
                    errLabel.setText("Isi semua field untuk login.");
                } else {
                    if (auth(username, password)) {
                        new DashboardFrame().setVisible(true);
                        dispose(); // Menutup LoginFrame
                    } else {
                        errLabel.setText("Username atau password salah.");
                        usernameField.setText("");
                        passwordField.setText("");
                    }
                }
            }
        });
        
        // Tambahkan JLabel untuk tombol X menutup aplikasi
        JLabel lblClose = new JLabel("X");
        lblClose.setBounds(470, 0, 30, 30); // Posisi tombol di pojok kanan atas
        lblClose.setForeground(Color.BLACK); // Warna teks awalnya hitam
        lblClose.setHorizontalAlignment(SwingConstants.CENTER);
        lblClose.setVerticalAlignment(SwingConstants.CENTER);
        lblClose.setOpaque(true);

        // Menambahkan MouseListener untuk hover effect
        lblClose.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                lblClose.setForeground(Color.WHITE); // Mengubah warna teks menjadi putih saat dihover
                lblClose.setBackground(Color.RED); // Mengubah background menjadi merah saat dihover
            }

            @Override
            public void mouseExited(MouseEvent e) {
                lblClose.setForeground(Color.BLACK); // Mengembalikan warna teks ke hitam
                lblClose.setBackground(null); // Mengembalikan background ke null
            }
        });

        // Menambahkan event listener untuk label "X"
        lblClose.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                System.exit(0); // Menutup aplikasi
            }
        });


        backgroundPanel.add(lblClose);

        // Tambahkan panel background ke frame
        add(backgroundPanel);

        setVisible(true);
    
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        new LoginFrame();
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
