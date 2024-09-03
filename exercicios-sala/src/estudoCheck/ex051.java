package estudoCheck;

import java.util.Scanner;

public class ex051 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int [] vetor = new int [10];
		
		for (int i = 0; i < vetor.length; i++) {
			System.out.println("Digite o " + (i + 1) + "º número: ");
			vetor[i] = in.nextInt();
		}
		
		int temp = 0;
		
		for (int i = 0; i < vetor.length / 2; i++) {
			temp = vetor[i];
			vetor[i] = vetor[vetor.length - 1 - i];
			vetor[vetor.length - 1 - i] = temp;
		}
		
		for (int i = 0; i < vetor.length; i++) {
			System.out.print(vetor[i] + " ");
		}
		
		in.close();
	}

}
