package PrimieroSemestre;

import java.util.Scanner;

public class exercicio27 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int n, i;
		boolean primo = true;
		
		System.out.println("Digite um número: ");
		n = in.nextInt();
		
		if (n <= 1) {
			primo = false;
		}else {
			for(i = 2; i <= n / 2; i++) {
				if (n % i == 0) {
					primo = false;
					break;
				}
			}
		}
		
		if (primo) {
			 System.out.println(n + " é um número primo.");
	     } else {
	         System.err.println(n + " não é um número primo.");
	     }
		
		
		in.close();
	}

}