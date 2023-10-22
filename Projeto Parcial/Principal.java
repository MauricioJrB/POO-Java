// Aluno: Mauricio Junior  RA:2525321

public class Principal {

	private static Leitura l = new Leitura();
	private static GerenciadorComprimido gDadosComp = new GerenciadorComprimido();
	private static GerenciadorSolucao  gDadosSol = new GerenciadorSolucao();
	private static GerenciadorTopico gDadosTop = new GerenciadorTopico();
	private static Comprimido comp;
	private static Solucao sol;
	private static Topico top;
	public static void main(String arg[]) {

		int opcao;
		boolean executeMenu = true;

		while(executeMenu) {	

			impMenu();
			try {
				opcao = Integer.parseInt(l.entDados("\nEscolha uma opcao..: "));
			}
			catch(NumberFormatException nfe) {
				 l.entDados("");
				continue;
			}

			switch(opcao) {
				case 1:
			
					boolean executeCadastro = true;
					while(executeCadastro) {

						int opcaoCadastro;
						impMenuCadastro();
						try {
							opcaoCadastro = Integer.parseInt(l.entDados("\nEscolha uma Opcao para Cadastrar: "));
						}
						catch(NumberFormatException nfe) {
							l.entDados("");
						   continue;
						}
					   	switch(opcaoCadastro) {

							case 1:
								comp = new Comprimido();
								gDadosComp.cadComp(comp);
								if(comp != null) {
									l.entDados("\nCadastro realizado - pressione ENTER para continuar...");
								}
								else {
									l.entDados("\nMedicamento ja foi cadastrado! - Pressione ENTER para continuar...");
								}
								break;
							case 2:
								sol = new Solucao();
								gDadosSol.cadSol(sol);
								if(comp != null) {
									l.entDados("\nCadastro realizado - pressione ENTER para continuar...");
								}
								else {
									l.entDados("\nMedicamento ja foi cadastrado! - Pressione ENTER para continuar...");
								}
								break;	
							case 3:
								top = new Topico();
								gDadosTop.cadTop(top);
								if(comp != null) {
									l.entDados("\nCadastro realizado - pressione ENTER para continuar...");
								}
								else {
									l.entDados("\nMedicamento ja foi cadastrado! - Pressione ENTER para continuar...");
								}
							case 0:
								System.out.println("\nSaindo...");
								executeCadastro = false;
								break;	
							default:
								l.entDados("\nDigite um número de 0 a 3 - Pressione ENTER para continuar...");
								break;	
						}		
					}
				break;		
				case 2:
					
					boolean executeConsulta = true;
					while(executeConsulta) {

						int opcaoConsulta;
						impMenuConsulta();
						try {
							opcaoConsulta = Integer.parseInt(l.entDados("\nEscolha uma Opcao para Consultar: "));
						}
						catch(NumberFormatException nfe) {
							l.entDados("");
							continue;
						}

						switch(opcaoConsulta) {
							case 1:
								comp = new Comprimido();
								try {
									comp.setCodigo(Integer.parseInt(l.entDados("\nCODIGO a ser consultado: ")));
								} 
								catch (NumErrException nee) {
									nee.impMsgCodErr();
									comp = nee.corrCodComp(comp);
								}	

								catch(NumberFormatException nfe){
									System.out.println("\nO Codigo deve ser um numero");
								}
								comp = gDadosComp.consCompCod(comp);
								if(comp != null) {
									gDadosComp.impComp(comp);
								}
								else {
									l.entDados("\nCODIGO não registrado no Sistema - Pressione ENTER para continuar...");
								}
								break;
							case 2:
								sol = new Solucao();
								try {
									sol.setCodigo(Integer.parseInt(l.entDados("\nCODIGO a ser consultado: ")));
								} 
								catch (NumErrException nee) {
									nee.impMsgCodErr();
									sol = nee.corrCodSol(sol);
								}	

								catch(NumberFormatException nfe){
									System.out.println("\nO Codigo deve ser um numero");
								}
								sol = gDadosSol.consSolCod(sol);
								if(sol != null) {
									gDadosSol.impSol(sol);
								}
								else {
									l.entDados("\nCODIGO não registrado no Sistema - Pressione ENTER para continuar...");
								}
								break;	
							case 3:
								top = new Topico();
								try {
									top.setCodigo(Integer.parseInt(l.entDados("\nCODIGO a ser consultado: ")));
								} 
								catch (NumErrException nee) {
									nee.impMsgCodErr();
									top = nee.corrCodTop(top);
								}	

								catch(NumberFormatException nfe){
									System.out.println("\nO Codigo deve ser um numero");
								}
								top = gDadosTop.consTopCod(top);
								if(top != null) {
									gDadosTop.impTop(top);
								}
								else {
									l.entDados("\nCODIGO não registrado no Sistema - Pressione ENTER para continuar...");
								}
								break;	
							case 0: 
								System.out.println("\nSaindo...");
								executeConsulta = false;
								break;		
							default:
								l.entDados("\nDigite um número de 0 a 3 - Pressione ENTER para continuar...");
								break;	
						}
					}
					break;	

				case 3:

					boolean executeAlterar = true;
					while(executeAlterar) {

						int opcaoAltera;
						impMenuAltera();
						try {
							opcaoAltera = Integer.parseInt(l.entDados("\nEscolha uma Opcao para Alterar: "));
						}
						catch(NumberFormatException nfe) {
							l.entDados("");
							continue;
						}
						switch(opcaoAltera) {
							case 1:
								comp = new Comprimido();
								try {
									comp.setCodigo(Integer.parseInt(l.entDados("\nCODIGO a ser consultado: ")));
								} 
								catch (NumErrException nee) {
									nee.impMsgCodErr();
									comp = nee.corrCodComp(comp);
								}	

								catch(NumberFormatException nfe){
									System.out.println("\nO Codigo deve ser um numero");
								}
								comp = gDadosComp.alteraComp(comp);
								if(comp != null) {
									gDadosComp.impComp(comp);
								}
								else {
									l.entDados("\nMedicamento nao encontrado = Pressione ENTER para continuar...");
								}
								break;
							case 2:
								sol = new Solucao();
								try {
									sol.setCodigo(Integer.parseInt(l.entDados("\nCODIGO a ser consultado: ")));
								} 
								catch (NumErrException nee) {
									nee.impMsgCodErr();
									sol = nee.corrCodSol(sol);
								}	

								catch(NumberFormatException nfe){
									System.out.println("\nO Codigo deve ser um numero");
								}
								sol = gDadosSol.alteraSol(sol);
								if(sol != null) {
									gDadosSol.impSol(sol);
								}
								else {
									l.entDados("\nMedicamento nao encontrado = Pressione ENTER para continuar...");
								}
								break;	
							case 3:
								top = new Topico();
								try {
									top.setCodigo(Integer.parseInt(l.entDados("\nCODIGO a ser consultado: ")));
								} 
								catch (NumErrException nee) {
									nee.impMsgCodErr();
									top = nee.corrCodTop(top);
								}	

								catch(NumberFormatException nfe){
									System.out.println("\nO Codigo deve ser um numero");
								}
								top = gDadosTop.alteraTop(top);
								if(top != null) {
									gDadosTop.impTop(top);
								}
								else {
									l.entDados("\nMedicamento nao encontrado - Pressione ENTER para continuar...");
								}
								break;
							case 0: 
								System.out.println("\nSaindo...");
								executeAlterar = false;
								break;	
							default:
								l.entDados("\nDigite um número de 0 a 3 - Pressione ENTER para continuar...");
								break;	
						}
					}
					break;	
				case 4:
					boolean executeExcluir = true;
					while(executeExcluir) {
							
						int opcaoExclui;
						impMenuExclui();
						try {
							opcaoExclui= Integer.parseInt(l.entDados("\nEscolha uma Opcao para Excluir: "));
						}
						catch(NumberFormatException nfe) {
							l.entDados("");
							continue;
						}
						switch(opcaoExclui) {
							case 1:
								comp = new Comprimido();
								try {
									comp.setCodigo(Integer.parseInt(l.entDados("\nCODIGO a ser consultado: ")));
								} 
								catch (NumErrException nee) {
									nee.impMsgCodErr();
									comp = nee.corrCodComp(comp);
								}	

								catch(NumberFormatException nfe){
									System.out.println("\nO Codigo deve ser um numero");
								}
								comp = gDadosComp.excluiComp(comp);
								if(comp != null) {
									l.entDados("\nMedicamento nao encontrado - Pressione ENTER para continuar...");
								}
								else {
									l.entDados("\nMedicamento exlcuido com sucesso - Pressione ENTER para continuar...");
								}
								break;

							case 2:
								sol = new Solucao();
								try {
									sol.setCodigo(Integer.parseInt(l.entDados("\nCODIGO a ser consultado: ")));
								} 
								catch (NumErrException nee) {
									nee.impMsgCodErr();
									sol = nee.corrCodSol(sol);
								}	
								sol = gDadosSol.excluiSol(sol);
								if(sol != null) {
									l.entDados("\nMedicamento nao encontrado - Pressione ENTER para continuar...");
								}
								else {
									l.entDados("\nMedicamento exlcuido com sucesso - Pressione ENTER para continuar...");
								}
								break;

							case 3: 	
								top = new Topico();
								try {
									top.setCodigo(Integer.parseInt(l.entDados("\nCODIGO a ser consultado: ")));
								} 
								catch (NumErrException nee) {
									nee.impMsgCodErr();
									top = nee.corrCodTop(top);
								}	

								catch(NumberFormatException nfe){
									System.out.println("\nO Codigo deve ser um numero");
								}
								top = gDadosTop.excluiTop(top);
								if(top != null) {
									l.entDados("\nMedicamento nao encontrado - Pressione ENTER para continuar...");
								}
								else {
									l.entDados("\nMedicamento exlcuido com sucesso - Pressione ENTER para continuar...");
								}
								break;

							case 0: 
								System.out.println("\nSaindo...");
								executeExcluir = false;
								break;	
							default:
								l.entDados("\nDigite um número de 0 a 3 - Pressione ENTER para continuar...");
								break;	
							}
						}
					break;
				case 5:
					
					boolean executeImprimir = true;
					while(executeImprimir) {

						int opcaoImprime;
						impMenuImpTodos();
						try {
							opcaoImprime = Integer.parseInt(l.entDados("\nEscolha uma Opcao para Imprimir dados: "));
						}
						catch(NumberFormatException nfe) {
							l.entDados("");
							continue;
						}
						switch(opcaoImprime) {
							case 1:
								gDadosComp.impTodosComp();
								break;
							case 2:
								gDadosSol.impTodosSol();
								break;
							case 3: 
								gDadosTop.impTodosTop();
								break;		
							case 0:
								System.out.println("\nSaindo...");
								executeImprimir = false;
								break;
							default:
								l.entDados("\nDigite um número de 0 a 3 - Pressione ENTER para continuar...");
								break;		
							}
						}
						break;
				case 6:
						
					boolean executeTabela = true;
					while(executeTabela) {

						int opcaoTabela;
						impTabelaVendas();
						try {
							opcaoTabela = Integer.parseInt(l.entDados("\nEscolha uma Opcao para imprimir a tabela de vendas: "));
						}
						catch(NumberFormatException nfe) {
							l.entDados("");
							continue;
						}
						switch(opcaoTabela) {
							case 1:
								gDadosComp.impTabVendaComp();
								break;
							case 2:
								gDadosSol.impTabVendaSol();
								break;	
							case 3: 
								gDadosTop.impTabVendaTop();
								break;	
							case 0:
								System.out.println("\nSaindo...");
								executeTabela = false;
								break;	
							default:
								l.entDados("\nDigite um número de 0 a 3 - Pressione ENTER para continuar...");
								break;	
						}
					}
					break;
				case 0:
					System.out.println("\nENCERRANDO MENU...\n");
					executeMenu = false;
					break;	
				default:
					l.entDados("\nDigite um número de 0 a 6 - Pressione ENTER para continuar...");
					break;
			}//FIM SWITCH CASE
		}//FIM MENU
	}//Fim MAIN
			
