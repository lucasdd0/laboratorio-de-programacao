package estudoCheck;

import java.util.Scanner;

public class correcaoDNA {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String saudavel, infectado;
		
		System.out.println("DNA saudável --> ");
		saudavel = sc.next().toUpperCase();
		System.out.println("DNA infectado --> ");
		infectado = sc.next().toUpperCase();
		
		System.out.println("total inserido --> " + calcular(saudavel, infectado));
		
	}

	private static int calcular(String saudavel, String infectado) {
		int total = 0;
		int s = 0, i = 0;
		
		if(!saudavel.equals(infectado)) {
			while(s < saudavel.length()) {
				if(saudavel.charAt(s) != infectado.charAt(i)) {
					total++;
				}
				else {
					s++;
				}
				i++;
			}
		}
		return total;
	}

}
