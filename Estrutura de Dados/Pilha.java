package exercicio02;

public class Pilha extends ED {
	
	private int tamanho;
	private int topo;
	private int vetor[];
	
	public Pilha(int tamanho) {
		super();
		this.tamanho = tamanho;
		this.topo = -1;
		vetor = new int [tamanho];
	}
	
	public void adicionar(int valor) {
		if(!pilhaCheia()) {
			topo++;
			vetor[topo] = valor;
		} else 
			System.out.println("A pilha está cheia.\n");
	};
	
	public int remover() {
		if(!pilhaVazia()) {
			int removido = vetor[topo];
			topo--;
			return removido;
		} else {
			System.out.println("A pilha está vazia.\n");
			return -1;
		}
	};
	
	public boolean pilhaVazia() {
		if (topo == -1)
			return true;
		else
			return false;
	}
	
	public boolean pilhaCheia() {
		if(topo == tamanho - 1)
			return true;
		else
			return false;
	}
}
