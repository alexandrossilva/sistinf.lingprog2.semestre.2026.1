package aulas.aula02.exemplo01;

// Classe com apenas método estático para instanciação de objeto e, após isso, invocação de método
public class Programa01 {

	public static void main(String[] args) {
		// instanciação de objeto da classe A
		A obj1 = new A();
		
		// invocação de método a partir de instância (método herdado da classe java.lang.Object)
		System.out.println(obj1.toString());
	}

}