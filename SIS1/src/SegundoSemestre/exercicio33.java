package SegundoSemestre;

import static javax.swing.JOptionPane.*;

import static java.lang.Integer.*;

public class exercicio33 {
	//variáveis globais --> para serem acessadas em todos os métodos
	static String[] cpf = new String[5];		
	static String[] nome = new String[cpf.length];		
	static double[] saldo = new double[cpf.length];
	static int posicao = 0;
	
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
//					case 2:
//						sacar();
//						break;
//					case 3:
//						depositar();
//						break;
					case 4:
						consultarSaldo();
						break;
					case 5:
						fecharConta();
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
	
	private static int pesquisar() {
		int index = -1;
		String aux = showInputDialog("CPF para pesquisar");
		for(int i = 0; i < posicao; i++) {
			if(cpf[i].equals(aux)) {
				index= i;
			}
		}
		if(index == -1) {
			showConfirmDialog(null, "CPF não encotrado");
		}
		return index;
	}
	
	private static void abrirConta() {
		if(posicao < cpf.length) {
			cpf[posicao] = showInputDialog("CPF");
			nome[posicao] = showInputDialog("Nome");
			posicao++;
		}
		else {
			showConfirmDialog(null, "Procure a agência");
		}
	}
	
	private static void fecharConta() {
		int index = pesquisar();
		if(index != -1) {
			for(int i = index; i < posicao - 1; i++) {
				cpf[i] = cpf[i + 1];
				nome[i] = nome[i + 1];
				saldo[i] = saldo[i + 1];
			}
			posicao--;
		}
	}
	
	private static void consultarSaldo() {
		int index =pesquisar();
		if(index != -1) {
			showConfirmDialog(null, nome[index] + "\nSaldo R$ " + saldo[index]);
		}
	}
	
}
