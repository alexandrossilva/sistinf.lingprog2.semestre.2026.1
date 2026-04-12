package aulas.aula04.exemplo01;

// Classe com método estático main para fins de demonstração de funcionamento de classe Data
public class ProgramaData {

    public static void main(String[] args) {
       Data d1 = new Data();					// instanciação de novo objeto da classe Data
       System.out.println("Dia: " + d1.dia);	// acesso à atributo (dia) de objeto
       d1.dia = 9;								// atualização de atributo (dia) de objeto
       System.out.println("Dia: " + d1.dia);	// acesso à atributo de objeto após atialização de seu valor
       d1.mes = 30;								// atualização de atributo (mes) de objeto com valor superior a 12 (doze)
       d1.ano = 2026;							// atualização de atributo (mes) de objeto
    }

}