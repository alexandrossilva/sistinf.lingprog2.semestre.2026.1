package listas.lista01.questao08;

public class Util {

    public static void main(String[] args) {
        Animal cachorro = new Cachorro();
        Gato gato = new Gato();
        cachorro.emitirSom();
        System.out.print(" ");
        cachorro = gato;
        cachorro.emitirSom();
        System.out.print(" ");
        Animal animal = new Animal();
        animal.emitirSom();
    }

}