package aulas.aula04.exemplo04;

// Classe com método estático main para fins de demonstração de lançamento de exceção
public class ProgramaData3 {

    public static void main(String[] args) {
    	// instanciação de objeto da classe Data com parâmetro indicativo de mês superior a 12 (doze)
    	// lançamento, em função disso, de exceção considerando-se comportamento do construtor da classe Data
    	Data d1 = new Data(9, 30, 2026);
    	
    	// não execução de instrução abaixo em virtude de lançamento da exceção durante instanciação de objeto
    	System.out.println(d1.toString());
    }

}