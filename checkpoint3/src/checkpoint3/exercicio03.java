package checkpoint3;

import java.util.Scanner;

public class exercicio03 {
	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		
		int n, result;
		String resp;
		
		while(true) {
			System.out.println("Digite um número: ");
			n = in.nextInt();
			
			int cont = 1;
			
			while(cont <= 10) {
				result = n * cont;
				System.out.println(n + " X " + cont + " = " + result);
				cont++;
			}
			System.out.println("Deseja uma nova conta (s/n)?");
			resp = in.next();
			if (resp.equalsIgnoreCase("n")) {
				break;
			}
		}
		
		
		in.close();
	}

}
