package exercicios;

import java.util.Scanner;

public class exercicio25 {
	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		
		int valor, resultado;
		String resposta;
		
		while(true) {
			System.out.println("Valor: ");
			valor = in.nextInt();
			
			int cont = 1;
			
			while(cont <= 10) {
				resultado = valor * cont;
				System.out.println(valor + " * " + cont + " = " + resultado);
				cont++;
			}
			System.out.println("Deseja outra tabuada (s/n)?");
			resposta = in.next();
			if(resposta.equalsIgnoreCase("n")) {
				break;
			}
		}
	}

}
