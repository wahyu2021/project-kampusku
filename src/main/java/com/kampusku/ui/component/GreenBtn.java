/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.kampusku.ui.component;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.Border;
/**
 *
 * @author ACER
 */
public class GreenBtn extends JButton {
    public GreenBtn(String text) {
        super(text);
        setContentAreaFilled(false); // Agar background tombol transparan
        setFocusPainted(false); // Menghilangkan border saat tombol mendapat fokus
        setBorder(BorderFactory.createEmptyBorder(10, 20, 10, 20)); // Menambahkan padding dalam tombol
    }

    @Override
    protected void paintComponent(Graphics g) {
        if (getModel().isPressed()) {
            g.setColor(new Color(30, 120, 45)); // Warna saat ditekan
        } else if (getModel().isRollover()) {
            g.setColor(new Color(35, 130, 50)); // Warna saat hover
        } else {
            g.setColor(getBackground()); // Warna default tombol
        }

        g.fillRoundRect(0, 0, getWidth(), getHeight(), 30, 30); // Menggambar tombol dengan rounded corners

        super.paintComponent(g); // Untuk menggambar teks dan ikon (jika ada)
    }

    @Override
    public void setBorder(Border border) {
        super.setBorder(border); // Tetap menggunakan border yang sudah ada
    }
}
