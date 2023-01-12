package prova02Ex04;

public class TesteConjuntoInteiro {

	public static void main(String[] args) {
		
		ConjuntoInteiro v1 = new ConjuntoInteiro();
		v1.insereElemento(1);
		v1.insereElemento(2);
		v1.insereElemento(3);
		
		
		ConjuntoInteiro v2 = new ConjuntoInteiro();
		v2.insereElemento(1);
		v2.insereElemento(4);
		v2.insereElemento(2);
		v2.insereElemento(5);
		
		System.out.println("Vetor 1:" + v1.toString());
		System.out.println("Vetor 2:" + v2.toString());
		System.out.println("Os dois vetores são iguais? " + v1.saoIguais(v2));
		System.out.println("Intersecao dos dois vetores: " + v1.intersecao(v2).toString());
		//v2.excluiElemento(5);
		System.out.println("Uniao dos dois vetores: " + v1.uniao(v2).toString());
		
	}
}
