/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.kampusku.model;

/**
 *
 * @author ACER
 */
public class Nilai {
    private int kodeMK;
    private String namaMK;     // Nama Mata Kuliah
    private String NIM;        // Nomor Induk Mahasiswa
    private String namaMhs;    // Nama Mahasiswa
    private double tugas;      // Nilai Tugas
    private double uts;        // Nilai UTS
    private double uas;        // Nilai UAS

    public Nilai(int kodeMK, String NIM, double tugas, double uts, double uas) {
        this.kodeMK = kodeMK;
        this.NIM = NIM;
        this.tugas = tugas;
        this.uts = uts;
        this.uas = uas;
    }

    public Nilai(int kodeMK, String namaMK, String NIM, String namaMhs, double tugas, double uts, double uas) {
        this.kodeMK = kodeMK;
        this.namaMK = namaMK;
        this.NIM = NIM;
        this.namaMhs = namaMhs;
        this.tugas = tugas;
        this.uts = uts;
        this.uas = uas;
    }

    public int getKodeMK() {
        return kodeMK;
    }

    public void setKodeMK(int kodeMK) {
        this.kodeMK = kodeMK;
    }

    public String getNamaMK() {
        return namaMK;
    }

    public void setNamaMK(String namaMK) {
        this.namaMK = namaMK;
    }

    public String getNIM() {
        return NIM;
    }

    public void setNIM(String NIM) {
        this.NIM = NIM;
    }

    public String getNamaMhs() {
        return namaMhs;
    }

    public void setNamaMhs(String namaMhs) {
        this.namaMhs = namaMhs;
    }

    public double getTugas() {
        return tugas;
    }

    public void setTugas(double tugas) {
        this.tugas = tugas;
    }

    public double getUts() {
        return uts;
    }

    public void setUts(double uts) {
        this.uts = uts;
    }

    public double getUas() {
        return uas;
    }

    public void setUas(double uas) {
        this.uas = uas;
    }
}
