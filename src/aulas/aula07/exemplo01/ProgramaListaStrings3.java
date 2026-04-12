package aulas.aula07.exemplo01;

import java.util.Scanner;

public class ProgramaListaStrings3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int capacidade = lerInteiro(scanner, "Capacidade da lista de nomes");
		int op;
		
		ListaStrings lista = new ListaStrings(capacidade);
		
		do {
			mostrarMenu();
			op = lerInteiro(scanner, "\nOperação [1|2|3]");			
			
			switch(op) {
				case 1:
					System.out.print("Digite nome a ser inserido: ");
					String nome = scanner.nextLine();
					lista.adicionar(nome);
					break;
				case 2:
					System.out.println("Lista de nomes: " + lista);
					break;
			}
			
		} while (op != 3);
		
		scanner.close();
	}
	
	public static void mostrarMenu() {
		System.out.println();
		System.out.println("*** OPERAÇÕES ***");
		System.out.println("* 1 -> Inserir  *");
		System.out.println("* 2 -> Listar   *");
		System.out.println("* 3 -> Encerrar *");
		System.out.println("*****************");		
	}
	
	public static int lerInteiro(Scanner scanner, String prompt) {
		do {
			try {
				System.out.print(prompt + ": ");
				return Integer.parseInt(scanner.nextLine());
			}
			catch(NumberFormatException e) {
				System.out.print("Não é um inteiro válido! Informe-o novamente!\n");				
			}
		} while (true);
	}

}
