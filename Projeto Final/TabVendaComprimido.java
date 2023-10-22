/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.finalproject;

// Aluno: Mauricio Junior  RA:2525321
// Apache NetBeans IDE 17

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class TabVendaComprimido extends javax.swing.JFrame {
  
    private static TabVendaComprimido tabComp;
    Comprimido comp;
    
    public static TabVendaComprimido getTabVendaComprimido() {
        
        if(tabComp == null) {
            tabComp = new TabVendaComprimido();
        }
        return tabComp;
    }
    
    public TabVendaComprimido() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        rotTabVendaComp = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabVendaComp = new javax.swing.JTable();
        btSair = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        rotTabVendaComp.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        rotTabVendaComp.setText("   TABELA DE VENDAS COMPRIMIDO");
        rotTabVendaComp.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        rotTabVendaComp.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        tabVendaComp.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Código", "Nome", "Mg", "Laboratório", "Preço"
            }
        ));
        jScrollPane1.setViewportView(tabVendaComp);

        btSair.setText("SAIR");
        btSair.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSairActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btSair, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(423, 423, 423))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 792, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(246, 246, 246)
                        .addComponent(rotTabVendaComp, javax.swing.GroupLayout.PREFERRED_SIZE, 395, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(59, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(rotTabVendaComp, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 358, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btSair, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSairActionPerformed
        Sair();
    }//GEN-LAST:event_btSairActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
       ListarTabela();
       setLocationRelativeTo(null);
    }//GEN-LAST:event_formWindowActivated

    public void ListarTabela() {
        
        DefaultTableModel tabModel = (DefaultTableModel)tabVendaComp.getModel();
        int i = 0;
        tabModel.setRowCount(i);
        
        for(Comprimido comp : BancoMed.getBancoMed().getBdComp()) {
            tabModel.insertRow(i, new Object[]{comp.getCodigo(), comp.getNome(), 
                comp.getMiligrama(), comp.getLaboratorio(), 
                comp.margemLucro()});
        }
    }
    
    public void Sair(){
            
        int confirm = JOptionPane.showConfirmDialog(null,"Deseja realmente sair", "Saida", JOptionPane.YES_NO_OPTION);

        if(confirm == 0){
                
            dispose();
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btSair;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel rotTabVendaComp;
    private javax.swing.JTable tabVendaComp;
    // End of variables declaration//GEN-END:variables
}
