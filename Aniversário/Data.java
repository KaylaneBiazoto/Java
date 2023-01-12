package prova02;

public class Data {

	private int dia;
	private int mes;
	private int ano;
	

	public Data (int dia, int mes, int ano) {

		if (dia > 0 && dia < 32) 
			this.dia = dia;
		
		if (mes > 0 && mes < 13) 
			this.mes = mes;
	
		if (ano < 2023 && ano > 0) 
			this.ano = ano;
	
	}

	public void imprimeData () {
		
		if(this.dia != 0 && this.mes != 0 && this.ano != 0)
			System.out.println(this.dia + "/" + this.mes + "/" + this.ano);
		else
			System.out.println("A data fornecida nao e valida.\n");

	}
	
}


