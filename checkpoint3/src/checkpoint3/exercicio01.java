package checkpoint3;

import java.util.Scanner;

public class exercicio01 {
	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		
		double n, i, maior = Integer.MIN_VALUE;
		
		for (i = 0; i < 15; i++) {
			System.out.println("Digite o " + (i + 1) + "º número: ");
			n = in.nextDouble();
			if(maior < n) {
				maior = n;
			}
		}
		
		System.out.println(maior);
		
		in.close();
	}

}
