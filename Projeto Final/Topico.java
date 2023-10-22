/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.finalproject;

// Aluno: Mauricio Junior  RA:2525321
// Apache NetBeans IDE 17

public class Topico extends Medicamento implements Calcular {

    private int grama;
    private String consistencia;

    public Topico() {

        grama = 0;
        consistencia = "";
    }
    //Sobrecarga
    public Topico(int grama, String consistencia) {

        this.grama = grama;
        this.consistencia = consistencia;
    }

    public int getGrama() {

        return grama;
    }
    public void setGrama(int grama) {

        this.grama = grama;
    }

    public String getConsistencia() {

        return consistencia;
    }
    public void setConsistencia(String consistencia) {

        this.consistencia = consistencia;
    }
    //Sobrescrita
    public double margemLucro() {

        return  getPreco() * (1 + getMargem() / 100.0);
    }
}
