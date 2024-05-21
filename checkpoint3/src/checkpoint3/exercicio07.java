package checkpoint3;

import java.util.Scanner;

public class exercicio07 {
	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		
		double y = 0;
		int n, i;
		
		System.out.println("Digite um número: ");
		n = in.nextInt();
		
		for(i = 1; i <= n; i++) {
			y += (double) i/Math.sqrt(i);
		}
		System.out.println(y);
		
		
		in.close();
	}

}
