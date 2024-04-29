package exercicios;

import java.util.Scanner;

public class exercicio20 {
	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
		int mm [][] = new int [3][3];
		int i, j;
		
		System.out.println("Digite o total de linhas: ");
		i = input.nextInt();
		
		System.out.println("Digite o total de colunas: ");
		j = input.nextInt();
		
		for (i = 0; i < 3; i++) {
			for (j = 0; j < 3; j++) {
				System.out.println("Digite o [" + (i+1) + "]" + "[" + (j+1) + "] : ");
				mm [i][j] = input.nextInt();
			}
		}
		
		for (i = 0; i < 3; i++) {
			for (j = 0; j < 3; j++) {
				System.out.print(mm [i][j] + " ");
			}
			System.out.println();
		}
		
		input.close();
	}

}
