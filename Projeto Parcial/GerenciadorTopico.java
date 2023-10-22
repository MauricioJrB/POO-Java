// Aluno: Mauricio Junior  RA:2525321

import java.util.ArrayList;
import java.util.List;

public class GerenciadorTopico {

	private  Leitura l = new Leitura();
	private List<Topico> listaTop = new ArrayList<Topico>();

	public Topico cadTop(Topico top) {	

		System.out.println("\n======================");
		System.out.println("| Cadastro de Topico |");
		System.out.println("======================");
		try {
			top.setNome(l.entDados("Nome..: "));
		}
		catch(LetErrExeption lee) {
			lee.impMsgNomeErr();
			top = lee.corrNomeTop(top);
		}
		
		top.setLaboratorio(l.entDados("Laboratorio..: "));
		top.setGrama(Integer.parseInt(l.entDados("Gramagem (g)..: ")));
		top.setConsistencia(l.entDados("Consistencia..: "));
		top.setPreco(Double.parseDouble(l.entDados("Preco..: ")));
		try {
			top.setCodigo(Integer.parseInt(l.entDados("Codigo..: ")));
		}
		catch (NumErrException nee) {
			nee.impMsgCodErr();
			top = nee.corrCodTop(top);
		}	
		catch(NumberFormatException nfe){
			System.out.println("\nO Codigo deve ser um numero!");
		}
		top.setMargem(Double.parseDouble(l.entDados("Margem do Lucro em % ..: ")));
		System.out.println("===================");
		System.out.println("Dados do Fabricante");
		System.out.println("===================");
		top.getFabricante().setNomeJur(l.entDados("Nome Juridico..: "));
		top.getFabricante().setNomeFant(l.entDados("Nome Fantasia..: "));
		try {
			top.getFabricante().setCnpj(Integer.parseInt(l.entDados("CNPJ..: ")));
		}
		catch (NumErrException nee) {
			nee.impMsgCnpjErr();
			top = nee.corrCnpjTop(top);
		}	
		catch(NumberFormatException nfe){
			System.out.println("\nO CNPJ deve ser um numero!");
		}	
		if(consTopCod(top) == null) {
			listaTop.add(top);
			return top;
		}
		return null;
	}

	public Topico consTopCod(Topico top) {

		for(Topico novoTop : listaTop) {
			if(top.getCodigo() == novoTop.getCodigo()) {
				return novoTop;
			}
		}
		return null;
	}	
					
	public void impTop(Topico top) {
		 
			System.out.println("\n=================================");
			System.out.println("| Medicamento Topico Cadastrado |");
			System.out.println("=================================");
			System.out.println("Nome do remedio: " + top.getNome());
			System.out.println("Laboratorio: " + top.getLaboratorio());
			System.out.println("Gramagem (g): " + top.getGrama() + "g");
			System.out.println("Consistencia..: " + top.getConsistencia());
			System.out.println("Preco: " + top.getPreco());
			System.out.println("Codigo: " + top.getCodigo());
			System.out.println("Margem..: " + top.getMargem());
			System.out.println("===================");
			System.out.println("Dados do Fabricante");
			System.out.println("===================");
			System.out.println("Nome Juridico..: " + top.getFabricante().getNomeJur());
			System.out.println("CNPJ..: " + top.getFabricante().getCnpj());
			System.out.println("Data Cadastro..: " + top.getDataCadastro());
	}

	public Topico alteraTop(Topico top) {

		for(Topico novoTop : listaTop) {
			if(top.getCodigo() == novoTop.getCodigo()) {
				novoTop.setPreco(Double.parseDouble(l.entDados("Novo Preco..: ")));
				novoTop.setMargem(Double.parseDouble(l.entDados("Nova Margem..: ")));
				return novoTop;
			}
		}
		return null;
	}

	public void impTodosTop() {

		for(Topico novoTop: listaTop) {
			System.out.println("\n=================================");
			System.out.println("| Medicamento Topico Cadastrado |");
			System.out.println("=================================");
			System.out.println("Nome do remedio: " + novoTop.getNome());
			System.out.println("Laboratorio: " + novoTop.getLaboratorio());
			System.out.println("Gramagem (g): " + novoTop.getGrama() + "g");
			System.out.println("Consistencia..: " + novoTop.getConsistencia());
			System.out.println("Preco: " + novoTop.getPreco());
			System.out.println("Codigo: " + novoTop.getCodigo());
			System.out.println("Margem..: " + novoTop.getMargem());
			System.out.println("===================");
			System.out.println("Dados do Fabricante");
			System.out.println("===================");
			System.out.println("Nome Juridico..: " + novoTop.getFabricante().getNomeJur());
			System.out.println("CNPJ..: " + novoTop.getFabricante().getCnpj());
			System.out.println("Data Cadastro..: " + novoTop.getDataCadastro());
		}
	}

	public Topico excluiTop(Topico top) {
		
		for(Topico novoTop : listaTop) {
			if(top.getCodigo() == novoTop.getCodigo()) {
				listaTop.remove(novoTop);
				return null;
			}
		}
		return top;
	}

	public void impTabVendaTop() {
			 
		int nome = 15;
	
		int grama = 10;
		int laboratorio = 15;
		int preco = 10;
		int codigo = 10;

		System.out.println("\n|========================================================================|");
		System.out.printf("|%-" + nome + "s | %-"+ grama + "s | %-" + laboratorio + "s | %-" + preco + "s | %-" + codigo + "s|\n", "NOME", "MILILITRO", "LABORATORIO", "PRECO", "CODIGO");
		System.out.println("|================|============|=================|============|===========|");	 
		for (Topico novoTop : listaTop) {
   			System.out.printf("|%-" + nome + "s | %-"+ grama + "d | %-" + laboratorio + "s | %-" + preco + ".2f | %-" + codigo  + "d|\n", novoTop.getNome(), novoTop.getGrama(), novoTop.getLaboratorio(), novoTop.margemLucro(), novoTop.getCodigo());
		}
		System.out.println("|========================================================================|");
	}
}