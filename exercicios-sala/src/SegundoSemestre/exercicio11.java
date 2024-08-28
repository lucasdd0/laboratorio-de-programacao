package SegundoSemestre;

import java.util.Scanner;

public class exercicio11 {
	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		
		int somaDp = 0, somaDs = 0;
		int[][] x = new int[4][4];

		for (int i = 0; i < x.length; i++) {
			for (int j = 0; j < x[i].length; j++) {
				System.out.println("Digite o valor [" + i + "]" + "[" + j + "]: ");
				x[i][j] = in.nextInt();
				if (i == j) {
					somaDp += x[i][j];
				}
				if (i + j == x.length -1) {
					somaDs += x[i][j];
				}
			}
		}
		System.out.println();
		for (int i = 0; i < x.length; i++) {
			for (int j = 0; j < x[i].length; j++) {
				System.out.print(x[i][j] + "\t");
			}
			System.out.println();
		}
		
		System.out.println("Soma Dp: " + somaDp);
		System.out.println("Soma Ds: " + somaDs);
	}
}