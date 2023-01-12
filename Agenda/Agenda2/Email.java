package exercicio01;

public class Email extends Contato {
	
	private String email;
	
	public Email (String email) {
		super("Email");
		this.email = email;
	}
	
	public void exibir() {
		System.out.println("E-mail: " + email + "\n");
	};
}
