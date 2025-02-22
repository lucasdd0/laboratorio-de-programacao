package SegundoSemestre;

import java.util.Iterator;
import java.util.Scanner;

public class exercicio22 {
	public static void main(String[] args) {

		
		int [][] m = new int [2][2];
		
		preenchendo(m);
		imprimindo(m);
		maior(m);
		
	}
	
	public static void preenchendo (int m [][]) {
		Scanner in = new Scanner(System.in);
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m.length; j++) {
				System.out.println("Digite o " + (i + 1) + "º elemento: ");
				m[i][j] = in.nextInt();
			}
		}
		in.close();
	}
	
	public static void imprimindo(int m [][]) {
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m.length; j++) {
				System.out.print(m[i][j] + "\t");
			}
			System.out.println();
		}
	}
	
	public static void maior(int m[][]) {
	    for (int i = 0; i < m.length; i++) {
	        int max = m[i][0]; // Assume que o primeiro elemento é o maior
	        for (int j = 1; j < m.length; j++) {
	            if (m[i][j] > max) {
	                max = m[i][j]; // Atualiza o maior número se necessário
	            }
	        }
	        System.out.println("O maior número da linha " + (i + 1) + " é: " + max);
	    }
	}


}
