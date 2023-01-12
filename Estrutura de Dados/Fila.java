package exercicio02;

public class Fila extends ED {

	protected int vetor[];
	protected int tamanhoFila;
	private int inicio;
	private int fim;
	protected int qntdElementos;

	public Fila(int tamanhoFila) {
		super();
		this.tamanhoFila = tamanhoFila;
	    inicio = 0;
	    fim = 0;
		qntdElementos = 0;
		vetor = new int [tamanhoFila];
	}
	
	public void adicionar(int valor) {
		
		if(!filaCheia()) {
			vetor[fim] = valor;
			fim++;
			qntdElementos++;
		} else 
			System.out.println("A fila está cheia.\n");
	};
	
	public int remover() {
		if(!filaVazia()) {
			int removido = vetor[inicio];
			inicio++;
			qntdElementos--;
			return removido;
		} else {
			System.out.println("A fila está vazia.\n");
			return -1;
		}
	};
	
	public boolean filaCheia() {
		if(qntdElementos == (tamanhoFila - 1)) 
			return true;
	    else
			return false;
	}
	
	public boolean filaVazia() {
		if(qntdElementos != 0) 
			return false;
	    else
			return true;
	}
	
}
