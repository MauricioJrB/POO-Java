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

public class FormSolucao extends javax.swing.JFrame {

    private static FormSolucao formSol;
    Solucao sol;
    
    public static FormSolucao getFormSolucao() {
        
        if(formSol == null) {
            formSol = new FormSolucao();
        }
        return formSol;
    }
    
    public FormSolucao() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        TabSol = new javax.swing.JTable();
        bdExcluir = new javax.swing.JButton();
        rotRelatsSol = new javax.swing.JLabel();
        btSair = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        TabSol.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Código", "Nome", "Laboratório", "ML", "Sabor", "Preço", "Qtde Cadast.", "Margem", "Nome Fant.", "Nome Jur.", "CNPJ"
            }
        ));
        TabSol.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TabSolMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TabSol);

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

        rotRelatsSol.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        rotRelatsSol.setText("    RELATÓRIO DE SOLUÇÃO");
        rotRelatsSol.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        rotRelatsSol.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

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
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(246, 246, 246)
                                .addComponent(bdExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(249, 249, 249)
                                .addComponent(btSair, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(272, 272, 272)
                                .addComponent(rotRelatsSol, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 248, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addComponent(rotRelatsSol)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 73, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 408, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bdExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btSair, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(94, 94, 94))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TabSolMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TabSolMouseClicked
        SelecTabela();
    }//GEN-LAST:event_TabSolMouseClicked

    private void bdExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bdExcluirActionPerformed
        ApagarTabela();
    }//GEN-LAST:event_bdExcluirActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        ListarTabela();
        setLocationRelativeTo(null);
    }//GEN-LAST:event_formWindowActivated

    private void btSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSairActionPerformed
        Sair();
    }//GEN-LAST:event_btSairActionPerformed

    private void bdExcluirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bdExcluirMouseClicked
        ApagarTabela();
    }//GEN-LAST:event_bdExcluirMouseClicked

    public void ApagarTabela() {
        
        try { 
            sol = new Solucao();

            DefaultTableModel tabModel = (DefaultTableModel)TabSol.getModel();
            sol = BancoMed.consultaSol((int) tabModel.getValueAt(SelecTabela(), 0));
            BancoMed.apagarSol(sol);
            tabModel.removeRow(TabSol.getSelectedRow());

            JOptionPane.showMessageDialog(null, "Apagado com sucesso");
        }
        catch(Exception e) {

            if(TabSol.getSelectedRow() == -1) {
                JOptionPane.showMessageDialog(null, "Clique na linha que deseja excluir!", "ATENÇÃO", 1);
            }   
        }
    }
    
    public int SelecTabela() {
        
        return TabSol.getSelectedRow();
    }
    
    public void ListarTabela() {
        
        DefaultTableModel tabModel = (DefaultTableModel)TabSol.getModel();
        int i = 0;
        tabModel.setRowCount(i);
        
        for(Solucao sol : BancoMed.getBancoMed().getBdSol()) {
            tabModel.insertRow(i, new Object[]{sol.getCodigo(), sol.getNome(), 
                sol.getLaboratorio(), sol.getMililitro(), sol.getSabor(), 
                sol.getPreco(), sol.getQtde(), sol.getMargem(), 
                sol.getFabricante().getNomeFant(), sol.getFabricante().getNomeJur(), 
                sol.getFabricante().getCnpj()});
        }
    }
    
    public void Sair(){
            
        int confirm = JOptionPane.showConfirmDialog(null,"Deseja realmente sair", "Saida", JOptionPane.YES_NO_OPTION);

        if(confirm == 0){
                
            dispose();
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TabSol;
    private javax.swing.JButton bdExcluir;
    private javax.swing.JButton btSair;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel rotRelatsSol;
    // End of variables declaration//GEN-END:variables
}
