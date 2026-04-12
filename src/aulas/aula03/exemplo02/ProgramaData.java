package aulas.aula03.exemplo02;

// Classe com método estático main para fins de demonstração de funcionamento de classe Data
public class ProgramaData {

	public static void main(String[] args) {
		// instanciação de objeto da classe Data com indicação de parâmetro inválido para o mês (um inteiro acima de 12)
		Data d1 = new Data(2, 30, 2026);
	}

}