package checkpoint3;

import java.util.Scanner;

public class exercicio04 {
	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		
		int n, i;
		
		System.out.println("Digite um número: ");
		n = in.nextInt();
		if(n == 0) {
			System.out.println("1");
		} else if(n < 0) {
			System.err.println("Não existe fatorial de número negativo!");
		} else {
			for(i = n-1; i > 0; i--) {
				n = n * i;
			}
			System.out.println(n);
		}
		
		
		in.close();
	}

}
