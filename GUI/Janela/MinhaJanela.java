package aula01;

import javax.swing.JFrame; // JFrame é a janela com vários comportamentos básicos, a MinhaJanela vai utilizar alguns deles e personalizar.
import javax.swing.JLabel;
import java.awt.FlowLayout;

//import javax.swing.*; (importa tudo)

public class MinhaJanela extends JFrame {
	 
	 private JLabel label1;
	 private JLabel label2;
	 private JLabel label3;
	 
	 // Configura MinhaJanela sempre no construtor
	 public MinhaJanela() {
		 
		 super("Testando JLabel"); // Título na JFrame (que é a superclasse)
		 setLayout(new FlowLayout()); // Define o posicionamento 
		 
		 label1 = new JLabel("Label com texto");
		 add(label1); // Vincula os componentes com a janela
		 
		 
	 }
}