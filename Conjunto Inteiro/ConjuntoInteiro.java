package prova02Ex04;

import java.util.Arrays;

public class ConjuntoInteiro {
	
	private static final int TAMANHO = 101;
	private Boolean vetorInt[];
	
	public ConjuntoInteiro () {
		
		// Cria o array com o tamanho de 0 a 100
		vetorInt = new Boolean[TAMANHO];
		
		// Preenche o array com false
		Arrays.fill(vetorInt, false);
		
	}
	
	public ConjuntoInteiro uniao(ConjuntoInteiro novo) {
		
		//O método recebe dois arrays e cria um novo que é a união resultante dos dois
		Boolean conjuntoUniao[] = new Boolean[TAMANHO];
		
		for(int i = 0; i < TAMANHO; i++) {
			// Se um dos dois for true, já realiza. Caso o contrário, permanece o false
			conjuntoUniao[i] = this.vetorInt[i] || novo.vetorInt[i];
		}
		
		ConjuntoInteiro uni = new ConjuntoInteiro();
		uni.vetorInt = conjuntoUniao;
		return uni;
		
	}
	
	public ConjuntoInteiro intersecao(ConjuntoInteiro novo) {
		
		//O método recebe dois arrays e cria um novo que é a união resultante dos dois
		Boolean conjuntoIntersecao[] = new Boolean[TAMANHO];
		
		for(int i = 0; i < TAMANHO; i++) {
			
			conjuntoIntersecao[i] = this.vetorInt[i] && novo.vetorInt[i];
		}
		
		ConjuntoInteiro inter = new ConjuntoInteiro();
		inter.vetorInt = conjuntoIntersecao;
		return inter;
	}
	
	public void insereElemento (int k) {
		
		this.vetorInt[k] = true;
		
	}
	
	public void excluiElemento (int m) {
		
		this.vetorInt[m] = false;
		
	}
	
	public String toString() {
		
		String str = "{ ";
		
		for (int i = 0; i < TAMANHO; i++) {
			if(vetorInt[i])
				str = str + i + " ";
		}
		
		str = str + "}";
		
		return str;
	}
	
	public boolean saoIguais(ConjuntoInteiro novo) {
		
		for (int i = 0; i < TAMANHO; i++) {
			
	        if (this.vetorInt[i] != novo.vetorInt[i]) {
	        	return false;
	        }
	    }
		
	    return true;
	}
}
