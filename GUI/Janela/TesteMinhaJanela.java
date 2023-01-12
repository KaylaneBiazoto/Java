package aula01;

import javax.swing.JFrame;

public class TesteMinhaJanela {
	
	public static void main(String[] args) {
		
		MinhaJanela janela = new MinhaJanela();

		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		janela.setSize(260,180);
		janela.setVisible(true);
	}
}
