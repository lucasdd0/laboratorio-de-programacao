package checkpoint3;

import java.util.Scanner;

public class exercicio09 {
	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		
		int n, i;
		
		System.out.println("Digite um número: ");
		n = in.nextInt();
		
		for(i = -n; i <= n; i++) {
			if(i != 0 && n % i == 0) {
				System.out.print(i + " ");
			}
		}
		
		
		in.close();
	}

}
