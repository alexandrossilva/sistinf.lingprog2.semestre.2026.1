package aulas.aula05.exemplo03;

import java.util.Scanner;

// Classe com método estático main para cálculo de soma e média de 5 (cinco) números 
// com tratamento incompleto de eventual lançamento de exceções
public class ProgramaNumeros {

    public static void main(String[] args) {
		// processador de operações de entrada através de console padrão
    	Scanner scanner = new Scanner(System.in);
    	
    	int soma 		= 0;	// totalização de números
    	final int QTD 	= 5;	// quantidade de números a serem fornecidos
    	
    	// entrada, pelo usuário, de números
    	for (int i = 0; i < QTD; i++) {
    		System.out.print("Digite número " + (i + 1) + ": ");
    		
    		// bloco de execução de código passível de lançamento de exceção
    		try {
        		// entrada de enésima linha de texto seguindo-se a isso
    			// conversão para inteiro correspondente e, após isso, atualização de totalizador
        		soma = soma + Integer.parseInt(scanner.nextLine());    			
    		}
    		// bloco de captura de exceção em virtude de falha em conversão de linha de texto para inteiro 
    		catch(NumberFormatException e) {
    			// listagem de mensagem indicada entrada inválida
    			System.out.println("Não é um número!");
        		System.out.print("Digite número " + (i + 1) + " novamente: ");
        		
        		// nova tentativa de entrada, pelo usuário, de número (possibilidade de nova exceção e de encerramento, por consequência, do programa)
        		soma = soma + Integer.parseInt(scanner.nextLine());    			
    		}
    	}
    	
    	// listagem de soma dos números em console padrão
		System.out.println("Soma dos números lidos: " + soma);    	
		
    	// listagem de média dos números em console padrão
		System.out.println("Média dos números lidos: " + soma / (double)QTD);    	
    }

}