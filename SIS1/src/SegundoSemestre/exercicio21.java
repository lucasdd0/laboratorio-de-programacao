package SegundoSemestre;

import java.util.Random;
import java.util.Scanner;

public class exercicio21 {
	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		
		int [][] m = new int [4][4];
		
		lerDados(m);
		imprimir(m);
		
	}

	public static void lerDados(int[][] m) {
		Random rd = new Random();
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m.length; j++) {
				m[i][j] = rd.nextInt(1,25);
			}
		}
	}
	
	public static void imprimir(int[][] m) {
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m.length; j++) {
				System.out.print(m[i][j] + "\t");
			}
			System.out.println();
		}
	}

}
