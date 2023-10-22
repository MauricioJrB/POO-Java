// Aluno: Mauricio Junior  RA:2525321

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Leitura {

	public String entDados(String rotulo) {

		System.out.print(rotulo);

		InputStreamReader teclado = new InputStreamReader(System.in);
		BufferedReader buff = new BufferedReader(teclado);

		String entrada = "";

		try {
			entrada = buff.readLine();
		} 
		catch (IOException ioe) {
			System.out.println("\nERRO DE ENTRADA!");
		}

		return entrada;
	}
}