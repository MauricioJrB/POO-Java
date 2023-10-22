package com.mycompany.finalproject;

// Aluno: Mauricio Junior  RA:2525321
// Apache NetBeans IDE 17

import javax.swing.JOptionPane;

 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

public class Principal extends javax.swing.JFrame {

    public Principal() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jCheckBoxMenuItem1 = new javax.swing.JCheckBoxMenuItem();
        jCheckBoxMenuItem2 = new javax.swing.JCheckBoxMenuItem();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        rotGerMed = new javax.swing.JLabel();
        MenuPrincipal = new javax.swing.JMenuBar();
        MenuItens = new javax.swing.JMenu();
        mnltCadMed = new javax.swing.JMenu();
        subMnltCadComp = new javax.swing.JMenuItem();
        subMnltCadSol = new javax.swing.JMenuItem();
        subMnltCadTop = new javax.swing.JMenuItem();
        mnltRelatMed = new javax.swing.JMenu();
        subMnltRelatComp = new javax.swing.JCheckBoxMenuItem();
        subMnltRelatSol = new javax.swing.JCheckBoxMenuItem();
        subMnltRelatTop = new javax.swing.JCheckBoxMenuItem();
        mnltTabVendas = new javax.swing.JMenu();
        TabVendaComp = new javax.swing.JCheckBoxMenuItem();
        TabVendaSol = new javax.swing.JCheckBoxMenuItem();
        TabVendaTop = new javax.swing.JCheckBoxMenuItem();
        mnltSair = new javax.swing.JMenuItem();

        jCheckBoxMenuItem1.setSelected(true);
        jCheckBoxMenuItem1.setText("jCheckBoxMenuItem1");

        jCheckBoxMenuItem2.setSelected(true);
        jCheckBoxMenuItem2.setText("jCheckBoxMenuItem2");

        jMenu3.setText("File");
        jMenuBar2.add(jMenu3);

