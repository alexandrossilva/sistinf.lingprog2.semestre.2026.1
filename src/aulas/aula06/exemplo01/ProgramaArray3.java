package aulas.aula06.exemplo01;

import java.util.Random;

public class ProgramaArray3 {

	public static void main(String[] args) {
		Random gerador = new Random();
		int[] numeros = new int[] {gerador.nextInt(100), 5, 7};
				
		for (int i = 0; i < numeros.length; i++) {
			System.out.println("Indice " + i + ": " + numeros[i]);			
		}
		
	}

}
