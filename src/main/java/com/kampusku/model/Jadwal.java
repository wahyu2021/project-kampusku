/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.kampusku.model;

import java.sql.Time;

public class Jadwal {
    private int kodeDosen;
    private String namaDosen;
    private int kodeMK;
    private String namaMK;
    private int kodeKelas;
    private String namaKelas;
    private String hari;
    private Time jamMulai;
    private Time jamBerakhir;

    public Jadwal(int kodeDosen, int kodeMK, int kodeKelas, String hari, Time jamMulai, Time jamBerakhir) {
        this.kodeDosen = kodeDosen;
        this.kodeMK = kodeMK;
        this.kodeKelas = kodeKelas;
        this.hari = hari;
        this.jamMulai = jamMulai;
        this.jamBerakhir = jamBerakhir;
    }

    public Jadwal(int kodeDosen, String namaDosen, int kodeMK, String namaMK, int kodeKelas, String namaKelas, String hari, Time jamMulai, Time jamBerakhir) {
        this.kodeDosen = kodeDosen;
        this.namaDosen = namaDosen;
        this.kodeMK = kodeMK;
        this.namaMK = namaMK;
        this.kodeKelas = kodeKelas;
        this.namaKelas = namaKelas;
        this.hari = hari;
        this.jamMulai = jamMulai;
        this.jamBerakhir = jamBerakhir;
    }

    public int getKodeDosen() {
        return kodeDosen;
    }

    public void setKodeDosen(int kodeDosen) {
        this.kodeDosen = kodeDosen;
    }

    public String getNamaDosen() {
        return namaDosen;
    }

    public void setNamaDosen(String namaDosen) {
        this.namaDosen = namaDosen;
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

    public String getHari() {
        return hari;
    }

    public void setHari(String hari) {
        this.hari = hari;
    }

    public Time getJamMulai() {
        return jamMulai;
    }

    public void setJamMulai(Time jamMulai) {
        this.jamMulai = jamMulai;
    }

    public Time getJamBerakhir() {
        return jamBerakhir;
    }

    public void setJamBerakhir(Time jamBerakhir) {
        this.jamBerakhir = jamBerakhir;
    }
    
    public String getWaktu(){
        if (jamMulai != null && jamBerakhir != null) {
        return jamMulai.toString() + " - " + jamBerakhir.toString();
        } else {
            return "Waktu belum diisi";
        }
    }

    @Override
    public String toString() {
        return "Jadwal{" +
                "kodeDosen=" + kodeDosen +
                ", namaDosen='" + namaDosen + '\'' +
                ", kodeMK=" + kodeMK +
                ", namaMK='" + namaMK + '\'' +
                ", kodeKelas=" + kodeKelas +
                ", namaKelas='" + namaKelas + '\'' +
                ", hari='" + hari + '\'' +
                ", jamMulai=" + jamMulai +
                ", jamBerakhir=" + jamBerakhir +
                '}';
    }
}

