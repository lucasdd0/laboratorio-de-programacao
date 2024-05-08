package exercicios;

import java.util.Scanner;

public class exercicio22 {
	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		
		int i = 0, valor, maior = Integer.MIN_VALUE;
		
		while(i < 5) {
			System.out.println("Digite o " + (i + 1) + "° valor: ");
			valor = in.nextInt();
			
			if(valor > maior) {
				maior = valor;
			}
			i = i + 1;
		}
		
		System.out.println(maior);
	}

}