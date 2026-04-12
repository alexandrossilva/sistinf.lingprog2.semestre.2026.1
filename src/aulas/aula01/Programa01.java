package aulas.aula01;

import java.util.Scanner;

// Classe com apenas método estático para entrada de dois inteiros e, após isso, soma deles
public class Programa01 {

	public static void main(String[] args) {
		// processador de operações de entrada através de console padrão
		Scanner scanner = new Scanner(System.in);
		
		// entrada de dois inteiros utilizando-se processador
		System.out.print("Digite 1º número: ");
		int n1 = scanner.nextInt();
		System.out.print("Digite 2º número: ");
		int n2 = scanner.nextInt();
		
		// soma de inteiros
		int r = n1 + n2;
		
		// listagem de soma através de envio de mensagem para console padrão
		System.out.printf("Soma de %d com %d é %d\n", n1, n2, r);
		
		scanner.close();
	}

}
