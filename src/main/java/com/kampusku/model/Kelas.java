/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.kampusku.model;

/**
 *
 * @author ACER
 */
public class Kelas {
    private int kodeKelas;
    private String namaKelas;

    public Kelas(int kodeKelas, String namaKelas) {
        this.kodeKelas = kodeKelas;
        this.namaKelas = namaKelas;
    }

    public int getKodeKelas() {
        return kodeKelas;
    }

    public void setKodeKelas(int kodeKelas) {
        this.kodeKelas = kodeKelas;
    }

    public String getNamaKelas() {
        return namaKelas;
    }

    public void setNamaKelas(String namaKelas) {
        this.namaKelas = namaKelas;
    }

    @Override
    public String toString() {
        return "Kelas{" +
                "kodeKelas=" + kodeKelas +
                ", namaKelas='" + namaKelas + '\'' +
                '}';
    }
}
