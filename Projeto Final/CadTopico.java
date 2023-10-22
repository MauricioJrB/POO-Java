/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.finalproject;

// Aluno: Mauricio Junior  RA:2525321
// Apache NetBeans IDE 17

import javax.swing.JOptionPane;

public class CadTopico extends javax.swing.JFrame {

    private static CadTopico cadTop;
    private static Topico top;
    
    public static CadTopico getCadTopico() {
        
        if(cadTop == null) {
            cadTop = new CadTopico();
            return cadTop;
        }
        return cadTop;
    }
    
    public CadTopico() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cxNomeFant = new javax.swing.JTextField();
        cxCnpj = new javax.swing.JTextField();
        cxQtdeCad = new javax.swing.JTextField();
        cxMargem = new javax.swing.JTextField();
        cxNomeJur = new javax.swing.JTextField();
        rotNomeFant = new javax.swing.JLabel();
        rotDadosMed = new javax.swing.JLabel();
        rotNomeJurid = new javax.swing.JLabel();
        rotCnpj = new javax.swing.JLabel();
        rotQtdeComp = new javax.swing.JLabel();
        rotMargem = new javax.swing.JLabel();
        cxNome = new javax.swing.JTextField();
        cxLab = new javax.swing.JTextField();
        cxGr = new javax.swing.JTextField();
        cxCons = new javax.swing.JTextField();
        rotCadTop = new javax.swing.JLabel();
        rotNome = new javax.swing.JLabel();
        rotLab = new javax.swing.JLabel();
        rotMg = new javax.swing.JLabel();
        rotQtde = new javax.swing.JLabel();
        rotCod = new javax.swing.JLabel();
        rotPreco = new javax.swing.JLabel();
        rotDadosFabComp = new javax.swing.JLabel();
        cxCod = new javax.swing.JTextField();
        cxPreco = new javax.swing.JTextField();
        btInserir = new javax.swing.JButton();
        btConsultar = new javax.swing.JButton();
        btSair = new javax.swing.JButton();
        btLimpar = new javax.swing.JButton();
        btAlterar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        rotNomeFant.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        rotNomeFant.setText("Nome Fantasia:");

        rotDadosMed.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        rotDadosMed.setText("DADOS DO MEDICAMENTO");

        rotNomeJurid.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        rotNomeJurid.setText("Nome Jurídicico:");

        rotCnpj.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        rotCnpj.setText("CNPJ: ");

        rotQtdeComp.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        rotQtdeComp.setText("Quant. Cadastrados:");

        rotMargem.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        rotMargem.setText("Margem Lucro em %:");

        rotCadTop.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        rotCadTop.setText("    CADASTRO DE TÓPICO");
        rotCadTop.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        rotCadTop.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        rotNome.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        rotNome.setText("Nome:");

        rotLab.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        rotLab.setText("Laboratório:");

        rotMg.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        rotMg.setText("Grama:");

        rotQtde.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        rotQtde.setText("Consistência:");

        rotCod.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        rotCod.setText("Código: ");

        rotPreco.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        rotPreco.setText("Preço");

        rotDadosFabComp.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        rotDadosFabComp.setText("DADOS DO FABRICANTE");

