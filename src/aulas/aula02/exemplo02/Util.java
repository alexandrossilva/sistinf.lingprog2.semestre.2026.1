package aulas.aula02.exemplo02;

// Classe com apenas um método
class A {

	// Método no qual mensagem "a" é enviada para console padrão
	public void imprimir() {
        System.out.print("a");
    }

}

// Classe que herda a classe A e com sobrescrita do método imprimir
class B extends A {

	// Sobrescrita de método no qual mensagem "b" é enviada para console padrão
	@Override
	public void imprimir() {
        System.out.print("b");
    }

} 

// Classe que herda a classe C e com sobrescrita do método imprimir
class C extends A {

	// Sobrescrita de método no qual mensagem "c" é enviada para console padrão
	@Override
	public void imprimir() {
        System.out.print("c");
    }

} 

// Classe com método estático main para fins de demonstração de funcionamento de classes declaradas anteriormente
public class Util {

    public static void main(String[] args) {
        A a; 			// declaração de variável-objeto da classe A
        a = new B();	// instanciação de objeto de classe B e atribuição de respectiva referência para variável-objeto da classe A
        a.imprimir(); 	// invocação de método polimórfico a partir de objeto cuja referência está armazenada em variável-objeto
        a = new C();	// instanciação de objeto de classe C e atribuição de respectiva referência para variável-objeto da classe A
        a.imprimir(); 	// invocação de método polimórfico a partir de objeto cuja referência está armazenada em variável-objeto
    }

}