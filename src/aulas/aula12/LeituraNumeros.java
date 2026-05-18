package aulas.aula12;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class LeituraNumeros {

	public static void main(String[] args) {
		FileReader leitorArq = null;
		try {
			leitorArq = new FileReader("src/aulas/aula11/numeros.txt");
			BufferedReader leitorBuffer = new BufferedReader(leitorArq);			
			
			String linha = null;
			int total = 0;
			int qtd = 0;
			
			while ((linha = leitorBuffer.readLine()) != null) {
				total = total + Integer.parseInt(linha);
				qtd++;
			}
			
			double media = (double)total / (double)qtd;
			
			System.out.println("Média: " + media);
			
			leitorBuffer.close();
			leitorArq.close();
		} catch (FileNotFoundException e) {
			System.out.println("Arquivo não encontrado!");
		} catch (IOException e) {
			System.out.println("Erro de entrada/saída!");
		}			
	}

}
