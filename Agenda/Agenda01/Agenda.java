package aula04;

public class Agenda {
	
	private int tamanhoMaximo;
	private int posicaoAtual;
	private Pessoa[] contatos; //Array chama contatos e ele armazena o tipo Pessoa ||| ArrayList<Pessoa> contatos;
	
	public Agenda(int tamanhoMaximo) {
		this.tamanhoMaximo = tamanhoMaximo;
		this.posicaoAtual = 0;
		contatos = new Pessoa[tamanhoMaximo];
	}
	
	public void adicionaContato(Pessoa p) {
		if(posicaoAtual < tamanhoMaximo) {
			contatos[posicaoAtual] = p;
			posicaoAtual++;
		} else //Array out of bounds exceção
			System.out.println("\nCapacidade máxima atinginda. Não foi possível adicionar o contato.");
	}
	
	public void removeContato(String nome) {
		/*Pessoa p = buscaContato(nome);
		
		if(p == null)
			return;*/
		
		int posicao = buscaContato(nome);
		
		if (posicao == -1)
			return;
		
		// Fazer os deslocamentos para não deixar buracos no vetor
		// "shift"
		for(int i = posicao; i < posicaoAtual; i++) {
			contatos[i] = contatos[i + 1];
		}
		
		posicaoAtual--;
	}
	
	/*private Pessoa buscaContato(String nome) {
		if (posicaoAtual == 0) {
			System.out.println("\nAgenda vazia.");
			return null;
		}
		
		for(Pessoa p : contatos) {
			if(p.getNome().equals(nome))
				return p;
		}
		
		System.out.println("\nNão existe contato com o nome informado.");
		return null;
	}*/
	
	private int buscaContato(String nome) {
		if (posicaoAtual == 0) {
			System.out.println("\nAgenda vazia.");
			return -1;
		}
		
		for(int i = 0; i < posicaoAtual; i++) {
			Pessoa p = contatos[i];
			if(p.getNome().equals(nome))
				return i;
		}
		
		System.out.println("\nNão existe contato com o nome informado.");
		return -1;
	}
	
	public void imprimeAgenda() {
		for(int i = 0; i < posicaoAtual; i++) {
			Pessoa p = contatos[i];
			System.out.println(p); //Joga direto porque tem o toString nela
		}
	}
}
