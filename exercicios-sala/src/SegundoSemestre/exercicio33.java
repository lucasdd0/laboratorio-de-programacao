package SegundoSemestre;

import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;

public class exercicio33 {
	//variáveis globais --> para serem acessadas em todos os métodos
	static String[] cpf = new String[5];		
	static String[] nome = new String[5];		
	static double[] saldo = new double[5];
	
	public static void menu() {
		int opcao;
		
		while(true) {
			try {
				opcao = parseInt(showInputDialog(montarMenu()));
				if(opcao == 6) {
					break;
				}
				if(opcao < 1 || opcao > 6) {
					showMessageDialog(null, "A opção deve ser um número entre 1 e 6");
				}
				else {
					switch(opcao) {
					case 1:
						abrirConta();
						break;
					case 2:
						abrirConta();
						break;
					case 3:
						abrirConta();
						break;
					case 4:
						abrirConta();
						break;
					case 5:
						abrirConta();
						break;
					}
				}
			}
			catch(NumberFormatException e) {								//o "e" é uma variável => exception
				showMessageDialog(null, "A opção deve ser um número");
			}
		}
	}
	
	private static String montarMenu() {
		StringBuilder builder = new StringBuilder();
		builder.append("Ecolha uma operação\n")
				.append("1. Abrir conta\n")
				.append("2. Sacar\n")
				.append("3. Depositar\n")
				.append("4. Consultar Saldo\n")
				.append("5. Fechar Conta\n")
				.append("6. Finalizar\n");
		return builder.toString();
	}
}
