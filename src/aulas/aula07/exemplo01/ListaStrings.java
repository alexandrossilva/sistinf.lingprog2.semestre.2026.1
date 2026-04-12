package aulas.aula07.exemplo01;

// Classe para encapsulamento de lista de strings com determinada capacidade
public class ListaStrings {
	
	private String[] elementos;					// elementos (strings) da lista
	private int tamanho;						// tamanho da lista
	private int capacidade;						// capacidade da lista
	
	// construtor com indicação de capacidade de lista
	public ListaStrings(int capacidade) {
		if (capacidade > 0) {
			this.capacidade = capacidade;				// definição de capacidade da lista
			this.tamanho = 0;							// indicação de tamanho inicial da lista
			this.elementos = new String[capacidade];	// instanciação de novo array de strings
		}
		else {			
			throw new IllegalArgumentException("Indicação de capacidade inferior ou igual a 0 (zero)!");
		}
	}
	
	// Inserção de novo elemento (string)
	public void adicionar(String elemento) {
		if (tamanho < capacidade) {					// se lista com tamanho inferior à capacidade (lista não cheia)...
			int indiceInsercao = tamanho;			// definição de índice de inserção em array interno
			
			elementos[indiceInsercao] = elemento;	// insersão (cópia) de elemento (strings) em array interno
			
			tamanho++;								// atualização de tamanho da lista
		}
		else {
			throw new IllegalStateException("Inserção impossível em virtude de lista cheia!");
		}
	}
	
	// Retorno de array de strings até então inseridos
	public String[] getElementos() {
		// instanciação de array a ser populada com cópia de elementos (strings) até então inseridos
		String[] elementosCopia = new String[tamanho];
		
		// cópia de elementos (strings) até então inseridos em array recém-criado
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
