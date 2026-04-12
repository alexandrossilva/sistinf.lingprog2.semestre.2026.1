package aulas.aula05.exemplo02;

import java.util.Scanner;

// Classe com método estático main para cálculo de soma e média de 5 (cinco) números
public class ProgramaNumeros {

    public static void main(String[] args) {
		// processador de operações de entrada através de console padrão
    	Scanner scanner = new Scanner(System.in);
    	
    	int soma 		= 0;	// totalização de números
    	final int QTD 	= 5;	// quantidade de números a serem fornecidos
    	
    	// entrada, pelo usuário, de números
    	for (int i = 0; i < QTD; i++) {
    		System.out.print("Digite número " + (i + 1) + ": ");
    		// entrada de enésimo número e, após isso, atualização de totalizador
    		soma = soma + scanner.nextInt();
    	}
    	
    	// listagem de soma dos números em console padrão
		System.out.println("Soma dos números lidos: " + soma);    	

    	// listagem de média dos números em console padrão
		System.out.println("Média dos números lidos: " + soma / (double)QTD);    	
    }

}