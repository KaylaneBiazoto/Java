package arrayList;


public class testeAgenda {
	
	public static void main(String[] args) {
		
		Agenda a = new Agenda(10);
		
		Pessoa p1 = new Pessoa("Maria", "(44) 99999-1234", "maria@uem.br");
		Pessoa p2 = new Pessoa("Ana", "(44) 99999-5678", "ana@uem.br");
		Pessoa p3 = new Pessoa("Rafael", "(44) 99999-9999","rafael@uem.br");
		Pessoa p4 = new Pessoa("Alan", "(44) 99999-4321", "alan@uem.br");
		Pessoa p5 = new Pessoa("Gabriela", "(44) 99999-8765", "gabriela@uem.br");
		
		a.adicionaContato(p1);
		a.adicionaContato(p2);
		a.adicionaContato(p3);
		a.adicionaContato(p4);
		a.adicionaContato(p5);
		
		a.removeContato("Rafael");
		
		a.imprimeAgenda();
		
	}
	
}
