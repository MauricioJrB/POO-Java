/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.finalproject;

// Aluno: Mauricio Junior  RA:2525321
// Apache NetBeans IDE 17

import javax.swing.JOptionPane;

public class NumErrException extends Exception {

    public void impMsgCodErr() {

        JOptionPane.showMessageDialog(null, "O Codigo deve conter 3 digitos!");
    }

    public Comprimido corrCodComp(Comprimido comp) {

        try { 
            comp.setCodigo(Integer.parseInt(JOptionPane.showInputDialog(null, "O Código do Medicamento deve estar entre 100 e 999!")));
        }
        catch(NumErrException nee) {
            impMsgCodErr();
            comp = corrCodComp(comp);
        }
        return comp;
    }

    public Solucao corrCodSol(Solucao sol) {

        try {
            sol.setCodigo(Integer.parseInt(JOptionPane.showInputDialog(null, "O Código do Medicamento deve estar entre 100 e 999!")));
        }
        catch(NumErrException nee) {
            impMsgCodErr();
            sol = corrCodSol(sol);
        }
        return sol;
    }

    public Topico corrCodTop(Topico top) {

        try {
            top.setCodigo(Integer.parseInt(JOptionPane.showInputDialog(null, "O Código do Medicamento deve estar entre 100 e 999!")));
        }
        catch(NumErrException nee) {
            impMsgCodErr();
            top = corrCodTop(top);
        }
        return top;
    }

    public void impMsgCnpjErr() {

        JOptionPane.showMessageDialog(null, "O CNPJ deve conter 5 digitos!");
    }

    public Comprimido corrCnpjComp(Comprimido comp) {

        try {
            comp.getFabricante().setCnpj(Integer.parseInt(JOptionPane.showInputDialog(null, "O CNPJ do Fabricante deve estar entre 10000 e 99999!")));
        }
        catch(NumErrException nee) {
            
            impMsgCnpjErr();
            comp = nee.corrCnpjComp(comp);
        }
        return comp;
    }

    public Solucao corrCnpjSol(Solucao sol) {

        try {
            sol.getFabricante().setCnpj(Integer.parseInt(JOptionPane.showInputDialog(null, "O CNPJ do Fabricante deve estar entre 10000 e 99999")));
        }
        catch(NumErrException nee) {
            impMsgCnpjErr();
            sol = corrCnpjSol(sol);
        }
        return sol;
    }

    public Topico corrCnpjTop(Topico top) {

        try {
            top.getFabricante().setCnpj(Integer.parseInt(JOptionPane.showInputDialog(null, "O CNPJ do Fabricante deve estar entre 10000 e 99999")));
        }
        catch(NumErrException nee) {
            impMsgCnpjErr();
            top = corrCnpjTop(top);
        }
        return top;
    }
}
