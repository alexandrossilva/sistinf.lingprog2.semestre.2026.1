package aulas.aula04.exemplo02;

// Classe para encapsulamento de datas
public class Data {

	private int dia;	// dia do mês (um inteiro entre 1 e, a depender do mês, 28, 29, 30 ou 31)
	private int mes;	// mês (um inteiro entre 1 e 31)
	private int ano;	// ano
	
	// Construtor com parâmetros para indicação, respectivamente, do dia, mês e ano da data representada
	public Data(int dia, int mes, int ano) {
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

	// Retorno de data representada no formato dd/mm/aaaa (sobrescrita de método)
	@Override
	public String toString() {
		String dataFormatada = "";	// string na qual estará armazenada data formatada

		// inclusão em string, via concatenação, de caractere '0' se dia inferior a 10 (dez)
		if (dia < 10) {
			dataFormatada += "0";			
		}
		
		// inclusão, em string formatada, nesta ordem, de dia e caractere de barra
		dataFormatada += dia;
		dataFormatada += "/";

		// inclusão em string, via concatenação, de caractere '0' se mês inferior a 10 (dez)
		if (mes < 10) {
			dataFormatada += "0";			
		}
		
		// inclusão, em string formatada, nesta ordem, de mês e caractere de barra
		dataFormatada += mes;
		dataFormatada += "/";
		
		// inclusão, em string formatada, de ano
		dataFormatada += ano;
		
		// retorno de string formatada
		return dataFormatada;
	}	

}