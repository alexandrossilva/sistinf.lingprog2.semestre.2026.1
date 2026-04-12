package aulas.aula04.exemplo04;

// Classe para encapsulamento de datas
public class Data {

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