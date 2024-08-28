package SegundoSemestre;

import java.util.Scanner;

public class exercicio10 {
	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		
		int[][] x = new int[2][3];

		for (int i = 0; i < x.length; i++) {
			for (int j = 0; j < x[i].length; j++) {
				System.out.println("valor: ");
				x[i][j] = in.nextInt();

			}
		}
		System.out.println();
		for (int i = 0; i < x.length; i++) {
			for (int j = 0; j < x[i].length; j++) {
				System.out.print(x[i][j] + "\t");
			}
			System.out.println();
		}
	}
}