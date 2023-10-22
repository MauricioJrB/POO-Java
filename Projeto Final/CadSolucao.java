/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.finalproject;

// Aluno: Mauricio Junior  RA:2525321
// Apache NetBeans IDE 17

import javax.swing.JOptionPane;

public class CadSolucao extends javax.swing.JFrame {

    private static CadSolucao cadSol;
    private static Solucao sol;
    
    public static CadSolucao getCadSolucao() {
    
        if(cadSol == null) {
            cadSol = new CadSolucao();
            return cadSol;
        }
        return null;
    }
    
    public CadSolucao() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cxCod = new javax.swing.JTextField();
        cxPreco = new javax.swing.JTextField();
        cxNomeFant = new javax.swing.JTextField();
        cxCnpj = new javax.swing.JTextField();
        cxQtdeCad = new javax.swing.JTextField();
        cxMargem = new javax.swing.JTextField();
        cxNomeJur = new javax.swing.JTextField();
        rotPreco = new javax.swing.JLabel();
        rotDadosFabComp = new javax.swing.JLabel();
        rotNomeFant = new javax.swing.JLabel();
        rotDadosMed = new javax.swing.JLabel();
        rotNomeJurid = new javax.swing.JLabel();
        rotCnpj = new javax.swing.JLabel();
        rotQtdeComp = new javax.swing.JLabel();
        rotMargem = new javax.swing.JLabel();
        cxNome = new javax.swing.JTextField();
        cxLab = new javax.swing.JTextField();
        rotCadSol = new javax.swing.JLabel();
        rotNome = new javax.swing.JLabel();
        rotLab = new javax.swing.JLabel();
        rotMl = new javax.swing.JLabel();
        rotSabor = new javax.swing.JLabel();
        rotCod = new javax.swing.JLabel();
        cxMl = new javax.swing.JTextField();
        cxSabor = new javax.swing.JTextField();
        btInserir = new javax.swing.JButton();
        btConsultar = new javax.swing.JButton();
        btSair = new javax.swing.JButton();
        btLimpar = new javax.swing.JButton();
        btAlterar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        rotPreco.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        rotPreco.setText("Preço");

        rotDadosFabComp.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        rotDadosFabComp.setText("DADOS DO FABRICANTE");

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

        rotCadSol.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        rotCadSol.setText("   CADASTRO DE SOLUÇÃO");
        rotCadSol.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        rotCadSol.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        rotNome.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        rotNome.setText("Nome:");

        rotLab.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        rotLab.setText("Laboratório:");

        rotMl.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        rotMl.setText("Mililitro:");

        rotSabor.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        rotSabor.setText("Sabor:");

