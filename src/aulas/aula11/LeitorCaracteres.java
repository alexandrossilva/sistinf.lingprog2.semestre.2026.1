package aulas.aula11;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class LeitorCaracteres {

	public static void main(String[] args) {
		FileReader fluxoArq = null;
		try {
			fluxoArq = new FileReader("src/aulas/aula11/texto2.txt");
			BufferedReader fluxoBuff = new BufferedReader(fluxoArq);			
			
			String linha = null;
			
			while ((linha = fluxoBuff.readLine()) != null) {
				System.out.println(linha);
			}
			
			fluxoBuff.close();
			fluxoArq.close();
		} catch (FileNotFoundException e) {
			System.out.println("Arquivo não encontrado!");
		} catch (IOException e) {
			System.out.println("Erro de entrada/saída!");
		}			
	}

}
