package aulas.aula12;

public class ProgramaVeiculos {

	public static void main(String[] args) {
		Veiculo v = new Veiculo("HB20S", "PKV2G14", "Prata");
		System.out.println("Km rodados: " + v.getQuilometragem());
		v.adicionarQuilometragemRodada(10);
		System.out.println("Km rodados após atualização: " + 
				v.getQuilometragem());		
	}

}