        rotCod.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        rotCod.setText("Código: ");

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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(312, Short.MAX_VALUE)
                .addComponent(rotCadSol, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(291, 291, 291))
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rotDadosMed)
                            .addComponent(rotLab)
                            .addComponent(rotNome)
                            .addComponent(rotCod))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
                                    .addComponent(cxNomeJur, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(13, 13, 13)
                                .addComponent(btInserir, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(60, 60, 60)
                                .addComponent(btConsultar))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(btAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(rotQtdeComp, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(cxQtdeCad, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(rotMargem, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(cxMargem, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(rotPreco)
                                            .addComponent(rotSabor)
                                            .addComponent(rotMl))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(cxMl, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(cxLab, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(cxNome, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(cxSabor, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(cxPreco, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(cxCod, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(66, 66, 66)
                        .addComponent(btSair, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(21, 21, 21)))
                .addGap(21, 21, 21))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(rotCadSol, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                        .addComponent(rotMl)
                        .addGap(5, 5, 5)
                        .addComponent(rotSabor, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rotPreco))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(cxCod, javax.swing.GroupLayout.DEFAULT_SIZE, 24, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cxNome)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cxLab, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cxMl)
                        .addGap(4, 4, 4)
                        .addComponent(cxSabor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btInserir, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btConsultar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btSair, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(44, 44, 44))))
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
        
        sol = new Solucao();
        try {
            try {
                sol.setCodigo(Integer.parseInt(JOptionPane.showInputDialog(cxCod.getText())));
                sol = BancoMed.getBancoMed().alterarSol(sol);
            }
            catch(NumErrException nee) {
                nee.impMsgCodErr();
                sol = nee.corrCnpjSol(sol);
            }
            catch(LetErrException lee) {
                
                lee.impMsgNomeErr();
                sol = lee.corrNomeSol(sol);
            }
            if(sol != null) {
                cxCod.setText(Integer.toString(sol.getCodigo()));
                JOptionPane.showMessageDialog(null, "Medicamento Solução alterado com sucesso!", "Alteração de Solução", 1);

            }
             else {

                JOptionPane.showMessageDialog(null, "Código NÃO encontrado!", "Alteração Solução", 1);
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
        
        int codigo = Integer.parseInt(JOptionPane.showInputDialog("Digite o Código do Medicamento Solução que deseja consultar:"));

        sol = BancoMed.getBancoMed().consultaSol(codigo);
        
        if(sol != null) {
            
             cxCod.setText(Integer.toString(sol.getCodigo()));
            cxNome.setText(sol.getNome());
            cxLab.setText(sol.getLaboratorio());
            cxMl.setText(Integer.toString(sol.getMililitro()));
            cxSabor.setText((sol.getSabor()));
            cxPreco.setText(Double.toString(sol.getPreco()));
            cxQtdeCad.setText(Integer.toString(sol.getQtde()));
            cxMargem.setText(Double.toString(sol.getMargem()));
            cxNomeFant.setText(sol.getFabricante().getNomeFant());
            cxNomeJur.setText(sol.getFabricante().getNomeJur());
            cxCnpj.setText(Integer.toString((int) sol.getFabricante().getCnpj()));
            
            JOptionPane.showMessageDialog(null, "Medicamento Encontrado!", "Consulta Medicamento Solução", 1);
        }
        else {
            JOptionPane.showMessageDialog(null, "Código NÃO enconrdo!", "Consulta Medicamento Solução", 1);  
        }
        Limpar();
        cxCod.requestFocus();
    }
    
    public void Inserir() {
      
        try{    
            sol = new Solucao();
            try{
                sol.setCodigo(Integer.parseInt(cxCod.getText()));
            }
            catch(NumErrException nee) {

                nee.impMsgCodErr();
                sol = nee.corrCodSol(sol);
            }
            try {
                sol.setNome(cxNome.getText());
            }
            catch(NumberFormatException nfe) {

                JOptionPane.showMessageDialog(null, "Insira os dados corretamente", "ERRO", JOptionPane.ERROR_MESSAGE);
            }
            catch(LetErrException lee) {
                
                lee.impMsgNomeErr();
                sol = lee.corrNomeSol(sol);
            }
            sol.setLaboratorio(cxLab.getText());
            sol.setMililitro(Integer.parseInt(cxMl.getText()));
            sol.setSabor(cxSabor.getText());
            sol.setPreco(Double.parseDouble(cxPreco.getText()));
            sol.setMargem(Double.parseDouble(cxMargem.getText()));
            sol.getFabricante().setNomeFant(cxNomeFant.getText());
            sol.getFabricante().setNomeJur(cxNomeJur.getText());
            try {
                sol.getFabricante().setCnpj(Integer.parseInt(cxCnpj.getText()));
            }
            catch(NumErrException nee) {
                nee.impMsgCnpjErr();
                sol = nee.corrCnpjSol(sol);
            }
            sol = BancoMed.getBancoMed().cadastroSol(sol);

            if(sol != null) {
                JOptionPane.showMessageDialog(null, "Cadastro realizado!", "Cadastro de Solução", 1);

            }

            else {
                JOptionPane.showMessageDialog(null, "CÓDIGO INVALIDO!", "Cadastro de Solução", 1);

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
        cxMl.setText("");
        cxSabor.setText("");
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
    private javax.swing.JTextField cxLab;
    private javax.swing.JTextField cxMargem;
    private javax.swing.JTextField cxMl;
    private javax.swing.JTextField cxNome;
    private javax.swing.JTextField cxNomeFant;
    private javax.swing.JTextField cxNomeJur;
    private javax.swing.JTextField cxPreco;
    private javax.swing.JTextField cxQtdeCad;
    private javax.swing.JTextField cxSabor;
    private javax.swing.JLabel rotCadSol;
    private javax.swing.JLabel rotCnpj;
    private javax.swing.JLabel rotCod;
    private javax.swing.JLabel rotDadosFabComp;
    private javax.swing.JLabel rotDadosMed;
    private javax.swing.JLabel rotLab;
    private javax.swing.JLabel rotMargem;
    private javax.swing.JLabel rotMl;
    private javax.swing.JLabel rotNome;
    private javax.swing.JLabel rotNomeFant;
    private javax.swing.JLabel rotNomeJurid;
    private javax.swing.JLabel rotPreco;
    private javax.swing.JLabel rotQtdeComp;
    private javax.swing.JLabel rotSabor;
    // End of variables declaration//GEN-END:variables
}
