package SegundoSemestre;

import java.util.Iterator;
import java.util.Random;

public class exercicio09 {
	public static void main(String[] args) {

		Random rd = new Random();
		int[] array = new int[rd.nextInt(5, 12)];
		int aux;

		System.out.println("antes da ordenação");
		for (int i = 0; i < array.length; i++) {
			array[i] = rd.nextInt(15);
			System.out.print(array[i] + "  ");
		}

		for (int j = 0; j < array.length; j++) {
			for (int i = 0; i < array.length - 1; i++) {
				if (array[i] > array[i + 1]) {
					aux = array[i];
					array[i] = array[i + 1];
					array[i + 1] = aux;
				}

			}
		}

		System.out.println("\n\ndepois da ordenação");
		for (int i : array) {
			System.out.print(i + "  ");
		}

	}

}
