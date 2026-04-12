package aulas.aula04.exemplo04;

// Classe com método estático main para fins de demonstração de funcionamento de classe Data
public class ProgramaData2 {

	public static void main(String[] args) {
		Data d1 = new Data(9, 3, 2026);					// instanciação de novo objeto da classe Data
		System.out.println("Dia: " + d1.getDia());		// listagem de dia da data instanciada usando método público (getter)
		System.out.println("Data: " + d1.toString());	// listagem de data instanciada de forma formatada usando método público
	}

}