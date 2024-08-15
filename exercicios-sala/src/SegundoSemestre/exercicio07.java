package SegundoSemestre;

import java.util.Random;
import java.util.Scanner;


public class exercicio07 {
	public static void main(String[] args) {
		
		Scanner in = new Scanner (System.in);
		
		System.out.println("Digite o tamanho da array: ");
		int rep = in.nextInt();
		

		Random rd = new Random();
		
		int [] v = new int [rep];
		
		boolean status;
		
		for (int i = 0; i < v.length;) {
			v[i] = rd.nextInt(10);
			status = false;
			for (int j = 0; j < i; j++) {
				if(v[i] == v[j]) {
					status = true;
					break;
				}
			}
			if(!status) {
				System.out.print(v[i] + " ");
				i++;
			}
		}
		
	}

}