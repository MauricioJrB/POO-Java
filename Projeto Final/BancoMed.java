/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.finalproject;

// Aluno: Mauricio Junior  RA:2525321
// Apache NetBeans IDE 17

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class BancoMed {

    private static Comprimido comp;
    private static Solucao sol;
    private static Topico top;

    static List<Comprimido> BdComp;
    static List<Solucao> BdSol;
    static List<Topico> BdTop;

    private static BancoMed bdMedUnic;

    // Singleton Banco
    private BancoMed() {

        BdComp = new ArrayList<Comprimido>();
	BdSol = new ArrayList<Solucao>();
	BdTop = new ArrayList<Topico>();
    }
    
    public static BancoMed getBancoMed() {
        
        if(bdMedUnic == null) {
            bdMedUnic = new BancoMed();
        }
        return bdMedUnic;
    }
    
    public List<Comprimido> getBdComp() {
        
        return BdComp;
    }
    public List<Solucao> getBdSol() {
        
        return BdSol;
    }
    public List<Topico> getBdTop() {
    
        return BdTop;
    }
    
    //Inserir Comprimido
    public static Comprimido cadastroComp(Comprimido comp) {
        
        if(consultaComp(comp.getCodigo()) == null) {
            BdComp.add(comp);
            return comp;
        }
        return null;
    } //Fim Inserir Comprimido
    
    //Inserir Solucao 
    public static Solucao cadastroSol(Solucao sol) {
    
        if(consultaSol(sol.getCodigo()) == null) {
            BdSol.add(sol);
            return sol;
        }
        return null;
    } //Fim Inserir Solucao
    
    //Inserir Topico
    public static Topico cadastroTop(Topico top) {
        
        if(consultaTop(top.getCodigo()) == null) {
            BdTop.add(top);
            return top;
        }
        return null;
    } //Fim Inserir Topico
    
    //Consultar Comprimido
    public static Comprimido consultaComp(int codigo) {
    
        for(Comprimido c : BdComp) {
            if(c.getCodigo() == codigo){
                return c;
            }
        }
        return null;
    } //Fim Consultar Comprimido
    
    //Consultar Solucao
    public static Solucao consultaSol(int codigo) {
        
        for(Solucao s : BdSol) {
            if(s.getCodigo() == codigo) {
                return s;
            }
        }
        return null;
    } //Fim Consultar Solucao
    
    public static Topico consultaTop(int codigo) {
        
        for(Topico t : BdTop) {
            if(t.getCodigo() == codigo) {
                return t;
            }
        }
        return null;
    } //Fim Consulta Topico
    
    //Alterar Comprimido
    public static Comprimido alterarComp(Comprimido comp) throws LetErrException, NumErrException {
        
        for(Comprimido c : BdComp) {
            
            if(c.getCodigo() == comp.getCodigo()) {
                
                String novoNome = JOptionPane.showInputDialog(null, "Novo Nome: ", "Alterar Nome", 1);
                String novoLab = JOptionPane.showInputDialog(null, "Novo Laboratório", "Alterar Laboratório", 1);
                String novoMg = JOptionPane.showInputDialog(null, "Nova Miligrama (Mg)", "Alterar Miligrama", 1);
                String novoQtde = JOptionPane.showInputDialog(null, "Nova Quantidade da embalagem", "Alterar Quantidade", 1);
                String novoPreco = JOptionPane.showInputDialog(null, "Novo Preço", "Alterar Preço", 1);
                String novoQtdeCad = JOptionPane.showInputDialog(null, "Nova Quantidade de Medicamento Cadastrado", "Alterar Quantidade de Cadastrados", 1);
                String novaMargem = JOptionPane.showInputDialog(null, "Nova Margem de Lucro em %", "Alterar Margem de Lucro", 1);
                String novoNomeFant = JOptionPane.showInputDialog(null, "Novo Nome Fantasia do Fabricante", "Alterar Dados do Fabrincante", 1);
                String novoNomeJur = JOptionPane.showInputDialog(null, "Novo Nome Jurídico do Fabricante", "Alterar Dados do Fabrincante", 1);
                String novoCnpj = JOptionPane.showInputDialog(null, "Novo CNPJ do Fabricante", "Alterar Dados do Fabrincante", 1);

                c.setNome(novoNome);
                c.setLaboratorio(novoLab);
                c.setMiligrama(Integer.parseInt(novoMg));
                c.setQtdeComp(Integer.parseInt(novoQtde));
                c.setPreco(Double.parseDouble(novoPreco));
                c.setQtde(Integer.parseInt(novoQtdeCad));
                c.setMargem(Double.parseDouble(novaMargem));
                c.getFabricante().setNomeFant(novoNomeFant);
                c.getFabricante().setNomeJur(novoNomeJur);
                c.getFabricante().setCnpj(Integer.parseInt(novoCnpj));

                return c;
            }

        }
        return null;
    } //Fim Alterar Comprimido
    
    //Alterar Solucao
    public static Solucao alterarSol(Solucao sol) throws LetErrException, NumErrException {
    
        for(Solucao s : BdSol) {
            
            if(s.getCodigo() == sol.getCodigo()) {
           
                String novoNome = JOptionPane.showInputDialog(null, "Novo Nome: ", "Alterar Nome", 1);
                String novoLab = JOptionPane.showInputDialog(null, "Novo Laboratório", "Alterar Laboratório", 1);
                String novoMl = JOptionPane.showInputDialog(null, "Novo Mililitro (ML)", "Alterar Mililitro", 1);
                String novoSabor = JOptionPane.showInputDialog(null, "Novo Sabor", "Alterar Sabor", 1);
                String novoPreco = JOptionPane.showInputDialog(null, "Novo Preço", "Alterar Preço", 1);
                String novoQtdeCad = JOptionPane.showInputDialog(null, "Nova Quantidade de Medicamento Cadastrado", "Alterar Quantidade de Cadastrados", 1); 
                String novaMargem = JOptionPane.showInputDialog(null, "Nova Margem de Lucro em %", "Alterar Margem de Lucro", 1);
                String novoNomeFant = JOptionPane.showInputDialog(null, "Novo Nome Fantasia do Fabricante", "Alterar Dados do Fabrincante", 1);
                String novoNomeJur = JOptionPane.showInputDialog(null, "Novo Nome Jurídico do Fabricante", "Alterar Dados do Fabrincante", 1);
                String novoCnpj = JOptionPane.showInputDialog(null, "Novo CNPJ do Fabricante", "Alterar Dados do Fabrincante", 1);
                
                s.setNome(novoNome);
                s.setLaboratorio(novoLab);
                s.setMililitro(Integer.parseInt(novoMl));
                s.setSabor(novoSabor);
                s.setPreco(Double.parseDouble(novoPreco));
                s.setQtde(Integer.parseInt(novoQtdeCad));
                s.setMargem(Double.parseDouble(novaMargem));
                s.getFabricante().setNomeFant(novoNomeFant);
                s.getFabricante().setNomeJur(novoNomeJur);
                s.getFabricante().setCnpj(Integer.parseInt(novoCnpj));
                
                return s;
            }
        }
        return null;
    } //Fim Alterar Solucao
    
    //Alterar Topico
    public static Topico alterarTop(Topico top) throws LetErrException, NumErrException {
    
        for(Topico t : BdTop) {
            
            if(t.getCodigo() == top.getCodigo()) {
                
                String novoNome = JOptionPane.showInputDialog(null, "Novo Nome: ", "Alterar Nome", 1);
                String novoLab = JOptionPane.showInputDialog(null, "Novo Laboratório", "Alterar Laboratório", 1);
                String novoG = JOptionPane.showInputDialog(null, "Nova Gramagem (G)", "Alterar Gramagem", 1);
                String novoCons = JOptionPane.showInputDialog(null, "Nova Consistência", "Alterar Consistência", 1);
                String novoPreco = JOptionPane.showInputDialog(null, "Novo Preço", "Alterar Preço", 1);
                String novoQtdeCad = JOptionPane.showInputDialog(null, "Nova Quantidade de Medicamento Cadastrado", "Alterar Quantidade de Cadastrados", 1); 
                String novaMargem = JOptionPane.showInputDialog(null, "Nova Margem de Lucro em %", "Alterar Margem de Lucro", 1);
                String novoNomeFant = JOptionPane.showInputDialog(null, "Novo Nome Fantasia do Fabricante", "Alterar Dados do Fabrincante", 1);
                String novoNomeJur = JOptionPane.showInputDialog(null, "Novo Nome Jurídico do Fabricante", "Alterar Dados do Fabrincante", 1);
                String novoCnpj = JOptionPane.showInputDialog(null, "Novo CNPJ do Fabricante", "Alterar Dados do Fabrincante", 1);
                
                t.setNome(novoNome);
                t.setLaboratorio(novoLab);
                t.setGrama(Integer.parseInt(novoG));
                t.setConsistencia(novoCons);
                t.setPreco(Double.parseDouble(novoPreco));
                t.setQtde(Integer.parseInt(novoQtdeCad));
                t.setMargem(Double.parseDouble(novaMargem));
                t.getFabricante().setNomeFant(novoNomeFant);
                t.getFabricante().setNomeJur(novoNomeJur);
                t.getFabricante().setCnpj(Integer.parseInt(novoCnpj));
                
                return t;
            }
        }
        return null;
    } //Fim Alterar Topico 
     
    //Apagar Comprimido
    public static Comprimido apagarComp(Comprimido comp) {
        
        for(Comprimido c : BdComp) {
            if(c.getCodigo() == comp.getCodigo()) {
                BdComp.remove(c);
                return null;
            }
        }
        return comp;
    } //Fim Apagar Comprimido
    
    //Apagar Solucao
    public static Solucao apagarSol(Solucao sol) {
        
        for(Solucao s : BdSol) {
            if(s.getCodigo() == sol.getCodigo()) {
                BdSol.remove(s);
                return null;
            }
        }
        return sol;
    } //Fim Apagar Solucao
    
    //Apagar Topico
    public static Topico apagarTop(Topico top) {
        
        for(Topico t : BdTop) {
            if(t.getCodigo() == top.getCodigo()) {
                BdTop.remove(t);
                return null;
            }
        }
        return top;
    } //Fim Apagar Topico
}
