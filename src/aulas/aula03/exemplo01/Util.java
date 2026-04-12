package aulas.aula03.exemplo01;

// Classe com apenas um método
class A {

	// Método no qual mensagem "a" é enviada para console padrão
	public void metodo() {
        System.out.print("a");
    }

}

// Classe que herda a classe A e com sobrescrita do método imprimir
class B extends A {

	// Sobrescrita de método no qual mensagem "b" é enviada para console padrão
	@Override
    public void metodo() {
        System.out.print("b");
    }

	// sobrecarga de metódo com parâmetro indicativo de mensagem a ser enviada para console padrão
    public void metodo(String msg) {
        System.out.print(msg);
    }

} 

// Classe que herda a classe C e com sobrescrita do método imprimir
class C extends A {

	// Sobrescrita de método no qual mensagem "c" é enviada para console padrão
	@Override
    public void metodo() {
        System.out.print("c");
    }

} 

// Classe com método estático main para fins de demonstração de funcionamento de classes declaradas anteriormente
public class Util {

    public static void main(String[] args) {
        A a, a2; 		// declaração de 2 (duas) variáveis-objeto da classe A
        a = new B();	// instanciação de objeto de classe B e atribuição de respectiva referência para variável-objeto a
        a = new B();	// instanciação de segundo objeto de classe B e atribuição de respectiva referência para variável-objeto a (referência anterior é perdida)
        a2 = a;			// cópia de referência para a variável-objeto a2 (ambas as variáveis, a e a2, passam a conter a mesma referência de objeto)
        a = new B();	// instanciação de terceiro objeto de classe B e atribuição de respectiva referência para variável-objeto a (referência de segundo objeto fica mantida apenas na variável a2)
        a.metodo(); 	// invocação de método a partir de terceiro objeto da classe B
        a = new C();	// instanciação de primeiro objeto de classe C e atribuição de respectiva referência para variável-objeto a (referência de terceiro objeto da classe B é perdida)
        a.metodo(); 	// invocação de método a partir de objeto recém-criado da classe C
    }

}