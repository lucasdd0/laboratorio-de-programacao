package ckeckpoint2;

import java.util.Scanner;

public class exercicio10 {
	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		
		int v1, v2, v3, temp;
		
		System.out.println("Digite o 1° valor: ");
		v1 = in.nextInt();
		
		System.out.println("Digite o 2° valor: ");
		v2 = in.nextInt();		
		
		System.out.println("Digite o 3° valor: ");
		v3 = in.nextInt();
		
		if (v1 > v2) {
			temp = v1;
			v1 = v2;
			v2 = temp;
		}
		if (v2 > v3) {
			temp = v2;
			v2 = v3;
			v3 = temp;
		}
		if (v1 > v2) {
			temp = v1;
			v1 = v2;
			v2 = temp;
		}
		
		System.out.println("Os números em ordem crescente são: " + v1 + ", " + v2 + ", " + v3);
		
		in.close();
	}

}
