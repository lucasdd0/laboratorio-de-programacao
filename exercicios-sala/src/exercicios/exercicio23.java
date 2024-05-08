package exercicios;

import java.util.Scanner;

public class exercicio23 {
	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		
		int n, i, numero, maior = Integer.MIN_VALUE;
		
		System.out.println("Digite o total de números: ");
		n = in.nextInt();
		
		for(i = 0; i < n; i++) {
			System.out.println("Digite o " + (i + 1) + "° número: ");
			numero = in.nextInt();
			if(numero > maior) {
				maior = numero;
			}
		}
		
		System.out.println(maior);
	}

}
