package aulas.aula07.exemplo03;

import java.util.ArrayList;

public class ProgramaArrayList1 {

	public static void main(String[] args) {
		ArrayList<String> l1 = new ArrayList<String>();
		
		l1.add("Alex");
		l1.add("Maria");
		l1.add("João");
		
		System.out.println("Lista: " + l1);
		
		System.out.println("Tamanho da lista: " + l1.size());
		
		l1.remove(10);
		
		System.out.println("Lista após remoção: " + l1);

	}

}
