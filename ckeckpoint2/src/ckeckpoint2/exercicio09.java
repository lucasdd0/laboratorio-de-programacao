package ckeckpoint2;

import java.util.Scanner;

public class exercicio09 {
	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		
		int v1, v2, v3, menor;
		
		System.out.println("Digite o 1° valor: ");
		v1 = in.nextInt();
		
		System.out.println("Digite o 2° valor: ");
		v2 = in.nextInt();		
		
		System.out.println("Digite o 3° valor: ");
		v3 = in.nextInt();
		
		if (v1 != v2 && v2 != v3 && v3 != v1) {
			menor = v1;
			if (menor > v2) {
				menor = v2;
				if (menor > v3) {
					menor = v3;
				}
			}
			System.out.println("O menor valor é: " + menor);
		}
		else {
			System.err.println("Os valores precisam ser diferentes!");
		}
		
		
		in.close();
	}

}