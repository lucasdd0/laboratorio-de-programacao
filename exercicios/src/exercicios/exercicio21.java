package exercicios;

import java.util.Scanner;

public class exercicio21 {
	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
		int n, i, j, aux;
		
		System.out.println("Digite o total de números: ");
		n  = input.nextInt();
		
		int v [] = new int [n];
		
		for (i = 0; i < n; i++) {
			System.out.println("Digite o " + (i+1) + "° número: ");
			v[i] = input.nextInt();
		}
		
		for (i = 0; i < n; i++) {
			for (j = i+1; j < n; j++)
			{
				if (v[i] > v[j]) {
					aux = v[j];
					v[j] = v[i];
					v[i] = aux;
				}
			}
		}
		
		for (i = 0; i < n; i++) {
			System.out.print(v[i] + ", ");
		}
		
		input.close();
	}

}
