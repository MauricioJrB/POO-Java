/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.finalproject;

// Aluno: Mauricio Junior  RA:2525321
// Apache NetBeans IDE 17

import java.awt.HeadlessException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class FormComprimido extends javax.swing.JFrame {

    private static FormComprimido formComp;
    Comprimido comp;
    
    public static FormComprimido getFormComprimido() {
        
        if(formComp == null) {
            formComp = new FormComprimido();
        }
        return formComp;
    }
    
    public FormComprimido() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        TabComp = new javax.swing.JTable();
        bdExcluir = new javax.swing.JButton();
        btSair = new javax.swing.JButton();
        rotRelatComp1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        TabComp.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Código", "Nome", "Laboratório", "Mg", "Qtde Comp.", "Preço", "Qtde Cadast.", "Margem", "Nome Fant.", "Nome Jur.", "CNPJ"
            }
        ));
        TabComp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TabCompMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TabComp);

        bdExcluir.setText("EXCLUIR");
        bdExcluir.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        bdExcluir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bdExcluirMouseClicked(evt);
            }
        });
        bdExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bdExcluirActionPerformed(evt);
            }
        });

        btSair.setText("SAIR");
        btSair.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSairActionPerformed(evt);
            }
        });

        rotRelatComp1.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        rotRelatComp1.setText("   RELATÓRIO DE COMPRIMIDO");
        rotRelatComp1.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        rotRelatComp1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 895, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(247, 247, 247)
                .addComponent(bdExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(208, 208, 208)
                .addComponent(btSair, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(307, Short.MAX_VALUE)
                    .addComponent(rotRelatComp1, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(259, 259, 259)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(162, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 408, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bdExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btSair, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(104, 104, 104))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(60, 60, 60)
                    .addComponent(rotRelatComp1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(664, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bdExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bdExcluirActionPerformed
        ApagarTabela();
    }//GEN-LAST:event_bdExcluirActionPerformed

    private void btSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSairActionPerformed
        Sair();
    }//GEN-LAST:event_btSairActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        ListarTabela();
        setLocationRelativeTo(null);
    }//GEN-LAST:event_formWindowActivated

    private void TabCompMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TabCompMouseClicked
        SelecTabela();
    }//GEN-LAST:event_TabCompMouseClicked

    private void bdExcluirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bdExcluirMouseClicked
        ApagarTabela();
    }//GEN-LAST:event_bdExcluirMouseClicked

    public void ApagarTabela() {
        
        try{
            comp = new Comprimido();

            DefaultTableModel tabModel = (DefaultTableModel)TabComp.getModel();
            comp = BancoMed.consultaComp((int) tabModel.getValueAt(SelecTabela(), 0));
            BancoMed.apagarComp(comp);
            tabModel.removeRow(TabComp.getSelectedRow());

            JOptionPane.showMessageDialog(null, "Apagado com sucesso");
        }
        catch(Exception e) {

            if(TabComp.getSelectedRow() == -1) {
                JOptionPane.showMessageDialog(null, "Clique na linha que deseja excluir!", "ATENÇÃO", 1);
            }   
        }
    }
    
    public int SelecTabela() {
        
        return TabComp.getSelectedRow();
    }
    
    public void ListarTabela() {
        
        DefaultTableModel tabModel = (DefaultTableModel)TabComp.getModel();
        int i = 0;
        tabModel.setRowCount(i);
        
        for(Comprimido comp : BancoMed.getBancoMed().getBdComp()) {
            tabModel.insertRow(i, new Object[]{comp.getCodigo(), comp.getNome(), 
                comp.getLaboratorio(), comp.getMiligrama(), comp.getQtdeComp(), 
                comp.getPreco(), comp.getQtde(), comp.getMargem(), 
                comp.getFabricante().getNomeFant(), comp.getFabricante().getNomeJur(), 
                comp.getFabricante().getCnpj()});
        }
    }
    
    public void Sair(){
            
        int confirm = JOptionPane.showConfirmDialog(null,"Deseja realmente sair", "Saida", JOptionPane.YES_NO_OPTION);

        if(confirm == 0){
                
            dispose();
        }
    }
     
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TabComp;
    private javax.swing.JButton bdExcluir;
    private javax.swing.JButton btSair;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel rotRelatComp1;
    // End of variables declaration//GEN-END:variables
}
