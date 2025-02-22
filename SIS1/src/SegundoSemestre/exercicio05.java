package SegundoSemestre;

import java.util.Scanner;

public class exercicio05 {
	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		
		System.out.println("Digite o tamanho da array: ");
		int rep = in.nextInt();
		
		int [] array = new int [rep];
		
		for (int i = 0; i < array.length; i++) {
			System.out.println("Digite o valor [" + i + "] = ");
			array[i] = in.nextInt();
		}
		
		boolean especial = true;
		
		for (int i = 0; i < array.length - 1; i++) {
			if(array[i] % 2 == array[i + 1] % 2) {
				especial = false;
				break;
			}
		}
		
        if (especial) {
            System.out.println("Esse array é considerado especial");
        } else {
            System.out.println("Esse array não é considerado especial");
        }
		
	}

}
