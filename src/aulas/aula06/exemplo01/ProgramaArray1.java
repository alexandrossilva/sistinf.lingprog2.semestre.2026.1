package aulas.aula06.exemplo01;

import java.util.Random;

public class ProgramaArray1 {

	public static void main(String[] args) {
		int[] numeros = new int[5];
		Random gerador = new Random();
		
		numeros[20] = gerador.nextInt(100);
		
		for (int i = 0; i < numeros.length; i++) {
			System.out.println("Indice " + i + ": " + numeros[i]);			
		}
		
	}

}
