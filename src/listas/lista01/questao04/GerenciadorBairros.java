package listas.lista01.questao04;

class Bairro {

    private String nome;

    public Bairro(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

}

public class GerenciadorBairros {

    public static void main(String[] args) {
        Bairro bairro1 = new Bairro("Zebelê");
        Bairro bairro2 = new Bairro("Candeias");

        bairro1.setNome("Brasil");
        bairro1 = bairro2;

        System.out.println(bairro1.getNome());
    }

}
