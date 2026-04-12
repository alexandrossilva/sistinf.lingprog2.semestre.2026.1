package aulas.aula06.atividade03.resp;

import java.util.Scanner;

public class ProgramaListaNomes {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int op, capacidade;
		ListaStrings lista;

		System.out.print("Capacidade da Lista de Nomes: ");
		capacidade = Integer.parseInt(scanner.nextLine());
		
		lista = new ListaStrings(capacidade);
		
		do {
			System.out.println();			
			System.out.println("*********** OPERAÇÕES ***********");			
			System.out.println("*1 -> Inserir Nome              *");			
			System.out.println("*2 -> Mostrar Nomes Cadastrados *");			
			System.out.println("*3 -> Encerrar Programa         *");			
			System.out.println("*********************************");			
			
			System.out.print("\n\nDigite Operação [1-3]: ");			
			op = Integer.parseInt(scanner.nextLine());
			
			switch(op) {
				case 1:
					System.out.print("Nome a inserir na lista: ");
					String nome = scanner.nextLine();
					lista.adicionar(nome);
					break;
				case 2:
					System.out.println("Nomes inseridos: " + lista);
			}
		} while (op != 3);
		
		scanner.close();
	}

}