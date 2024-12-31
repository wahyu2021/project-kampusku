/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.kampusku.model;

/**
 *
 * @author ACER
 */
public class MataKuliah {
    private int kodeMK;
    private String namaMK;
    private int SKS;

    public MataKuliah(int kodeMK, String namaMK, int SKS) {
        this.kodeMK = kodeMK;
        this.namaMK = namaMK;
        this.SKS = SKS;
    }

    public int getSKS() {
        return SKS;
    }

    public void setSKS(int SKS) {
        this.SKS = SKS;
    }

    public String getNamaMK() {
        return namaMK;
    }

    public void setNamaMK(String namaMK) {
        this.namaMK = namaMK;
    }

    public int getKodeMK() {
        return kodeMK;
    }

    public void setKodeMK(int kodeMK) {
        this.kodeMK = kodeMK;
    }

    @Override
    public String toString() {
        return "MataKuliah{" +
                "kodeMK=" + kodeMK +
                ", namaMK='" + namaMK + '\'' +
                ", SKS=" + SKS +
                '}';
    }
}

