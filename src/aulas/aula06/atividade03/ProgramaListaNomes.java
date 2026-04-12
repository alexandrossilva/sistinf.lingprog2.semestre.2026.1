package aulas.aula06.atividade03;

import java.util.Scanner;

public class ProgramaListaNomes {

	public static void main(String[] args) {
		int op;
		Scanner scanner = new Scanner(System.in);
		do {
			System.out.println("OPERAÇÕES");			
			System.out.println("1 - Inserir Nome");			
			System.out.println("2 - Mostrar Nomes Cadastrados");			
			System.out.println("3 - Encerrar Programa");			
			
			System.out.println("\n\nDigite Operação [1-3]: ");			
			op = Integer.parseInt(scanner.nextLine());
			
			switch(op) {
				case 1:
				case 2:
			}
		} while (op != 3);		
	}

}
