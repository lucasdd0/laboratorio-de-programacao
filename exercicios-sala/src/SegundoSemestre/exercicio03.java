package SegundoSemestre;

import java.util.Scanner;

public class exercicio03 {
	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		
		double media = 0, total = 0;
		
		double [] temperatura = new double [12];
		
		for (int i = 0; i < temperatura.length; i++) {
			System.out.println("Digite a temperatura do " + (i + 1) + "° mês: ");
			temperatura[i] = in.nextDouble();
			
			media += temperatura[i];	
		}
		
		media /= temperatura.length;
		System.out.println("Média anual = " + media);
	}

}