	public static void impMenu() {

		System.out.println("\n\n=================================");
		System.out.println("|             MENU              |");
		System.out.println("=================================");
		System.out.println("[1] Cadastrar Medicamento....: ");
		System.out.println("[2] Consultar Medicamento....: ");
		System.out.println("[3] Alterar Medicamento......: ");
		System.out.println("[4] Excluir Medicamento......: ");
		System.out.println("[5] Imprimir Medicamentos....: ");
		System.out.println("[6] Imprimir tabela de vendas: ");
		System.out.println("[0] Sair");
	}

	public static void impMenuCadastro() {

		System.out.println("\n|===============================|");
		System.out.println("|        MENU CADASTRO          |");
		System.out.println("|===============================|");
		System.out.println("[1] Cadastrar Comprimido...: ");
		System.out.println("[2] Cadastrar Solucao......: ");
		System.out.println("[3] Cadastrar Topico.......: ");
		System.out.println("[0] Sair do Cadastro.......: ");
	}

	public static void impMenuConsulta() {

		System.out.println("\n|=============================|");
		System.out.println("|        MENU CONSULTA        |");
		System.out.println("|=============================|");
		System.out.println("[1] Consultar Comprimido...: ");
		System.out.println("[2] Consultar Solucao......: ");
		System.out.println("[3] Consultar Topico.......: ");
		System.out.println("[0] Sair do Consulta.......: ");
	}

