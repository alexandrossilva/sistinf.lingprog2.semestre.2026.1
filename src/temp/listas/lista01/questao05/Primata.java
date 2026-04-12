package temp.listas.lista01.questao05;

class Mamifero {

    protected void andar() {
        System.out.println("Mamífero andando...");
    }

}

public class Primata extends Mamifero {

    protected void andar() {
        System.out.println("Primata andando...");
    }

    protected void andar(int metros) {
        System.out.printf("Mamífero andando %d metro(s)...", metros);
    }

}