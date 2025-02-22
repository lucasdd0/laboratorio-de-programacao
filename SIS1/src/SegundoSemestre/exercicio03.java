package SegundoSemestre;

import java.util.Scanner;

public class exercicio03 {
	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		
		double media = 0;
		String [] mes = {"janeiro", "fevereiro", "março", "abril", "maio", "junho", "julho", "agosto", "setembro", "outubro", "novembro" , "dezembro"};
		
		double [] temperatura = new double [12];
		
		for (int i = 0; i < temperatura.length; i++) {
			System.out.println("Digite a temperatura do mês de " + mes[i] +": ");
			temperatura[i] = in.nextDouble();
			
			media += temperatura[i];	
		}
		
		media /= temperatura.length;
		System.out.println("Média anual = " + media);
		
		for(int i = 0; i < temperatura.length; i++) {
			if(temperatura[i] > media) {
				System.out.println(temperatura[i] + " -----> " + mes[i]);
			}
		}
	}

}
