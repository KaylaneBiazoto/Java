package exercicio01;


public class Pessoa{
	
	private Contato[] contatos;
	private String nome;
	private int max;
	private int cont = 0;
	
	public Pessoa (String nome, int max) {
		this.nome = nome;
		this.max = max;
		contatos = new Contato[max];
	}
	
	public void adicionarContato(Contato c) {
		
		if(cont < max) {
			contatos[cont] = c;
			cont++;
		} else
			System.out.println("A agenda já está cheia.\n");
	}
	
	public Contato[] getContatos() {
		
		if (contatos.length == 0) {
			System.out.println("\nNenhum contato.");
			return null;
		} else {
			return contatos;
		}
	}
	
	public Contato[] getContatos(String tipo) {
		
		Contato[] contatos_tipo = new Contato[cont];
		
		if (cont == 0) {
			System.out.println("\nNenhum contato.");
			return null;
		}
		
		int cont_tipo = 0;
		for (int i = 0; i < cont; i++) {
			if((contatos[i]).getTipo().equals(tipo)) {
				contatos_tipo[cont_tipo] = contatos[i];
				cont_tipo++;
			}
		}
		
		return contatos_tipo;
	}
	
	public boolean possuiEmail() {
		
		if (contatos.length == 0) {
			System.out.println("\nNenhum contato.");
			return false;
		}
		
		for (int i = 0; i < contatos.length; i++) {
			if(contatos[i] instanceof Email) {
				return true;
			}	
		}
		
		return false;
	}
	
	public boolean possuiTelefone() {
		
		if (contatos.length == 0) {
			System.out.println("\nNenhum contato.");
			return false;
		}
		
		for (int i = 0; i < contatos.length; i++) {
			if(contatos[i] instanceof Telefone)
				return true;
		}
		
		return false;
	}
	
	public void exibirContatos() {
		
		if (contatos.length == 0) 
			System.out.println("\nNenhum contato.");
		
		System.out.println("\nContatos de " + getNome() + "\n");
		
		for (int i = 0; i < cont; i++) {
			
			if(contatos[i] instanceof Email) {
				System.out.println("Contato[" + i + "]: ");
				contatos[i].exibir();
			} else if (contatos[i] instanceof Telefone) {
				System.out.println("Contato[" + i + "]: ");
				contatos[i].exibir();
			}
		}
		System.out.println("\n");
	}

	public String getNome() {
		return nome;
	}
	
}
