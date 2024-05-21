package checkpoint3;

import java.util.Scanner;

public class exercicio05 {
	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		
		long n;
		
		System.out.println("Digite um número: ");
		n = in.nextInt();
		
		int i = (int) n - 1;
		
		while(n > 0 && i > 0) {
			n = n * i;
			i--;
		}
		System.out.println(n);
		
		
		
	}
}
