/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.finalproject;

// Aluno: Mauricio Junior  RA:2525321
// Apache NetBeans IDE 17

import javax.swing.JOptionPane;

public class LetErrException extends Exception {


    public void impMsgNomeErr() {
    
        JOptionPane.showMessageDialog(null, "O nome do Medicamento deve conter ate 15 caracteres!", "Nome inválido", 1);
    }
    
    public Comprimido corrNomeComp(Comprimido comp) {

        try {
            comp.setNome(JOptionPane.showInputDialog(null, "Digite o Nome do Medicamento Corretamente!", "Insira novo Nome", 1));            
        }
        catch(LetErrException lee) {
            
            impMsgNomeErr();
            comp = lee.corrNomeComp(comp);
        }
        return comp;
    }
    
    public Solucao corrNomeSol(Solucao sol) {
        
        try {
            sol.setNome(JOptionPane.showInputDialog(null, "Digite o Nome do Medicamento Corretamente!", 1));
        }
        catch(LetErrException lee) {
            
            impMsgNomeErr();
            sol = lee.corrNomeSol(sol);
        }
        return sol;
    }
    
    public Topico corrNomeTop(Topico top) {
        
        try {
            top.setNome(JOptionPane.showInputDialog(null, "Digite o Nome do Medicamento Corretamente!", 1));
        }
        catch(LetErrException lee) {
            
            impMsgNomeErr();
            top = lee.corrNomeTop(top);
        }
        return top;
    }
}
