package aulas.aula04.exemplo02;

// Classe com método estático main para fins de demonstração de funcionamento de classe Data e de métodos estáticos
public class ProgramaData {

    public static void main(String[] args) {
       Data d1 = new Data(9, 3, 2026);							// instanciação de novo objeto da classe Data
       System.out.println("Dia: " + d1.getDia());				// listagem de dia da data instanciada usando método público (getter)
       System.out.println("Data: " + d1.toString());			// listagem de data instanciada de forma formatada usando método público
       System.out.println("Raiz Quadrada: " + Math.sqrt(2));	// listagem de raiz quadrada de 2 (dois) invocando-se método estático da classe Math
    }

}