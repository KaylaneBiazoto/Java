package exercicio01;


public class Agenda {

	private String proprietario;
	private Pessoa[] pessoas;
	private int max;
	private int cont = 0;
	
	public Agenda (String proprietario, int max) {
		this.proprietario = proprietario;
		this.max = max;
		pessoas = new Pessoa[max];
	}
	
	public void addPessoa(Pessoa p) {
		
		if(cont < max) {
			pessoas[cont] = p;
			cont++;
		} else
			System.out.println("A agenda já está cheia.\n");
	}
	
	public Pessoa buscarPessoa(String nome) {
		
		if (cont == 0) {
			System.out.println("A agenda está vazia.\n");
			return null;
		}
		
		for (Pessoa pessoa : pessoas) {
			if(pessoa.getNome().equals(nome)) {
				System.out.println("Pessoa " + nome + " encontrada!\n");
				return pessoa;
			} else {
				System.out.println("A pessoa informada não existe na agenda.\n");
				return null;
			}
		}
		
		System.out.println("\nNão existe uma pessoa com o nome informado.");
		return null;
	}
	
	public void addContato(String nome, Contato c) {
		for(int i = 0; i < cont; i++) {
			if(pessoas[i].getNome().equals(nome)) {
				pessoas[i].adicionarContato(c);
			}
		}
	}
	
	public void exibirTodasPessoas() {
		for (int i = 0; i < cont; i++) {
			System.out.println(pessoas[i].getNome() + "\n");
			pessoas[i].exibirContatos();
		}
	}
	
	public void exibirContatosPessoa(String nome) {
		
		for (int i = 0; i < cont; i++) {
			System.out.println(pessoas[i].getNome() + "\n");
			pessoas[i].exibirContatos();
		}
	}
	
	public void exibirPessoasComEmail() {
		for (int i = 0; i < cont; i++) {
			if(pessoas[i].possuiEmail() == true) {
				System.out.println(pessoas[i].getNome());
			};
		}
	};
	
	public boolean recuperarPessoaPorEmail(Email email) {
		
		Contato[] contato_aux = new Contato[max];
		
		for(int i = 0; i < max; i++) {
			if(pessoas[i].possuiEmail() == true) {
				contato_aux = pessoas[i].getContatos("Email");
				if(contato_aux[i] == email) {
					System.out.println(pessoas[i].getNome());
					System.out.println("E-mail encontrado. A pessoa com o contato é " + pessoas[i].getNome() + ".\n");
					return true;
				} else {
					System.out.println("O contato não foi encontrado.");
					return false;
				}
					
			}
		}
		return false;
	}
	
	public boolean recuperarPessoaPorTelefone (Telefone telefone) {
		
		Contato[] contato_aux = new Contato[max];
		
		for(int i = 0; i < max; i++) {
			if(pessoas[i].possuiTelefone() == true) {
				contato_aux = pessoas[i].getContatos("Telefone");
				if(contato_aux[i] == telefone) {
					System.out.println(pessoas[i].getNome());
					System.out.println("Telefone encontrado. A pessoa com o contato é " + pessoas[i].getNome() + ".\n");
					return true;
				} else {
					System.out.println("Contato não foi encontrado.");
					return false;
				}
					
			}
		}
		return false;
	}
}
