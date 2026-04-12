package aulas.aula05.exemplo01;

// Classe para encapsulamento de datas
public class Data {

	// definição de constantes para os meses do ano
	public final int JANEIRO 	= 1;
	public final int FEVEREIRO 	= 2;
	public final int MARCO 		= 3;
	public final int ABRIL 		= 4;
	public final int MAIO 		= 5;
	public final int JUNHO 		= 6;
	public final int JULHO 		= 7;
	public final int AGOSTO 	= 8;
	public final int SETEMBRO 	= 9;
	public final int OUTUBRO 	= 10;
	public final int NOVEMBRO	= 11;
	public final int DEZEMBRO 	= 12;

	// atributos da data encapsulada
	private int dia;	// dia do mês (um inteiro entre 1 e, a depender do mês, 28, 29, 30 ou 31)
	private int mes;	// mês (um inteiro entre 1 e 31)
	private int ano;	// ano
		
	// Construtor com parâmetros para indicação, respectivamente, do dia, mês e ano da data representada
	public Data(int dia, int mes, int ano) {
		// lançamento de exceção em caso de mês inferior a 1 (um) ou superior a 12 (doze)
		if (mes < 1 || mes > 12) {
			System.err.println("ERRO!");
			throw new IllegalArgumentException();
		}
		
		// ano é bissexto se divisível por 4, mas não por 100, a menos que também seja divisível por 400
		boolean anoBissexto = (ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0);
		
		int qtdDiasMes;		// quantidade de dias de acordo com mês indicado em parâmetro
	
		// obtenção de quantidade de dias de acordo com mês indicado em parâmetro
		// se mês for fevereiro...
		if (mes == FEVEREIRO) {
			if (anoBissexto) {		// se ano for bissexto...
				qtdDiasMes = 29;	// quantidade de dias é 29 (vinte e nove)
			}
			else {					// caso contrário...
				qtdDiasMes = 28;	// quantidade de dias é 28 (vinte e oito)
			}
		}
		// se mês for abril, junho, setembro ou novembro...
		else if (mes == ABRIL || mes == JUNHO || mes == SETEMBRO || mes == NOVEMBRO) {
			qtdDiasMes = 30;		// quantidade de dias é 30 (trinta)
		}
		else {						// caso contrário...
			qtdDiasMes = 31;		// quantidade de dias é 31 (trinta e um)
		}
		
		// lançamento de exceção em caso de dia do mês inferior a 1 (um) ou superior à quantidade de dias
		if (dia < 1 || dia > qtdDiasMes) {
			System.err.println("ERRO!");
			throw new IllegalArgumentException();			
		}
		
		// atribuição de valores de parâmetros aos atributos
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}

	// Retorno do dia da data representada (método getter)
	public int getDia() {
		return dia;
	}

	// Atualização do dia da data representada considerando-se parâmetro (método setter)
	public void setDia(int dia) {
		this.dia = dia;
	}

	// Retorno do mês da data representada (método getter)
	public int getMes() {
		return mes;
	}

	// Atualização do mês da data representada considerando-se parâmetro (método setter)
	public void setMes(int mes) {
		this.mes = mes;
	}

	// Retorno do ano da data representada (método getter)
	public int getAno() {
		return ano;
	}

	// Atualização do ano da data representada considerando-se parâmetro (método setter)
	public void setAno(int ano) {
		this.ano = ano;
	}	

	// Retorno, via sobrescrita de método, de data representada no formato dd/mm/aaaa usando-se método estático da classe String
	@Override
	public String toString() {
		// retorno de string invocando-se método estático para o qual são passados, como parâmetros, 
		// string de formatação e valores dos atributos de dia, mês e ano
		return String.format("%02d/%02d/%04d", dia, mes, ano);
	}	

}