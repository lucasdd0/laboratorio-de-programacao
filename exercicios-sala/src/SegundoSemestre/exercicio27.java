package SegundoSemestre;

import javax.swing.JOptionPane;

public class exercicio27 {
	public static void main(String[] args) {
		
		JOptionPane.showMessageDialog(null, "Boa noite ");
		String nome = JOptionPane.showInputDialog("Qual seu nome");
		JOptionPane.showMessageDialog(null, "Bem vindo " + nome);
		
		int x = Integer.parseInt(JOptionPane.showInputDialog("Primeiro valor"));
		int y = Integer.parseInt(JOptionPane.showInputDialog("Segundo valor"));
		int resultado = x + y;
		JOptionPane.showMessageDialog(null, "resultado = " + resultado);
		
	}

}
