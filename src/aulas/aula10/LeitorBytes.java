package aulas.aula10;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class LeitorBytes {

	public static void main(String[] args) {
		FileInputStream fluxo;
		try {
			fluxo = new FileInputStream("texto.txt");
			int byteLido;
			
			do {
				byteLido = fluxo.read();
				System.out.print(byteLido);
			} while (byteLido != -1);
			
			fluxo.close();
		} catch (FileNotFoundException e) {
			System.out.println("Arquivo não encontrado!");
		} catch (IOException e) {
			System.out.println("Erro em operação de leitura!");
		}
	}

}
