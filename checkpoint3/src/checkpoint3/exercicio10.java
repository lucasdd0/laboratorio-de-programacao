package checkpoint3;

import java.util.Scanner;

public class exercicio10 {
	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		
		int n, i;
		boolean primo = true;
		
		System.out.println("Digite um número: ");
		n = in.nextInt();
		
		if (n <= 1) {
			primo = false;
		}else {
			for(i = 2; i <= n / 2; i++) {
				if(n % i == 0) {
					primo = false;
					break;
				}
			}
		}
		
		if (primo) {
			System.out.println("o número " + n + " é primo!");
		} else {
			System.err.println("o número " + n + " não é primo!");
		}
		
		
		in.close();
	}

}
