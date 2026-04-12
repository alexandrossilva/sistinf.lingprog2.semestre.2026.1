package aulas.aula02.exemplo01;

// Classe com apenas método estático para instanciação de objeto de subclasse (B) e, após isso, invocação de método
public class Programa02 {

	public static void main(String[] args) {
		// instanciação de objeto da subclasse B (que herda a classe A)
		B obj1 = new B();
		
		// invocação de método herdado da superclasse (A)
		obj1.imprimirA();
		
		// tentativa de invocação de método não declarado na superclasse (A) tampouco na própria classe B
		obj1.imprimirB(); // erro de compilação
	}

}