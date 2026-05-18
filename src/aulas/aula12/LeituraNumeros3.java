package aulas.aula12;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class LeituraNumeros3 {

	public static void main(String[] args) {
		FileReader leitorArq = null;
		try {
			leitorArq = new FileReader("src/aulas/aula12/numeros.txt");
			BufferedReader leitorBuffer = new BufferedReader(leitorArq);			
			
			String linha = null;
			int total = 0;
			int qtd = 0;
			
			while ((linha = leitorBuffer.readLine()) != null) {
				int n = Integer.parseInt(linha);
				total = total + n;
				qtd++;
				
				if (n % 2 == 0) {
					System.out.println("O doblo de " + n + " é " + (n * 2));
				}
				else {
					System.out.println("A raiz quadrada de " + n + " é " + Math.sqrt(n));					
				}
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
