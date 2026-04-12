package aulas.aula07.exemplo02;

public class ProgramaListasTriangulos {

	public static void main(String[] args) {
		ListaGenerica<Triangulo> l1 = new ListaGenerica<Triangulo>(10);
		ListaGenerica<String> l2 = new ListaGenerica<String>(10);
		ListaGenerica l3 = new ListaGenerica(10);
		
		// l1.adicionar("Alex"); ERRO DE COMPILAÇÃO
		l1.adicionar(new Triangulo(60, 60, 60));
		l2.adicionar("Alex");
	}

}