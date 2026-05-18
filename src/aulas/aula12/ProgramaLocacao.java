package aulas.aula12;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// Gestão de cadastro de veículos e suas respectivas quilometragens
public class ProgramaLocacao {

	public final static String caminhoArquivo = "src/aulas/aula12/veiculos.txt";
	
	public static void main(String[] args) {
		Scanner scanner 	= new Scanner(System.in);
		List<Veiculo> lista = new ArrayList<Veiculo>();	// lista de veículos
		String op;
		
		// bloco de repetição de operações (cadastro de novo veículo ou encerramento de programa)
		do {
			// entrada de indicativo de operação (a realizar)
			System.out.print("Cadastrar Novo Veiculo (C) ou Encerrar (E)? ");
			op = scanner.nextLine().toLowerCase();
			
			// processamento de indicativo de operação
			switch(op) {
				// cadastro de novo veículo se indicativo de operação for "c"
				case "c" -> cadastrarVeiculo(scanner, lista);
				// caso contrário, se for o caso, listagem de mensagem indicativa de operação inválida
				default  -> {					
					if (!op.equals("e")) {				// se indicativo de operação não corresponder ao caractere "e"...
						System.out.println("Operação inválida!");						
					}
				}
			}
		} while (!op.equals("e"));
		
		System.out.println("VEÍCULOS CADASTRADOS!");						
		for (Veiculo v: lista) {
			System.out.println(v);
		}
		
		gravarVeiculos(lista);
		
		scanner.close();
	}

	// Inserção de novo veículo em lista após entrada de respectivos dados
	public static void cadastrarVeiculo(Scanner scanner, List<Veiculo> lista) {
		System.out.println("Informe dados de novo veículo");

		Veiculo veiculo = null;	// variável-objeto para nova instância da classe Veiculo
		
		// entrada de dados (placa, modelo e cor predominante)
		System.out.print("Placa...........: ");
		String placa = scanner.nextLine();
		System.out.print("Modelo..........: ");
		String modelo = scanner.nextLine();
		System.out.print("Cor predominante: ");
		String cor = scanner.nextLine();

		// instanciação de novo objeto e atribuição à variável-objeto
		veiculo = new Veiculo(modelo, placa, cor);
				
		// inserção de objeto em lista
		lista.add(veiculo);
		
		System.out.println("Veiculo cadastrado!\n");
	}
	
	public static void gravarVeiculos(List<Veiculo> lista) {
		FileWriter fluxoArq;
		
		try {
			fluxoArq = new FileWriter(caminhoArquivo);
			PrintWriter pw = new PrintWriter(fluxoArq);
			
			for (Veiculo v: lista) {
				pw.println(v.getModelo() + "|" + 
						v.getPlaca() + "|" + 
						v.getCor() + "|" + 
						v.getQuilometragem());
			}			
			
			pw.close();
			fluxoArq.close();

			System.out.println("Veiculos gravados em arquivo!\n");
		}
		catch(IOException e) {
			System.out.println("Falha em operação de entrada/saida!");
		}
	}

}