        jMenu4.setText("Edit");
        jMenuBar2.add(jMenu4);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        rotGerMed.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        rotGerMed.setText("    GERENCIADOR DE MEDICAMENTOS");
        rotGerMed.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));

        MenuItens.setText("PRINCIPAL");

        mnltCadMed.setText("Cadastro de Medicamentos...");

        subMnltCadComp.setText("Comprimido");
        subMnltCadComp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subMnltCadCompActionPerformed(evt);
            }
        });
        mnltCadMed.add(subMnltCadComp);

        subMnltCadSol.setText("Solução");
        subMnltCadSol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subMnltCadSolActionPerformed(evt);
            }
        });
        mnltCadMed.add(subMnltCadSol);

        subMnltCadTop.setText("Tópico");
        subMnltCadTop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subMnltCadTopActionPerformed(evt);
            }
        });
        mnltCadMed.add(subMnltCadTop);

        MenuItens.add(mnltCadMed);

        mnltRelatMed.setText("Relatório de Medicamentos...");

        subMnltRelatComp.setSelected(true);
        subMnltRelatComp.setText("Comprimido");
        subMnltRelatComp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subMnltRelatCompActionPerformed(evt);
            }
        });
        mnltRelatMed.add(subMnltRelatComp);

        subMnltRelatSol.setSelected(true);
        subMnltRelatSol.setText("Solução");
        subMnltRelatSol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subMnltRelatSolActionPerformed(evt);
            }
        });
        mnltRelatMed.add(subMnltRelatSol);

        subMnltRelatTop.setSelected(true);
        subMnltRelatTop.setText("Tópico");
        subMnltRelatTop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subMnltRelatTopActionPerformed(evt);
            }
        });
        mnltRelatMed.add(subMnltRelatTop);

        MenuItens.add(mnltRelatMed);

        mnltTabVendas.setText("Tabela de Vendas...");

        TabVendaComp.setSelected(true);
        TabVendaComp.setText("Tabela de Vendas Comprimido");
        TabVendaComp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TabVendaCompActionPerformed(evt);
            }
        });
        mnltTabVendas.add(TabVendaComp);

        TabVendaSol.setSelected(true);
        TabVendaSol.setText("Tabela de Vendas Solução");
        TabVendaSol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TabVendaSolActionPerformed(evt);
            }
        });
        mnltTabVendas.add(TabVendaSol);

        TabVendaTop.setSelected(true);
        TabVendaTop.setText("Tabela de Vendas Tópico");
        TabVendaTop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TabVendaTopActionPerformed(evt);
            }
        });
        mnltTabVendas.add(TabVendaTop);

        MenuItens.add(mnltTabVendas);

        mnltSair.setText("Sair");
        mnltSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnltSairActionPerformed(evt);
            }
        });
        MenuItens.add(mnltSair);

        MenuPrincipal.add(MenuItens);

        setJMenuBar(MenuPrincipal);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(rotGerMed, javax.swing.GroupLayout.DEFAULT_SIZE, 568, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(83, 83, 83)
                .addComponent(rotGerMed, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(95, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void subMnltRelatTopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subMnltRelatTopActionPerformed
        FormTopico.getFormTopico().setVisible(true);
    }//GEN-LAST:event_subMnltRelatTopActionPerformed

    private void subMnltCadCompActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subMnltCadCompActionPerformed
        CadComprimido.getCadComprimido().setVisible(true);
    }//GEN-LAST:event_subMnltCadCompActionPerformed

    private void mnltSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnltSairActionPerformed
        Sair();
    }//GEN-LAST:event_mnltSairActionPerformed

    private void subMnltRelatCompActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subMnltRelatCompActionPerformed
        FormComprimido.getFormComprimido().setVisible(true);
    }//GEN-LAST:event_subMnltRelatCompActionPerformed

    private void subMnltRelatSolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subMnltRelatSolActionPerformed
        FormSolucao.getFormSolucao().setVisible(true);
    }//GEN-LAST:event_subMnltRelatSolActionPerformed

    private void subMnltCadSolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subMnltCadSolActionPerformed
        CadSolucao.getCadSolucao().setVisible(true);
    }//GEN-LAST:event_subMnltCadSolActionPerformed

    private void subMnltCadTopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subMnltCadTopActionPerformed
        CadTopico.getCadTopico().setVisible(true);
    }//GEN-LAST:event_subMnltCadTopActionPerformed

    private void TabVendaCompActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TabVendaCompActionPerformed
        TabVendaComprimido.getTabVendaComprimido().setVisible(true);
    }//GEN-LAST:event_TabVendaCompActionPerformed

    private void TabVendaSolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TabVendaSolActionPerformed
        TabVendaSolucao.getTabVendaSolucao().setVisible(true);
    }//GEN-LAST:event_TabVendaSolActionPerformed

    private void TabVendaTopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TabVendaTopActionPerformed
        TabVendaTopico.getTabVendaTopico().setVisible(true);
    }//GEN-LAST:event_TabVendaTopActionPerformed

    public void Sair(){
            
        int confirm = JOptionPane.showConfirmDialog(null,"Deseja realmente sair", "Saida", JOptionPane.YES_NO_OPTION);

        if(confirm == 0){
                
            dispose();
        }
    }
    
    public static void main(String args[]) {
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu MenuItens;
    private javax.swing.JMenuBar MenuPrincipal;
    private javax.swing.JCheckBoxMenuItem TabVendaComp;
    private javax.swing.JCheckBoxMenuItem TabVendaSol;
    private javax.swing.JCheckBoxMenuItem TabVendaTop;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem1;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenu mnltCadMed;
    private javax.swing.JMenu mnltRelatMed;
    private javax.swing.JMenuItem mnltSair;
    private javax.swing.JMenu mnltTabVendas;
    private javax.swing.JLabel rotGerMed;
    private javax.swing.JMenuItem subMnltCadComp;
    private javax.swing.JMenuItem subMnltCadSol;
    private javax.swing.JMenuItem subMnltCadTop;
    private javax.swing.JCheckBoxMenuItem subMnltRelatComp;
    private javax.swing.JCheckBoxMenuItem subMnltRelatSol;
    private javax.swing.JCheckBoxMenuItem subMnltRelatTop;
    // End of variables declaration//GEN-END:variables
}
