package exercicios;

import java.util.Scanner;

public class exercicio29 {
	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		
		int i, n, sinal = 1;
		double y = 0;
		
		System.out.println("Informe um número: ");
		n = in.nextInt();
		
		for (i = 1; i <= n; i++) {
			y += (double) 1 / i * sinal;
			sinal *= -1;
		}
		
		System.out.println("y = " + y);
		
		
		
		
		
		in.close();
	}

}
