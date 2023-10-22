/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.finalproject;

// Aluno: Mauricio Junior  RA:2525321
// Apache NetBeans IDE 17

public class Comprimido extends Medicamento implements Calcular {

    private int qtdeComp;
    private int miligrama;

    public Comprimido() {

        qtdeComp = 0;
        miligrama = 0;
    }
    //Sobrecarga
    public Comprimido(int qtdeComp, int miligrama) {

        this.qtdeComp = qtdeComp;
        this.miligrama = miligrama;
}

    public int getQtdeComp() {

        return qtdeComp;
    }
    public void setQtdeComp(int qtdeComp) {

        this.qtdeComp = qtdeComp;
    }

    public int getMiligrama() {

        return miligrama;
    }
    public void setMiligrama(int miligrama) {

        this.miligrama = miligrama;
    }
    //Sobrescrita
    public double margemLucro() {

        return  getPreco() *  (1 + getMargem() / 100.0);
    }
}