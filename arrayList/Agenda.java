package arrayList;

import java.util.ArrayList;

public class Agenda {

	private int tamanhoMaximo;
	private ArrayList<Pessoa> contatos = new ArrayList<Pessoa>();
	
	public Agenda(int tamanhoMaximo) {
		
		this.tamanhoMaximo = tamanhoMaximo;
		
	}
	
	public void adicionaContato(Pessoa p) {
		
		if (contatos.size() < tamanhoMaximo)
			contatos.add(p);
		else
			System.out.println("Capacidade máxima atinginda. Não foi possível adicionar o contato.\n");
	}
	
	public void removeContato(String nome) {
		
		Pessoa p = buscaContato(nome);
		
		if (p == null)
			return;
		
		for (int i = 0; i < contatos.size(); i++) {
			if(p.equals(contatos.get(i))) {
				contatos.remove(i);
			}
		}
		
	}
	
	private Pessoa buscaContato(String nome) {
		
		if (contatos.isEmpty()) {
			System.out.println("\nAgenda vazia.");
			return null;
		}
		
		for (Pessoa p : contatos) {
			if(p.getNome().equals(nome))
				return p;
		}
		
		System.out.println("\nNão existe contato com o nome informado.");
		return null;
	}
	
	public void imprimeAgenda() {
		
		if (contatos.isEmpty()) 
			System.out.println("\nAgenda vazia.");
		
		for(Pessoa p : contatos) {
			System.out.println(p);
		}
	}
	
}
