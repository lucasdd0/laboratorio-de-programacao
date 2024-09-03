package estudoCheck;

import java.util.Scanner;

public class ex01 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int [] vetor = new int[10];
		
		int maior = Integer.MIN_VALUE;
		int menor = Integer.MAX_VALUE;
		
		for(int i = 0; i < vetor.length; i++) {
			System.out.println("Digite o " + (i + 1) + "º valor: ");
			vetor[i] = in.nextInt();
			if(vetor[i] > maior) {
				maior = vetor[i];
			}
			if(vetor[i] < menor) {
				menor = vetor[i];
			}
			
		}
		System.out.println("O maior valor é: " + maior);
		System.out.println("O menor valor é: " + menor);
	}
	
}
