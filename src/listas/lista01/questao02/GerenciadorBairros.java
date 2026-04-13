package listas.lista01.questao02;

class Bairro {

    private String nome;

    public Bairro(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    private void setNome(String nome) {
        this.nome = nome;
    }

}

public class GerenciadorBairros {

    public static void main(String[] args) {
        Bairro bairro1 = new Bairro("Candeias");
        Bairro bairro2 = null;

        bairro1.setNome("Brasil");		// erro de compilação
        System.out.println(bairro1.getNome());
    }

}
