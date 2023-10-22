// Aluno: Mauricio Junior  RA:2525321

public class Solucao extends Medicamento implements Calcular {

	private int mililitro;
	private String sabor;

	public Solucao() {

		mililitro = 0;
		sabor = "";
	}
	//Sobrecarga
	public Solucao(int mililitro, String sabor) {

		this.mililitro = mililitro;
		this.sabor = sabor;
	}

	public int getMililitro() {

		return mililitro;
	}
	public void setMililitro(int mililitro) {

		this.mililitro = mililitro;
	}

	public String getSabor() {

		return sabor;
	}
	public void setSabor(String sabor) {
		
		this.sabor = sabor;
	}
	//Sobrescrita
	public double margemLucro() {

		return  getPreco() * (1 + getMargem() / 100.0);
	}
}