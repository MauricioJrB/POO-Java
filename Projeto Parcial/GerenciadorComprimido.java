// Aluno: Mauricio Junior  RA:2525321

import java.util.ArrayList;
import java.util.List;

public class GerenciadorComprimido {

	private  Leitura l = new Leitura();
	private List<Comprimido> listaComp = new ArrayList<Comprimido>();

	public Comprimido cadComp(Comprimido comp) {
		
		System.out.println("\n========================");
		System.out.println("|Cadastro de Comprimido|");
		System.out.println("========================");
		try {
			comp.setNome(l.entDados("Nome..: "));
		}
		catch(LetErrExeption lee) {
            lee.impMsgNomeErr();
            comp = lee.corrNomeComp(comp);
        }
		comp.setLaboratorio(l.entDados("Laboratorio..: "));
		comp.setQtdeComp(Integer.parseInt(l.entDados("Quantidade de comprimidos..: ")));
		comp.setMiligrama(Integer.parseInt(l.entDados("Miligrama..: ")));
		comp.setPreco(Double.parseDouble(l.entDados("Preco..: ")));
		try {
			comp.setCodigo(Integer.parseInt(l.entDados("Codigo..: ")));	
		}
		catch (NumErrException nee) {
			nee.impMsgCodErr();
			comp = nee.corrCodComp(comp);
		}	
		catch(NumberFormatException nfe){
			System.out.println("\nO Codigo deve ser um numero");
		}
		comp.setMargem(Double.parseDouble(l.entDados("Margem do Lucro em % ..:")));
		System.out.println("===================");
		System.out.println("Dados do Fabricante");
		System.out.println("===================");
		comp.getFabricante().setNomeJur(l.entDados("Nome Juridico..: "));
		comp.getFabricante().setNomeFant(l.entDados("Nome Fantasia..: "));
		try {
			comp.getFabricante().setCnpj(Integer.parseInt(l.entDados("CNPJ..: ")));
		}
		catch (NumErrException nee) {
			nee.impMsgCnpjErr();
			comp = nee.corrCnpjComp(comp);
		}	
		catch(NumberFormatException nfe){
			System.out.println("\nO CNPJ deve ser um numero!");
		}
		if(consCompCod(comp) == null) {
			listaComp.add(comp);
			return comp;
		}
		return null;
	}

	public Comprimido consCompCod(Comprimido comp) {

		for (Comprimido c : listaComp) {
			if (comp.getCodigo() == c.getCodigo()) {
				return c;
			}
		}
		return null;
	}

	public void impComp(Comprimido comp) {

			System.out.println("\n=====================================");
			System.out.println("| Medicamento Comprimido Cadastrado |");
			System.out.println("=====================================");
			System.out.println("Nome do remedio: " + comp.getNome());
			System.out.println("Laboratorio: " + comp.getLaboratorio());
			System.out.println("Quantidade: " + comp.getQtdeComp());
			System.out.println("Miligrama..: " + comp.getMiligrama());
			System.out.println("Preco: " + comp.getPreco());
			System.out.println("Codigo: " + comp.getCodigo());
			System.out.println("Margem..: " + comp.getMargem());
			System.out.println("===================");
			System.out.println("Dados do Fabricante");
			System.out.println("===================");
			System.out.println("Nome Juridico..: " + comp.getFabricante().getNomeJur());
			System.out.println("Nome Fantasia..: " + comp.getFabricante().getNomeFant());
			System.out.println("CNPJ..: " + comp.getFabricante().getCnpj());
			System.out.println("Data Cadastro..: " + comp.getDataCadastro());
	}	

	public Comprimido alteraComp(Comprimido comp) {

		for (Comprimido novoComp : listaComp) {
			if (comp.getCodigo() == novoComp.getCodigo()) {
				novoComp.setPreco(Double.parseDouble(l.entDados("Novo Preco..: ")));
				novoComp.setMargem(Double.parseDouble(l.entDados("Nova Margem %..: ")));
				return novoComp;
			}
		}
		return null;
	}

	public void impTodosComp() {

		for(Comprimido novoComp : listaComp) {
			System.out.println("\n=====================================");
			System.out.println("| Medicamento Comprimido Cadastrado |");
			System.out.println("=====================================");
			System.out.println("Nome do remedio: " + novoComp.getNome());
			System.out.println("Laboratorio: " + novoComp.getLaboratorio());
			System.out.println("Quantidade: " + novoComp.getQtdeComp());
			System.out.println("Miligrama..: " + novoComp.getMiligrama());
			System.out.println("Preco: " + novoComp.getPreco());
			System.out.println("Codigo: " + novoComp.getCodigo());
			System.out.println("Margem..: " + novoComp.getMargem());
			System.out.println("===================");
			System.out.println("Dados do Fabricante");
			System.out.println("===================");
			System.out.println("Nome Juridico..: " + novoComp.getFabricante().getNomeJur());
			System.out.println("Nome Fantasia..: " + novoComp.getFabricante().getNomeFant());
			System.out.println("CNPJ..: " + novoComp.getFabricante().getCnpj());
			System.out.println("Data Cadastro..: " + novoComp.getDataCadastro());
		}
	}

	public Comprimido excluiComp(Comprimido comp) {
		
		for(Comprimido novoComp : listaComp) {
			if(comp.getCodigo() == novoComp.getCodigo()) {
				listaComp.remove(novoComp);
				return null;
			}
		}
		return comp;
	}

	public void impTabVendaComp() {
			 
	int nome = 15;
	int miligrama = 10;
	int laboratorio = 15;
	int preco = 10;
	int codigo = 10;

	System.out.println("\n|========================================================================|");
	System.out.printf("|%-" + nome + "s | %-"+ miligrama + "s | %-" + laboratorio + "s | %-" + preco + "s | %-" + codigo + "s|\n", "NOME", "MILIGRAMA", "LABORATORIO", "PRECO", "CODIGO");
	System.out.println("|================|============|=================|============|===========|");	 
	for (Comprimido novoComp : listaComp) {
   		System.out.printf("|%-" + nome + "s | %-"+ miligrama + "d | %-" + laboratorio + "s | %-" + preco + ".2f | %-" + codigo  + "d|\n", novoComp.getNome(), novoComp.getMiligrama(), novoComp.getLaboratorio(), novoComp.margemLucro(), novoComp.getCodigo());
	}
	System.out.println("|========================================================================|");

	}
}