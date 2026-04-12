package aulas.aula08.exemplo01;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ProgramaArrayList {

	public static void main(String[] args) {
		List<String> lista = new LinkedList<String>();
		System.out.println("Lista Vazia: " + lista.isEmpty());
		lista.add("Linguagem de Programação II");
		System.out.println("Lista Vazia: " + lista.isEmpty());
		lista.add("Estrutura de Dados");
		System.out.println("Tamanho: " + lista.size());
		lista.add("Sistemas Operacionais");
		System.out.println("Tamanho: " + lista.size());
		System.out.println("Contém: " + lista.contains("Estruturas de Dado"));
		System.out.println("Contém: " + lista.contains("Linguagem  de Programação II"));		
		System.out.println("Lista: " + lista);
		lista.add(2, "Probabilidade e Estatística");

		System.out.println("Disciplinas");
		
		for (String disciplina: lista) {
			System.out.println(disciplina);			
		}
		
	}

}
