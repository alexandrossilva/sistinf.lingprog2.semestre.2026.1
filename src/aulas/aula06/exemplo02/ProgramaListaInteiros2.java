package aulas.aula06.exemplo02;

import java.util.Random;

public class ProgramaListaInteiros2 {

	public static void main(String[] args) {
		ListaInteiros lista = new ListaInteiros(-2);  // LANÇAR EXCEÇÃO
		Random gerador = new Random();
		
		System.out.println("Lista inicial: " + lista);

		lista.adicionar(gerador.nextInt(100));
		System.out.println("Lista após 1ª inserção: " + lista);
		
		lista.adicionar(gerador.nextInt(100));
		System.out.println("Lista após 2ª inserção: " + lista);		

		lista.adicionar(gerador.nextInt(100));  // DEVERIA LANÇAR EXCEÇÃO
		System.out.println("Lista após 3ª inserção: " + lista);		
	}

}
