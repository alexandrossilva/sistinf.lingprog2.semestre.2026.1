package aulas.aula05.exemplo01;

// Classe com método estático main para fins de demonstração de lançamento de exceção
public class ProgramaData {

    public static void main(String[] args) {
    	// instanciação de objeto da classe Data com parâmetro indicativo de dia superior a 30 (trinta) considerando que
    	// mês indicado é 4 (abril); lançamento, em função disso, de exceção considerando-se comportamento do construtor da classe Data
	   	Data d1 = new Data(31, 4, 2026);
	   	
    	// não execução de instrução abaixo em virtude de lançamento da exceção durante instanciação de objeto
    	System.out.println(d1.toString());
    }

}