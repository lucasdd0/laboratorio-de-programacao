package estudoCheck;

import java.util.Scanner;

public class ex02 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int [] vetor = new int [10];
		int impar = 0, par = 0;
		
		for (int i = 0; i < vetor.length; i++) {
			System.out.println("Digite o " + (i+1) + "º valor: ");
			vetor[i] = in.nextInt();
			if(vetor[i] % 2 == 0) {
				par++;
			}
			if(vetor[i] % 2 != 0) {
				impar++;
			}
		}
		
		System.out.println("A quantidade de impares é " + impar + " e a quantidade de pares é " + par);
		
	}

}
