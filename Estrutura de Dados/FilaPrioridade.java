package exercicio02;

public class FilaPrioridade extends Fila{
	
	protected int[] vetor;
	protected int tamanho;
	private int inicio;
	protected int qntdElementos;

	public FilaPrioridade(int tamanhoFila) {
		super(tamanhoFila);
		this.vetor = new int [tamanhoFila];
		this.tamanho = tamanhoFila;
		this.inicio = 0;
		this.qntdElementos =  0;
	}

	public void adicionar (int valor) { // Sobrescrito
		int i;
		
		if(qntdElementos == 0) {
			vetor[0] = valor;
			qntdElementos++;
			return;
		}
		
		for(i = qntdElementos - 1; i >= 0; i--) {
			if(valor > vetor[i]) {
				vetor[i+1] = vetor[i];
			} else {
				break;
			}
		}
		
		vetor[i+1] = valor;
		qntdElementos++;
	}
	
	public int remover() { // Igual ao da fila normal
		if(qntdElementos != 0) {
			int removido = vetor[inicio];
			inicio++;
			qntdElementos--;
			return removido;
		} else {
			System.out.println("A fila está vazia.\n");
			return -1;
		}
	};
	
	
	
}

