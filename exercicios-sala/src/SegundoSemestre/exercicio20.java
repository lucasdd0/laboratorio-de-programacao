package SegundoSemestre;

import java.util.Random;
import java.util.Scanner;

public class exercicio20 {
	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		
		int[] v = new int [10];
		
		preencher(v);
		System.out.println("Antes de inverter");
		imprimir(v);
		inverter(v);
		System.out.println("Depois de inverter");
		imprimir(v);
		
		in.close();
	}
	
	public static void preencher(int[] v) {
		Random rd = new Random();
		for (int i = 0; i < v.length; i++) {
			v[i] = rd.nextInt(1, 15);
		}
		
	}
	
	public static void inverter(int[] v) {
		for (int i = 0; i < v.length/2; i++) {
			int aux = v[i];
			v[i] = v[v.length - 1 - i];
			v[v.length - 1 - i] = aux;
		}
	}
	
	public static void imprimir(int[] v) {
		for(int i : v) {
			System.out.print(i + "\t");
		}
		System.out.println();
	}
	
}


