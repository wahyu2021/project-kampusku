/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.kampusku.model;

/**
 *
 * @author ACER
 */
public class Dosen {
    private int kodeDosen;
    private String namaDosen;
    private String email;
    private String noTelepon;
    private String alamat;
    private String jenisKelamin;

    public Dosen(int kodeDosen, String namaDosen, String email, String noTelepon, String alamat, String jenisKelamin) {
        this.kodeDosen = kodeDosen;
        this.namaDosen = namaDosen;
        this.email = email;
        this.noTelepon = noTelepon;
        this.alamat = alamat;
        this.jenisKelamin = jenisKelamin;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNoTelepon() {
        return noTelepon;
    }

    public void setNoTelepon(String noTelepon) {
        this.noTelepon = noTelepon;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getJenisKelamin() {
        return jenisKelamin;
    }

    public void setJenisKelamin(String jenisKelamin) {
        this.jenisKelamin = jenisKelamin;
    }

    @Override
    public String toString() {
        return "Dosen{" +
                "kodeDosen=" + kodeDosen +
                ", namaDosen='" + namaDosen + '\'' +
                ", email='" + email + '\'' +
                ", noTelepon='" + noTelepon + '\'' +
                ", alamat='" + alamat + '\'' +
                ", jenisKelamin='" + jenisKelamin + '\'' +
                '}';
    }
}
