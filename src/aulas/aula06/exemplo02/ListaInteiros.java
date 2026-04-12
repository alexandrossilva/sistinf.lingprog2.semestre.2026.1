package aulas.aula06.exemplo02;

// Classe para encapsulamento de lista de inteiros com determinada capacidade
public class ListaInteiros {
	
	private int[] elementos;					// elementos (inteiros) da lista
	private int tamanho;						// tamanho da lista
	private int capacidade;						// capacidade da lista
	
	// construtor com indicação de capacidade de lista
	public ListaInteiros(int capacidade) {
		this.capacidade = capacidade;			// definição de capacidade da lista
		this.tamanho = 0;						// indicação de tamanho inicial da lista
		this.elementos = new int[capacidade];	// instanciação de novo array de inteiros
	}
	
	// Inserção de novo elemento (inteiro)
	public void adicionar(int elemento) {
		if (tamanho < capacidade) {					// se lista com tamanho inferior à capacidade (lista não cheia)...
			int indiceInsercao = tamanho;			// definição de índice de inserção em array interno
			
			elementos[indiceInsercao] = elemento;	// insersão (cópia) de elemento (inteiro) em array interno
			
			tamanho++;								// atualização de tamanho da lista
		}
	}
	
	// Retorno de array de inteiros até então inseridos
	public int[] getElementos() {
		// instanciação de array a ser populada com cópia de elementos (inteiros) até então inseridos
		int[] elementosCopia = new int[tamanho];
		
		// cópia de elementos (inteiros) até então inseridos em array recém-criado
		for (int i = 0; i < tamanho; i++) {
			elementosCopia[i] = elementos[i];
		}
		
		return elementosCopia;					// retorno de array recém-criado
	}

	// Retorno de elementos da lista na forma de string
	@Override
	public String toString() {
		String descricao = "";
		
		for (int i = 0; i < tamanho; i++) {
			if (i != 0) {
				descricao += ", ";							
			}
			
			descricao += elementos[i];			
		}
		
		return descricao;
	}

	// Retorno de tamanho da lista
	public int getTamanho() {
		return tamanho;
	}

	// Retorno de capacidade da lista
	public int getCapacidade() {
		return capacidade;
	}

	// Retorno de indicativo de lista cheia (true) ou não cheia
	public boolean isCheia() {
		if (tamanho == capacidade) {
			return true;
		}
		else {
			return false;
		}
	}

}
