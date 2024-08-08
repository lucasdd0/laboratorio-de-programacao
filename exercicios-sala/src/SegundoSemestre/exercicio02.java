package SegundoSemestre;

import java.util.Scanner;

public class exercicio02 {
	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		
		int rep, i, impar = 0;
		
		System.out.println("Digite o tanaho da array: ");
		rep = in.nextInt();
		
		int [] array = new int [rep];
		
		for (i = 0; i < rep; i++) {
			System.out.println("Digite o " + i + "° número: ");
			array[i] = in.nextInt();
			
			if(array[i] % 2 != 0) {
				impar++;
			}
		}
		
		System.out.println("O total de ímpares é: " + impar);
		System.out.println("O total de pares é: " + (array.length - impar));
		
	}

}