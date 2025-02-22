package SegundoSemestre;

import java.util.Scanner;

public class exercicio04 {
	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		
		int rep;
		
		System.out.println("Digite o tamanho da array: ");
		rep = in.nextInt();
		
		int [] array = new int [rep];
		
		for (int i = 0; i < array.length; i++) {
			System.out.println("Digite o valor [" + i + "] = ");
			array[i] = in.nextInt();
		}
		
		for (int i = 0; i < array.length / 2; i++) {
			int temp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = temp;
		}
		
		 System.out.println("Números invertidos:");
	        for (int numero : array) {						// : => for-each: iteração sobre os elementos de uma coleção (armazena o valor da array dentro da variável número e imprime)
	            System.out.print(numero + " ");
	        }
		
	}

}
