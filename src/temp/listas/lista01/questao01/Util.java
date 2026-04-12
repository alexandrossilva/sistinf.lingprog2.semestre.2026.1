package temp.listas.lista01.questao01;

class A {

    public void metodo() {
        System.out.print("a");
    }

}

class B extends A {

    public void metodo() {
        System.out.print("b");
    }

} 

class C extends A {

    public void metodo() {
        System.out.print("c");
    }

} 

public class Util {

    public static void main(String[] args) {
        A a; 
        a = new B();
        a.metodo(); 
        a = new C();
        a.metodo(); 
    }

}