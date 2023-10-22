// Aluno: Mauricio Junior  RA:2525321

import java.util.ArrayList;
import java.util.List;

public class GerenciadorSolucao {

	private  Leitura l = new Leitura();
	private List<Solucao> listaSol = new ArrayList<Solucao>();

	public Solucao cadSol(Solucao sol) {

		System.out.println("\n=====================");
		System.out.println("|Cadastro de Solucao|");
		System.out.println("=====================");
		try {
			sol.setNome(l.entDados("Nome..: "));		
		}
		catch (LetErrExeption lee) {
			lee.impMsgNomeErr();
			sol = lee.corrNomeSol(sol);
		}			
		sol.setLaboratorio(l.entDados("Laboratorio..: "));
		sol.setMililitro(Integer.parseInt(l.entDados("Quantidade de ML..: ")));
		sol.setSabor(l.entDados("Sabor..: "));
		sol.setPreco(Double.parseDouble(l.entDados("Preco..: ")));
		try {
			sol.setCodigo(Integer.parseInt(l.entDados("Codigo..: ")));
		}	
		catch (NumErrException nee) {
			nee.impMsgCodErr();
			sol = nee.corrCodSol(sol);
		}	
		catch(NumberFormatException nfe){
			System.out.println("\nO Codigo deve ser um numero!");
		}
		sol.setMargem(Double.parseDouble(l.entDados("Margem do Lucro em % ..: ")));		
		System.out.println("===================");
		System.out.println("Dados do Fabricante");
		System.out.println("===================");
		sol.getFabricante().setNomeJur(l.entDados("Nome Juridico..: "));
		sol.getFabricante().setNomeFant(l.entDados("Nome Fantasia..: "));	
		try {
			sol.getFabricante().setCnpj(Integer.parseInt(l.entDados("CNPJ..: ")));
		}
		catch (NumErrException nee) {
			nee.impMsgCnpjErr();
			sol = nee.corrCnpjSol(sol);
		}	
		catch(NumberFormatException nfe){
			System.out.println("\nO CNPJ deve ser um numero!");
		}
		if(consSolCod(sol) == null) {
			listaSol.add(sol);
			return sol;
		}
		return null;
	}

	public Solucao consSolCod(Solucao sol) {

		for(Solucao novoSol : listaSol) {
			if(sol.getCodigo() == novoSol.getCodigo()) {
				return novoSol;
			}
		}
		return null;
	}
				
	public void impSol(Solucao sol) {		

			System.out.println("\n==================================");
			System.out.println("| Medicamento Solucao Cadastrado |");
			System.out.println("==================================");
			System.out.println("Nome do remedio: " + sol.getNome());
			System.out.println("Laboratorio: " + sol.getLaboratorio());
			System.out.println("Quantidade: " + sol.getMililitro() + "/ML");
			System.out.println("Sabor..: " + sol.getSabor());
			System.out.println("Preco: " + sol.getPreco());
			System.out.println("Codigo: " + sol.getCodigo());
			System.out.println("Margem..: " + sol.getMargem());
			System.out.println("===================");
			System.out.println("Dados do Fabricante");
			System.out.println("===================");
			System.out.println("Nome Juridico..: " + sol.getFabricante().getNomeJur());
			System.out.println("Nome Fantasia..: " + sol.getFabricante().getNomeFant());
			System.out.println("CNPJ..: " + sol.getFabricante().getCnpj());
			System.out.println("Data Cadastro..: " + sol.getDataCadastro());
	}	

	public Solucao alteraSol(Solucao sol) {

		for (Solucao novoSol : listaSol) {
			if (sol.getCodigo() == novoSol.getCodigo()) {
				novoSol.setPreco(Double.parseDouble(l.entDados("Novo Preco..: ")));
				novoSol.setMargem(Double.parseDouble(l.entDados("Nova Margem %..: ")));
				return novoSol;
			}
		}
		return null;
	}

	public Solucao excluiSol(Solucao sol) {
		
		for(Solucao novoSol : listaSol) {
			if(sol.getCodigo() == novoSol.getCodigo()) {
				listaSol.remove(novoSol);
				return null;
			}
		}
		return sol;
	}

	public void impTodosSol() {

		for(Solucao novoSol : listaSol) {
			System.out.println("\n==================================");
			System.out.println("| Medicamento Solucao Cadastrado |");
			System.out.println("==================================");
			System.out.println("Nome do remedio: " + novoSol.getNome());
			System.out.println("Laboratorio: " + novoSol.getLaboratorio());
			System.out.println("Quantidade: " + novoSol.getMililitro() + "/ML");
			System.out.println("Sabor..: " + novoSol.getSabor());
			System.out.println("Preco: " + novoSol.getPreco());
			System.out.println("Codigo: " + novoSol.getCodigo());
			System.out.println("Margem..: " + novoSol.getMargem());
			System.out.println("===================");
			System.out.println("Dados do Fabricante");
			System.out.println("===================");
			System.out.println("Nome Juridico..: " + novoSol.getFabricante().getNomeJur());
			System.out.println("Nome Fantasia..: " + novoSol.getFabricante().getNomeFant());
			System.out.println("CNPJ..: " + novoSol.getFabricante().getCnpj());
			System.out.println("Data Cadastro..: " + novoSol.getDataCadastro());
		}
	}
	public void impTabVendaSol() {
			 
		int nome = 15;
		int mililitro = 10;
		int laboratorio = 15;
		int preco = 10;
		int codigo = 10;

		System.out.println("\n|========================================================================|");
		System.out.printf("|%-" + nome + "s | %-"+ mililitro + "s | %-" + laboratorio + "s | %-" + preco + "s | %-" + codigo + "s|\n", "NOME", "MILILITRO", "LABORATORIO", "PRECO", "CODIGO");
		System.out.println("|================|============|=================|============|===========|");	 
		for (Solucao novoSol : listaSol) {
   			System.out.printf("|%-" + nome + "s | %-"+ mililitro + "d | %-" + laboratorio + "s | %-" + preco + ".2f | %-" + codigo  + "d|\n", novoSol.getNome(), novoSol.getMililitro(), novoSol.getLaboratorio(), novoSol.margemLucro(), novoSol.getCodigo());
		}
		System.out.println("|========================================================================|");
	}
}