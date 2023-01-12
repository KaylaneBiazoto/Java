package exercicio02;

public class TesteED {
	
	public static void main (String args[]) {
		//ED estrutura = new Pilha(10); 
		//ED estrutura = new Fila(10); //uma fila com 10 posições
		ED estrutura = new FilaPrioridade(10); //uma fila com prioridade com 10 posições -- Crescente
		
		estrutura.adicionar(10);
		estrutura.adicionar(5);
		estrutura.adicionar(7);
		estrutura.adicionar(2);
		estrutura.adicionar(4);
		
		int elemento = estrutura.remover();
		while(elemento != -1){
			System.out.println(elemento);
			elemento = estrutura.remover();
		}
		
	}
	
}
