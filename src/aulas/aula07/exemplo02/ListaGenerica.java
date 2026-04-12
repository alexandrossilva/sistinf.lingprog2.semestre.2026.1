package aulas.aula07.exemplo02;

// Classe para encapsulamento de lista de strings com determinada capacidade
public class ListaGenerica <T> {
	
	private T[] elementos;						// elementos (strings) da lista
	private int tamanho;						// tamanho da lista
	private int capacidade;						// capacidade da lista
	
	// construtor com indicação de capacidade de lista
	public ListaGenerica(int capacidade) {
		if (capacidade <= 0) {
			throw new IllegalArgumentException("Capacidade inválida!");
		}
		else {
			this.capacidade = capacidade;					// definição de capacidade da lista
			this.tamanho = 0;								// indicação de tamanho inicial da lista
			this.elementos = (T[])new Object[capacidade];	// instanciação de novo array de strings			
		}
	}
	
	// Inserção de novo elemento (strings)
	public void adicionar(T elemento) {
		if (tamanho < capacidade) {					// se lista com tamanho inferior à capacidade (lista não cheia)...
			int indiceInsercao = tamanho;			// definição de índice de inserção em array interno
			
			elementos[indiceInsercao] = elemento;	// insersão (cópia) de elemento (strings) em array interno
			
			tamanho++;								// atualização de tamanho da lista
		}
		else {
			throw new IllegalStateException("Lista cheia!");
		}
	}
	
	// Retorno de array de strings até então inseridos
	public T[] getElementos() {
		// instanciação de array a ser populada com cópia de elementos (strings) até então inseridos
		T[] elementosCopia = (T[])new Object[tamanho];
		
		// cópia de elementos (strings) até então inseridos em array recém-criado
		for (int i = 0; i < tamanho; i++) {
			elementosCopia[i] = elementos[i];
		}
		
		return elementosCopia;					// retorno de array recém-criado
	}

	// Retorno de elementos da lista na forma de string formatada
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
