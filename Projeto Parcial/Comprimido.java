// Aluno: Mauricio Junior de Brito   RA: 2525321

public class Comprimido extends Medicamento implements Calcular {

	private int qtdeComp;
	private int miligrama;

	public Comprimido() {

		qtdeComp = 0;
		miligrama = 0;
	}
	//Sobrecarga
	public Comprimido(int qtdeComp, int miligrama) {
        
        this.qtdeComp = qtdeComp;
        this.miligrama = miligrama;
    }

	public int getQtdeComp() {

		return qtdeComp;
	}
	public void setQtdeComp(int qtdeComp) {

		this.qtdeComp = qtdeComp;
	}

	public int getMiligrama() {

		return miligrama;
	}
	public void setMiligrama(int miligrama) {

		this.miligrama = miligrama;
	}
	//Sobrescrita
	public double margemLucro() {

		return  getPreco() *  (1 + getMargem() / 100.0);
	}
}