	public static void impMenuAltera() {

		System.out.println("\n|======================|");
		System.out.println("|       MENU ALTERA      |");
		System.out.println("|========================|");
		System.out.println("[1] Alterar Comprimido...: ");
		System.out.println("[2] Alterar Solucao......: ");
		System.out.println("[3] Alterar Topico.......: ");
		System.out.println("[0] Sair do Altera.......: ");
	}

	public static void impMenuExclui() {

		System.out.println("\n|======================|");
		System.out.println("|       MENU EXCLUIR     |");
		System.out.println("|========================|");
		System.out.println("[1] Excluir Comprimido...: ");
		System.out.println("[2] Excluir Solucao......: ");
		System.out.println("[3] Excluir Topico.......: ");
		System.out.println("[0] Sair do Excluir......: ");
	}

	public static void impMenuImpTodos() {

		System.out.println("\n|======================|");
		System.out.println("|       MENU IMPRIME     |");
		System.out.println("|========================|");
		System.out.println("[1] Imprimir Comprimido...: ");
		System.out.println("[2] Imprimir Solucao......: ");
		System.out.println("[3] Imprimir Topico.......: ");
		System.out.println("[0] Sair do Imprimir......: ");
	}

	public static void impTabelaVendas() {

		System.out.println("\n|=======================|");
		System.out.println("| MENU TABELA DE VENDAS |");
		System.out.println("|=======================|");
		System.out.println("[1] Tabela Comprimido...: ");
		System.out.println("[2] Tabela Solucao......: ");
		System.out.println("[3] Tabela Topico.......: ");
		System.out.println("[0] Sair da Tabela......: ");
	}
}	