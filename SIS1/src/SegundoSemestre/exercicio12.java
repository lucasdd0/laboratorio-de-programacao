package SegundoSemestre;

import java.util.Scanner;

import java.util.Random;

public class exercicio12 {
	public static void main(String[] args) {
		
	Scanner in = new Scanner (System.in);

		Random rd = new Random();
		int [][] matrix = new int [10][10];
		int l, c, maior = 0;

		for (l = 0; l < matrix.length; l++) {
			for (c = 0; c < matrix.length; c++) {
				matrix[l][c] = rd.nextInt(1000);
				System.out.print(matrix[l][c] + "\t");
				if (matrix[l][c] > maior) {
					maior = matrix[l][c];
				}
				
			} System.out.println();
			
		}
		
		for (l = 0; l < matrix.length; l++) {
			for (c = 0; c < matrix.length; c++) {
				if (matrix[l][c] == maior) {
					System.out.println("[" + (l +1) + ", " + (c+1) + "]");
				}
			}
		}
	}
}
