package temp.listas.lista01.questao07;

public class Animal {

    public String nome;
    public int idade;

    public void emitirSom() {
        System.out.print("Som genérico de animal!");
    }

}

class Cachorro extends Animal {

    public void emitirSom() {
        System.out.print("Au au!");
    }

}

class Gato extends Animal {

    public void emitirSom() {
        System.out.print("Miau!");
    }

}