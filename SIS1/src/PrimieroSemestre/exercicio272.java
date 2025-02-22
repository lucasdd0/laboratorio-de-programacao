package PrimieroSemestre;

import java.util.Scanner;

public class exercicio272 {
	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		
		int valor, total = 0, i;
		
		System.out.println("Digite um número: ");
		valor = in.nextInt();
		
		for (i = 2; i < valor; i++) {
			if(valor % i == 0) {
				total ++;
				break;
			}
		}
		
		System.out.println(total == 0 ? "é primo" : "não é primo");
		
		
		
		
		in.close();
	}

}
