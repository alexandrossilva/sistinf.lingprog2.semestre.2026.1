package aulas.aula04.exemplo03;

import java.util.Scanner;

// Classe com método estático main para cálculo de raiz quadrada de inteiro
public class ProgramaRaizQuadrada {

    public static void main(String[] args) {
		// processador de operações de entrada através de console padrão
    	Scanner scanner = new Scanner(System.in);
    	
    	System.out.print("Digite um número: ");
    	double n = scanner.nextInt();				// entrada de inteiro
    	
    	// listagem de mensagem em console padrão se inteiro fornecido for negativo...
    	if (n < 0) {
        	System.out.println("Número " + n + " é negativo!");    		
    	}
    	else {										// caso contrário...
        	double r = Math.sqrt(n);				// obtenção de raiz quadrada usando método estático da classe Math
        	
        	// listagem de mensagem com raiz quadrada obtida em console padrão
        	System.out.println("Raiz quadrada de " + n + ": " + r);    		
    	}    	
    }

}