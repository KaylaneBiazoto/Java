package exercicio01;

public class Telefone extends Contato{

	private String telefone;
	
	public Telefone (String telefone) {
		super("Telefone");
		this.telefone = telefone;
	}
	
	public void exibir() {
		System.out.println("Telefone: " + telefone + "\n");
	};
}

// Contador 0 servindo como posicao_atual D:
