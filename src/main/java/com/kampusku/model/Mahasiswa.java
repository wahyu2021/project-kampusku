/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.kampusku.model;

import java.util.Date;

/**
 *
 * @author ACER
 */

public class Mahasiswa {
    private String NIM;
    private int kodeKelas;
    private String namaKelas;
    private String namaMhs;
    private String email;
    private String alamat;
    private Date tglLahir;
    private String noTelepon;
    private String jenisKelamin;

    public Mahasiswa(String NIM, int kodeKelas, String namaMhs, String email, String alamat, Date tglLahir, String noTelepon, String jenisKelamin) {
        this.NIM = NIM;
        this.kodeKelas = kodeKelas;
        this.namaMhs = namaMhs;
        this.email = email;
        this.alamat = alamat;
        this.tglLahir = tglLahir;
        this.noTelepon = noTelepon;
        this.jenisKelamin = jenisKelamin;
    }

    public Mahasiswa(String NIM, int kodeKelas, String namaKelas, String namaMhs, String email, String alamat, Date tglLahir, String noTelepon, String jenisKelamin) {
        this.NIM = NIM;
        this.namaKelas = namaKelas;
        this.namaMhs = namaMhs;
        this.email = email;
        this.alamat = alamat;
        this.tglLahir = tglLahir;
        this.noTelepon = noTelepon;
        this.jenisKelamin = jenisKelamin;
        this.kodeKelas = kodeKelas;
    }

    public String getNIM() {
        return NIM;
    }

    public void setNIM(String NIM) {
        this.NIM = NIM;
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

    public String getNamaMhs() {
        return namaMhs;
    }

    public void setNamaMhs(String namaMhs) {
        this.namaMhs = namaMhs;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public Date getTglLahir() {
        return tglLahir;
    }

    public void setTglLahir(Date tglLahir) {
        this.tglLahir = tglLahir;
    }

    public String getNoTelepon() {
        return noTelepon;
    }

    public void setNoTelepon(String noTelepon) {
        this.noTelepon = noTelepon;
    }

    public String getJenisKelamin() {
        return jenisKelamin;
    }

    public void setJenisKelamin(String jenisKelamin) {
        this.jenisKelamin = jenisKelamin;
    }

    @Override
    public String toString() {
        return "Mahasiswa{" +
                "NIM='" + NIM + '\'' +
                ", kodeKelas=" + kodeKelas +
                ", namaKelas='" + namaKelas + '\'' +
                ", namaMhs='" + namaMhs + '\'' +
                ", email='" + email + '\'' +
                ", alamat='" + alamat + '\'' +
                ", tglLahir='" + tglLahir + '\'' +
                ", noTelepon='" + noTelepon + '\'' +
                ", jenisKelamin='" + jenisKelamin + '\'' +
                '}';
    }
}

