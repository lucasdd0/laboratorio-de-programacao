package checkpoint3;

import java.util.Scanner;

public class exercicio02 {
	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		
		int n, i, multi;
		boolean refazer = true;
		String resposta;
	
		while (refazer) {
			System.out.println("Digite um número: ");
			n = in.nextInt();
				for(i = 1; i <= 10; i++) {
					multi = n * i;
					System.out.println(n + " X " + i + " = " + multi);
				}
			System.out.println("Deseja outra tabuada (s/n)?");
			resposta = in.next();
			if(resposta.equalsIgnoreCase("n")) {
				refazer = false;
			}
			
		}
		
		
		
		
		
		in.close();
	}

}
