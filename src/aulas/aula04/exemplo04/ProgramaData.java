package aulas.aula04.exemplo04;

// Classe com método estático main para fins de demonstração de uso incorreto de classe Data
public class ProgramaData {

	public static void main(String[] args) {
		// ERRO de compilação por instanciação de objeto com construtor inexistente (único 
		// construtor da classe Data exige três parâmetros inteiros)
		Data d1 = new Data();
		
		// ERRO de compilação por tentativa de acesso direto à atributo privado (dia) de objeto
		System.out.println("Dia: " + d1.dia);

		// ERRO de compilação por tentativa de atualização, de forma direta, de atributo privado (dia) de objeto
		d1.dia = 9;
		
		// ERRO de compilação por nova tentativa de acesso direto à atributo privado (dia) de objeto
		System.out.println("Dia: " + d1.dia);
		
		// ERRO de compilação por tentativa de atualização, de forma direta, de atributo privado (mes) de objeto
		d1.mes = 30;
		
		// ERRO de compilação por tentativa de atualização, de forma direta, de atributo privado (ano) de objeto
		d1.ano = 2026;
	}

}