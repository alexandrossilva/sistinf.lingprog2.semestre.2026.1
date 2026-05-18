package aulas.aula12.serializacao;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// Gestão de cadastro de veículos e suas respectivas quilometragens
public class ProgramaLocacao4 {

	public final static String caminhoArquivo = "src/aulas/aula12/veiculos.ser";
	
	public static void main(String[] args) {
		Scanner scanner 	= new Scanner(System.in);
		List<Veiculo> lista = null;	// lista de veículos
		String op;
		
		lista = lerVeiculos();		
		
		// bloco de repetição de operações (cadastro de novo veículo ou encerramento de programa)
		do {
			// entrada de indicativo de operação (a realizar)
			System.out.print("Cadastrar (C), Lista (L) ou Encerrar (E)? ");
			op = scanner.nextLine().toLowerCase();
			
			// processamento de indicativo de operação
			switch(op) {
				// cadastro de novo veículo se indicativo de operação for "c"
				case "c" -> cadastrarVeiculo(scanner, lista);
				// listagem de veículos se indicativo de operação for "l"
				case "l" -> listarVeiculos(lista);
				// caso contrário, se for o caso, listagem de mensagem indicativa de operação inválida
				default  -> {					
					if (!op.equals("e")) {				// se indicativo de operação não corresponder ao caractere "e"...
						System.out.println("Operação inválida!");						
					}
				}
			}
		} while (!op.equals("e"));
		
		gravarVeiculos(lista);
		
		scanner.close();
	}

	// Inserção de novo veículo em lista após entrada de respectivos dados
	public static void cadastrarVeiculo(Scanner scanner, List<Veiculo> lista) {
		System.out.println("Informe dados de novo veículo");

		Veiculo veiculo = null;	// variável-objeto para nova instância da classe Veiculo
		
		// entrada de dados (placa, modelo e cor predominante)
		System.out.print("Modelo..........: ");
		String modelo = scanner.nextLine();
		System.out.print("Placa...........: ");
		String placa = scanner.nextLine();
		System.out.print("Cor predominante: ");
		String cor = scanner.nextLine();

		// instanciação de novo objeto e atribuição à variável-objeto
		veiculo = new Veiculo(modelo, placa, cor);
				
		// inserção de objeto em lista
		lista.add(veiculo);
		
		System.out.println("Veiculo cadastrado!\n");
	}

	public static List<Veiculo> lerVeiculos() {
		FileInputStream fluxoArq = null;
		ObjectInputStream fluxoObjetos = null;
		List<Veiculo> lista = null;
		
		try {
			fluxoArq = new FileInputStream(caminhoArquivo);
			fluxoObjetos = new ObjectInputStream(fluxoArq);
			
			lista = (List<Veiculo>)fluxoObjetos.readObject();			

			fluxoObjetos.close();
			fluxoArq.close();
		}
		catch(IOException e) {
			System.out.println("Falha em operação de entrada/saida!");
		}
		catch(ClassNotFoundException e) {
			System.out.println("Falha em identificação de objeto lido!");
		}
		catch(ClassCastException e) {
			System.out.println("Falha em conversão de objeto lido!");
		}
		
		if (lista == null) {
			lista = new ArrayList<Veiculo>();
		}
		
		return lista;			
	}

	public static void listarVeiculos(List<Veiculo> lista) {		
		if (lista.size() == 0) {
			System.out.println("Nenhum veículo cadastrado!");			
		}
		else {
			int qtd = 0;			

			System.out.println("LISTA DE VEÍCULOS");			
			for (Veiculo v: lista) {
				qtd++;
				System.out.println("VEÍCULO " + qtd);			
				System.out.println("Modelo..........: " + v.getModelo());			
				System.out.println("Placa...........: " + v.getPlaca());			
				System.out.println("Cor predominante: " + v.getCor());			
				System.out.println("Quilometragem...: " + v.getQuilometragem());			
				System.out.println();			
			}			
		}
		
	}

	public static void gravarVeiculos(List<Veiculo> lista) {
		FileOutputStream fluxoArq;
		
		try {
			fluxoArq = new FileOutputStream(caminhoArquivo);
			ObjectOutputStream fluxoObjetos = new ObjectOutputStream(fluxoArq);
			
			fluxoObjetos.writeObject(lista);
			
			fluxoObjetos.close();
			fluxoArq.close();

			System.out.println("Veiculos gravados em arquivo!\n");
		}
		catch(IOException e) {
			e.printStackTrace();
			System.out.println("Falha em operação de entrada/saida!");
		}
	}

}