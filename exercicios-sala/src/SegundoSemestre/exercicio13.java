package SegundoSemestre;

import java.text.DecimalFormat;
import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;

public class exercicio13 {
	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		
		Random rd = new Random();
		DecimalFormat mascara = new DecimalFormat("#,##0,00");
		double [][] temperatura = new double [4][6];
		double media = 0;
		double [] medianual = new double [temperatura.length];
		
		for (int i = 0; i < temperatura.length; i++) {
			for (int j = 0; j < temperatura.length; j++) {
				temperatura[i][j] = rd.nextDouble(5,36);
				System.out.print(mascara.format(temperatura[i][j]) + "\t");
				media += temperatura[i][j];
			}
			System.out.println();
		}
		
//		medianual[j] = media/temperatura[i].length;
//		System.out.println();
		
		for (int i = 0; i < medianual.length; i++) {
			for (int j = 0; j < medianual.length; j++) {
				System.out.println("Média Anual: " + medianual[i]);
			}
		}
		
		
		
		
	}

}
