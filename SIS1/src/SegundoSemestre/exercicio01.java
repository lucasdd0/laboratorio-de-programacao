package SegundoSemestre;

import java.util.Scanner;

public class exercicio01 {
	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		
		int rep, i, maior = Integer.MIN_VALUE, menor = Integer.MAX_VALUE;
		
		System.out.println("Digite o tanaho da array: ");
		rep = in.nextInt();
		
		int [] array = new int [rep];
		
		for (i = 0; i < rep; i++) {
			System.out.println("Digite o " + i + "° número: ");
			array[i] = in.nextInt();
			
			if(maior < array[i]) {
				maior = array[i];
			}
			if(menor > array[i]) {
				menor = array[i];
			}
		}
		
		System.out.println("O maior valor é " + maior + " e o menor valor é " + menor);
	}

}
