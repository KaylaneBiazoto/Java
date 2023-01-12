package aula04;

public class Teste {
	public static void main(String[] args) {
		Agenda a = new Agenda(10);
		
		Pessoa p1 = new Pessoa("Maria", "(44) 99999-1234", "maria@uem.br");
		Pessoa p2 = new Pessoa("Ana", "(44) 99999-5678", "ana@uem.br");
		
		a.adicionaContato(p1);
		a.adicionaContato(p2);
		
		a.imprimeAgenda();
	}
}