        btInserir.setText("INSERIR");
        btInserir.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btInserir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btInserirMouseClicked(evt);
            }
        });
        btInserir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btInserirActionPerformed(evt);
            }
        });

        btConsultar.setText("CONSULTAR");
        btConsultar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btConsultarActionPerformed(evt);
            }
        });

        btSair.setText("SAIR");
        btSair.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSairActionPerformed(evt);
            }
        });

        btLimpar.setText("LIMPAR");
        btLimpar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLimparActionPerformed(evt);
            }
        });

        btAlterar.setText("ALTERAR");
        btAlterar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAlterarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rotDadosMed)
                            .addComponent(rotLab)
                            .addComponent(rotNome)
                            .addComponent(rotCod))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 209, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rotDadosFabComp)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(rotNomeFant)
                                .addGap(18, 18, 18)
                                .addComponent(cxNomeFant, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(rotNomeJurid)
                                    .addComponent(rotCnpj))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cxCnpj, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cxNomeJur, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(115, 115, 115))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(rotQtdeComp, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cxQtdeCad, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(rotMargem, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cxMargem, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(rotPreco)
                                    .addComponent(rotQtde)
                                    .addComponent(rotMg))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cxGr, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cxLab, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cxNome, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cxCons, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cxPreco, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cxCod, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(181, 522, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(btInserir, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(66, 66, 66)
                .addComponent(btConsultar)
                .addGap(77, 77, 77)
                .addComponent(btAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btSair, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(95, 95, 95))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(rotCadTop, javax.swing.GroupLayout.PREFERRED_SIZE, 311, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(315, 315, 315))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(rotCadTop, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rotDadosMed)
                    .addComponent(rotDadosFabComp))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rotCod)
                            .addComponent(rotNomeFant)
                            .addComponent(cxNomeFant, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rotNomeJurid)
                            .addComponent(cxNomeJur, javax.swing.GroupLayout.DEFAULT_SIZE, 23, Short.MAX_VALUE)
                            .addComponent(rotNome))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rotCnpj)
                            .addComponent(cxCnpj, javax.swing.GroupLayout.DEFAULT_SIZE, 23, Short.MAX_VALUE)
                            .addComponent(rotLab))
                        .addGap(4, 4, 4)
                        .addComponent(rotMg)
                        .addGap(5, 5, 5)
                        .addComponent(rotQtde, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rotPreco))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(cxCod, javax.swing.GroupLayout.DEFAULT_SIZE, 24, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cxNome)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cxLab, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cxGr)
                        .addGap(4, 4, 4)
                        .addComponent(cxCons, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cxPreco)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rotQtdeComp, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(cxQtdeCad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rotMargem)
                    .addComponent(cxMargem))
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btInserir, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btConsultar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btSair, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(46, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btInserirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btInserirMouseClicked
        Inserir();
    }//GEN-LAST:event_btInserirMouseClicked

    private void btInserirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btInserirActionPerformed
        Inserir();
        Limpar();
    }//GEN-LAST:event_btInserirActionPerformed

    private void btConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btConsultarActionPerformed
        Consultar();
    }//GEN-LAST:event_btConsultarActionPerformed

    private void btSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSairActionPerformed
        Sair();
    }//GEN-LAST:event_btSairActionPerformed

    private void btLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLimparActionPerformed
        Limpar();
    }//GEN-LAST:event_btLimparActionPerformed

    private void btAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAlterarActionPerformed
        Alterar();
    }//GEN-LAST:event_btAlterarActionPerformed
    
    public void Alterar() {
        top = new Topico();
        try {
            try {
                top.setCodigo(Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o Código a ser Consultado",cxCod.getText())));
                top = BancoMed.getBancoMed().alterarTop(top);
            }
            catch(NumErrException nee) {
                nee.impMsgCodErr();
                top = nee.corrCodTop(top);
            } 
            catch (LetErrException lee) {
                lee.impMsgNomeErr();
                top = lee.corrNomeTop(top);
            }      
            if(top != null) {

                cxCod.setText(Integer.toString(top.getCodigo()));
                JOptionPane.showMessageDialog(null, "Medicamento Tópico alterado com sucesso!", "Alteração de Tópico", 1);
            }
            else {

                JOptionPane.showMessageDialog(null, "Código NÃO encontrado!", "Alteração Tópico", 1);
            }
            Limpar();
        }
        catch(NumberFormatException nfe) {
            
            JOptionPane.showMessageDialog(null, "Insira os dados corretamente!", "ERRO", JOptionPane.ERROR_MESSAGE);
            cxCod.requestFocus();
            return;
        }
    } 
    
    public void Consultar() {
        
        int codigo = Integer.parseInt(JOptionPane.showInputDialog("Digite o Código do medicamento Tópico que deseja consultar:"));
        
        top = BancoMed.getBancoMed().consultaTop(codigo);
        
        if(top != null) {
           
            cxCod.setText(Integer.toString(top.getCodigo()));
            cxNome.setText(top.getNome());
            cxLab.setText(top.getLaboratorio());
            cxGr.setText(Integer.toString(top.getGrama()));
            cxCons.setText(top.getConsistencia());
            cxPreco.setText(Double.toString(top.getPreco()));
            cxQtdeCad.setText(Integer.toString(top.getQtde()));
            cxMargem.setText(Double.toString(top.getMargem()));
            cxNomeFant.setText(top.getFabricante().getNomeFant());
            cxNomeJur.setText(top.getFabricante().getNomeJur());
            cxCnpj.setText(Integer.toString((int) top.getFabricante().getCnpj()));
            
            JOptionPane.showMessageDialog(null, "Medicamento Encontrado!", "Consulta Medicamento Tópico", 1);
        }
        else {
            
            JOptionPane.showMessageDialog(null, "Código NÃO Encontrado!", "Consulta Medicamento Tópico", 1);    
        }
        Limpar();
        cxCod.requestFocus();
    }
    
    public void Inserir() {

        try {
            top = new Topico();
            try{
                top.setCodigo(Integer.parseInt(cxCod.getText()));
            }
            catch(NumErrException nee) {
                
                nee.impMsgCodErr();
                top = nee.corrCodTop(top);
            }
            try {
                top.setNome(cxNome.getText());
            }
            catch(NumberFormatException nfe) {

                JOptionPane.showMessageDialog(null, "Insira os dados corretamente", "ERRO", JOptionPane.ERROR_MESSAGE);
            }
            catch(LetErrException lee) {
                
                lee.impMsgNomeErr();
                top = lee.corrNomeTop(top);
            }
            top.setLaboratorio(cxLab.getText());
            top.setGrama(Integer.parseInt(cxGr.getText()));
            top.setConsistencia(cxCons.getText());
            top.setPreco(Double.parseDouble(cxPreco.getText()));
            top.setQtde(Integer.parseInt(cxQtdeCad.getText()));
            top.setMargem(Double.parseDouble(cxMargem.getText()));
            top.getFabricante().setNomeFant(cxNomeFant.getText());
            top.getFabricante().setNomeJur(cxNomeJur.getText());
            try {
                top.getFabricante().setCnpj(Integer.parseInt(cxCnpj.getText()));
            }
            catch(NumErrException nee) {
                nee.impMsgCnpjErr();
                top = nee.corrCnpjTop(top);
            }
            top = BancoMed.getBancoMed().cadastroTop(top);

            if(top != null) {

                JOptionPane.showMessageDialog(null, "Cadastro realizado!", "Cadastro de Tópico", 1);
            }
            else {

                 JOptionPane.showMessageDialog(null, "CÓDIGO INVALIDO!", "Cadastro de Tópico", 1);
            }
        }    
        catch(NumberFormatException nfe) {
            
            JOptionPane.showMessageDialog(null, "Insira os dados corretamente!", "ERRO", JOptionPane.ERROR_MESSAGE);
            cxCod.requestFocus();
            return;
        }    
    }
        
    public void Limpar() {
    
        cxCod.setText("");
        cxNome.setText("");
        cxLab.setText("");
        cxGr.setText("");
        cxCons.setText("");
        cxCod.setText("");
        cxPreco.setText("");
        cxQtdeCad.setText("");
        cxMargem.setText("");
        cxNomeFant.setText("");
        cxNomeJur.setText("");
        cxCnpj.setText("");
        
        cxCod.requestFocus();
    }
    
    public void Sair() {
        
        int confirme = JOptionPane.showConfirmDialog(null, "Deseja realmente Sair?", "Saída", JOptionPane.YES_NO_OPTION);
        
        if(confirme == 0) {
            
            dispose();
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAlterar;
    private javax.swing.JButton btConsultar;
    private javax.swing.JButton btInserir;
    private javax.swing.JButton btLimpar;
    private javax.swing.JButton btSair;
    private javax.swing.JTextField cxCnpj;
    private javax.swing.JTextField cxCod;
    private javax.swing.JTextField cxCons;
    private javax.swing.JTextField cxGr;
    private javax.swing.JTextField cxLab;
    private javax.swing.JTextField cxMargem;
    private javax.swing.JTextField cxNome;
    private javax.swing.JTextField cxNomeFant;
    private javax.swing.JTextField cxNomeJur;
    private javax.swing.JTextField cxPreco;
    private javax.swing.JTextField cxQtdeCad;
    private javax.swing.JLabel rotCadTop;
    private javax.swing.JLabel rotCnpj;
    private javax.swing.JLabel rotCod;
    private javax.swing.JLabel rotDadosFabComp;
    private javax.swing.JLabel rotDadosMed;
    private javax.swing.JLabel rotLab;
    private javax.swing.JLabel rotMargem;
    private javax.swing.JLabel rotMg;
    private javax.swing.JLabel rotNome;
    private javax.swing.JLabel rotNomeFant;
    private javax.swing.JLabel rotNomeJurid;
    private javax.swing.JLabel rotPreco;
    private javax.swing.JLabel rotQtde;
    private javax.swing.JLabel rotQtdeComp;
    // End of variables declaration//GEN-END:variables
}
