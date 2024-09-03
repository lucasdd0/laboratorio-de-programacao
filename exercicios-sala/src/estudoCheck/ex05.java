package estudoCheck;

import java.util.Scanner;

public class ex05 {
	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		
		int [] vetor = new int [10];
		
		for (int i = 0; i < vetor.length; i++) {
			System.out.println("Digite o " + (i+1) + "º valor: ");
			vetor[i] = in.nextInt();			
		}
		
		System.out.println("\nValores antes da inversão: ");
		for (int i = 0; i < vetor.length; i++) {
			System.out.print(vetor[i] + " ");
		}
		System.out.println();
		
		int temp;
		
		for (int i = 0; i < vetor.length / 2; i++) {
			temp = vetor[i];
			vetor[i] = vetor [vetor.length - 1 - i];
			vetor [vetor.length - 1 - i] = temp;
		}
		
		System.out.println("Valores depois da inversão: ");
		for (int i = 0; i < vetor.length; i++) {
			System.out.print(vetor[i] + " ");
		}
		System.out.println();
		
		in.close();
		
		}

}
