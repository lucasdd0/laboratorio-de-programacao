package SegundoSemestre;

import java.util.Random;
import java.util.Scanner;

public class exercicio14 {
	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		
		Random rd = new Random();
		
		System.out.println("Digite o total de linhas: ");
		int linhas = in.nextInt();
		System.out.println("Digite o total de colunas: ");
		int colunas = in.nextInt();
		int [][] mm = new int [linhas][colunas];
		
		int [][] novamm = new int [colunas][linhas];
		
		System.out.println("Matriz antiga");
		for (int i = 0; i < linhas; i++) {
			for (int j = 0; j < colunas; j++) {
				mm[i][j] = rd.nextInt(0,10);
				System.out.print(mm[i][j] + "\t");
				novamm[j][i] = mm[i][j];
			}
			System.out.println();
		}
		
		System.out.println("\nMatriz nova");
		for (int i = 0; i < colunas; i++) {
			for (int j = 0; j < linhas; j++) {
				System.out.print(novamm[i][j] + "\t");
			}
			System.out.println();
		}
		

		
		
		
		in.close();
	}

}
