// Aluno: Mauricio Junior de Brito RA: 2525321

public class Fabricante {

	private String nomeFant;
	private String nomeJur;
	private int cnpj;

	public Fabricante() {
		
		nomeFant = "";
		nomeJur = "";
		cnpj = 00000;
	}

	public Fabricante(String nomeFant, String nomeJur, int cnpj) {

		this.nomeFant = nomeFant;
		this.nomeJur = nomeJur;
		this.cnpj = cnpj;
	}

	public String getNomeFant() {

		return nomeFant;
	}
	public void setNomeFant(String nomeFant) {

		this.nomeFant = nomeFant;
	}
	
	public String getNomeJur() {

		return nomeJur;
	}
	public void setNomeJur(String nomeJur) {

		this.nomeJur = nomeJur;
	}

	public long getCnpj() {

		return cnpj;
	}
	public void setCnpj(int cnpj) throws NumErrException {
		if(cnpj >= 10000 && cnpj <= 99999) {
			this.cnpj = cnpj;
		}
		else {
			throw new NumErrException();
		}
	}
}