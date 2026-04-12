package aulas.aula07.exemplo02;

public class ProgramaListas2 {

	public static void main(String[] args) {
		ListaGenerica<Integer> listaInteiros = new ListaGenerica<Integer>(5);
		ListaGenerica<String> listaNomes = new ListaGenerica<String>(5);
		
		listaInteiros.adicionar(7);
		listaInteiros.adicionar(2);
		listaInteiros.adicionar(9);

		listaNomes.adicionar("Alex");
		listaNomes.adicionar("Maria");
		listaNomes.adicionar("José");
		
		System.out.println("Lista de Inteiros: " + listaInteiros);
		System.out.println("Lista de Nomes: " + listaNomes);
	}

}