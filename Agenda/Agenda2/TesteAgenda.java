package exercicio01;

public class TesteAgenda {
	
	public static void main(String[] args) {
		final int MAX = 5;
		
		Agenda a = new Agenda("Dono da Agenda", 5);
		
		Pessoa p = new Pessoa("Jane Doe", MAX);
		Pessoa p2 = new Pessoa ("John Doe", MAX);
		
		Contato c1 = new Email("c1@gmail.com");
		Contato c2 = new Telefone("(44) 99912-3456");
		Contato c3 = new Email("c3@gmail.com");
		Contato c4 = new Telefone("(44) 99978-9123");
		
		Contato contato = new Telefone("(43) 99999-9999");
		
		p.adicionarContato(c1);
		p.adicionarContato(c2);
		p.adicionarContato(c3);
		p.adicionarContato(c4);
		
		p2.adicionarContato(contato);
	
		
		p.exibirContatos();
		
		System.out.println("----------------\n");
		
		if(p.possuiEmail() == true && p.possuiTelefone() == true) {
			
			Contato[] contato_aux = new Contato[MAX];
			
			System.out.println("Contatos feitos com e-mail e telefone:\n");
			
			contato_aux = p.getContatos("Email");
			
			for (int i = 0; i < contato_aux.length; i++) {
				if(contato_aux[i] != null)
					contato_aux[i].exibir();
			}
			
			contato_aux = p.getContatos("Telefone");
			for (int i = 0; i < contato_aux.length; i++) {
				if(contato_aux[i] != null)
					contato_aux[i].exibir();
			}
			
		} else if (p.possuiEmail() == true) {
			
			Contato[] contato_aux = new Contato[MAX];
			
			System.out.println("Contatos feitos com e-mail:\n");
			
			contato_aux= p.getContatos("Email");
			for (int i = 0; i < contato_aux.length; i++) {
				if(contato_aux[i] != null)
					contato_aux[i].exibir();
			}
			
		} else if(p.possuiTelefone() == true) {
			
			Contato[] contato_aux = new Contato[MAX];
			
			System.out.println("Contatos feitos com telefone:\n");
			
			contato_aux = p.getContatos("Telefone");
			for (int i = 0; i < contato_aux.length; i++) {
				if(contato_aux[i] != null)
					contato_aux[i].exibir();
			}
		}; 
		
		a.addPessoa(p);
		a.addPessoa(p2);
		
		Contato novo_contato = new Email("novocontato@gmail.com");
		a.addContato("Jane Doe", novo_contato);
		

		System.out.println("----------------\n");
		System.out.println("Pessoas na agenda e seus contatos:\n");
		a.exibirTodasPessoas();

		/*System.out.println("----------------\n");
		a.exibirContatosPessoa("Jane Doe");
		System.out.println("----------------\n");
		a.exibirContatosPessoa("John Doe");*/
		
		System.out.println("----------------\n");
		System.out.println("Procurando pessoa por e-mail e telefone...\n");
		a.recuperarPessoaPorEmail((Email) c1);
		a.recuperarPessoaPorTelefone((Telefone) c2);
		
		
		System.out.println("----------------\n");
		System.out.println("Pessoas com contatos feitos por e-mail: ");
		a.exibirPessoasComEmail();
	}
}
