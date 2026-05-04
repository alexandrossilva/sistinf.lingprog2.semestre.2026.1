package aulas.aula11;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class GravadorLinhasTexto2 {

	public static void main(String[] args) {
		FileWriter fluxoArq = null;
		Scanner scanner = new Scanner(System.in);
		
		try {
			fluxoArq = new FileWriter("src/aulas/aula11/texto2.txt", true);
			PrintWriter fluxoEsc = new PrintWriter(fluxoArq);
			
			String resp;
			
			do {
				System.out.print("Gravar nova linha de texto (N) ou encerrar (E)? ");
				resp = scanner.nextLine();
				
				if (resp.equalsIgnoreCase("n")) {
					System.out.print("Linha de texto a ser gravada: ");
					String linha = scanner.nextLine();

					fluxoEsc.println(linha);					
				}
			} while (!resp.equalsIgnoreCase("e"));
			
			fluxoEsc.close();
			fluxoArq.close();
			scanner.close();
		} catch (FileNotFoundException e) {
			System.out.println("Arquivo não encontrado!");
		} catch (IOException e) {
			System.out.println("Arquivo não encontrado!");
		}		
	}

}
