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


public class FormTopico extends javax.swing.JFrame {
private static FormTopico formTop;
    Topico top;
    
    public static FormTopico getFormTopico() {
        
        if(formTop == null) {
            formTop = new FormTopico();
        }
        return formTop;
    }
    
    public FormTopico() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        TabTop = new javax.swing.JTable();
        rotRelatTop = new javax.swing.JLabel();
        btExcluir = new javax.swing.JButton();
        btSair = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        TabTop.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Código", "Nome", "Laboratório", "Grama", "Consistência", "Preço", "Qtde Cadast.", "Margem", "Nome Fant.", "Nome Jur.", "CNPJ"
            }
        ));
        TabTop.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TabTopMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TabTop);

        rotRelatTop.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        rotRelatTop.setText("    RELATÓRIO DE TÓPICO");
        rotRelatTop.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        rotRelatTop.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        btExcluir.setText("EXCLUIR");
        btExcluir.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btExcluir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btExcluirMouseClicked(evt);
            }
        });
        btExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btExcluirActionPerformed(evt);
            }
        });

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
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 894, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(240, 240, 240)
                .addComponent(btExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btSair, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(278, 278, 278))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(rotRelatTop, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(294, 294, 294))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(44, Short.MAX_VALUE)
                .addComponent(rotRelatTop)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 408, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(146, 146, 146)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btSair, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(186, 186, 186))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TabTopMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TabTopMouseClicked
        SelecTabela();
    }//GEN-LAST:event_TabTopMouseClicked

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        ListarTabela();
        setLocationRelativeTo(null);
    }//GEN-LAST:event_formWindowActivated

    private void btExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btExcluirActionPerformed
        ApagarTabela();
    }//GEN-LAST:event_btExcluirActionPerformed

    private void btSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSairActionPerformed
        Sair();
    }//GEN-LAST:event_btSairActionPerformed

    private void btExcluirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btExcluirMouseClicked
        ApagarTabela();
    }//GEN-LAST:event_btExcluirMouseClicked

    public void ApagarTabela() {
        
        try {     
             top = new Topico();

             DefaultTableModel tabModel = (DefaultTableModel)TabTop.getModel();
             top = BancoMed.consultaTop((int) tabModel.getValueAt(SelecTabela(), 0));
             BancoMed.apagarTop(top);
             tabModel.removeRow(TabTop.getSelectedRow());

             JOptionPane.showMessageDialog(null, "Apagado com sucesso");
         }
        catch(Exception e) {

             if(TabTop.getSelectedRow() == -1) {
                 JOptionPane.showMessageDialog(null, "Clique na linha que deseja excluir!", "ATENÇÃO", 1);

             }   
        }
    }
    
    public int SelecTabela() {
        
        return TabTop.getSelectedRow();
    }
    
    public void ListarTabela() {
        
        DefaultTableModel tabModel = (DefaultTableModel)TabTop.getModel();
        int i = 0;
        tabModel.setRowCount(i);
        
        for(Topico top : BancoMed.getBancoMed().getBdTop()) {
            tabModel.insertRow(i, new Object[]{top.getCodigo(), top.getNome(), 
                top.getLaboratorio(), top.getGrama(), top.getConsistencia(), 
                top.getPreco(), top.getQtde(), top.getMargem(), 
                top.getFabricante().getNomeFant(), top.getFabricante().getNomeJur(), 
                top.getFabricante().getCnpj()});
        }
    }
    
    public void Sair(){
            
        int confirm = JOptionPane.showConfirmDialog(null,"Deseja realmente sair", "Saida", JOptionPane.YES_NO_OPTION);

        if(confirm == 0){
                
            dispose();
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TabTop;
    private javax.swing.JButton btExcluir;
    private javax.swing.JButton btSair;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel rotRelatTop;
    // End of variables declaration//GEN-END:variables
}
