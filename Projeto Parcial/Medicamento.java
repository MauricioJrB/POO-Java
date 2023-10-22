// Aluno: Mauricio Junior  RA:2525321

import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

public abstract class Medicamento {

	private String nome;
	private String laboratorio;
	private int qtde;
	private double preco;
	private int codigo;
	private Fabricante fabricante;
	private String dataCadastro;
	private double margem;
	
	public Medicamento() {

		nome = "";
		laboratorio = "";
		qtde = 0;
		preco = 0.0;
		codigo = 0;
		this.fabricante = new Fabricante();
		dataCadastro = "";
		margem = 0.0;
	}
	
	public Medicamento(String nome, String laboratorio, int qtde, double preco, int codigo, double margem) {
	
		this.nome = nome;
		this.laboratorio = laboratorio;
		this.qtde = qtde;
		this.preco = preco;
		this.codigo = codigo;
		this.margem = margem;
	} 

	public final String getNome() {
		
		return nome;
	}
	public final void setNome(String nome) throws LetErrExeption{
	
		if(nome.length() >= 1 && nome.length() <= 15) {
			this.nome = nome;
		}
		else {
			throw new LetErrExeption();
		}
	}

	public final String getLaboratorio() {
	
		return laboratorio;
	}
	public final void setLaboratorio(String laboratorio) {
	
		this.laboratorio = laboratorio;
	}

	public final int getQtde() {
		
		return qtde;
	}
	public final void setQtde(int qtde) {

		this.qtde = qtde;
	}

	public double getPreco() {

		return preco;
	}
	public void setPreco(double preco) {

		this.preco = preco;
	}

	public final int getCodigo() {

		return codigo;
	}
	public final void setCodigo(int codigo) throws NumErrException {
		 
		if(codigo >= 100 && codigo <= 999) {
			this.codigo = codigo;
		}
		else {
			throw new NumErrException();
		}
	}

	public final Fabricante getFabricante() {

		return fabricante;
	}
	public final void setFabricante(Fabricante fabricante) {

		this.fabricante = fabricante;
	}

	public double getMargem() {

		return margem;
	}
	public void setMargem(double margem) {

		this.margem = margem;
	}
	
	public abstract double margemLucro();
	
	public final String getDataCadastro() {

		DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
		Date date = new Date();
		return dataCadastro = dateFormat.format(date);
	}
}