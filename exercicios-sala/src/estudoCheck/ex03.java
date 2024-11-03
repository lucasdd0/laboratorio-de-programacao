package estudoCheck;

import java.util.Random;

public class ex03 {
	public static void main(String[] args) {
		
		int anos = 10;
		int meses = 12;
		
		int [][] m = new int [anos][meses];
		Random rd = new Random();
		
		String [] nomeMeses = {"Jan", "Fev", "Mar", "Abr", "Mai", "Jun", "Jul", "Ago", "Set", "Out", "Nov", "Dez"};
		
		for (int i = 0; i < anos; i++) {
			for (int j = 0; j < meses; j++) {
				m[i][j] = rd.nextInt(0, 35);
			}
		}
		
		double [] mediaMeses = new double [anos];
		for (int i = 0; i < anos; i++) {
			double soma = 0;
			for (int j = 0; j < meses; j++) {
				soma += m[i][j];
			}
			mediaMeses[i] = soma/meses;
		}
		
		System.out.println("Temperaturas: ");
		
		System.out.print("\t\t");
		for (int mes = 0; mes < meses; mes++) {
			System.out.print(nomeMeses[mes] + "\t");
		}
		System.out.println();

		
		for (int i = 0; i < anos; i++) {
			System.out.print("Ano " + (i + 2020) + "\t");
			for (int j = 0; j < meses; j++) {
				System.out.print(m[i][j] + "\t");
			}
			System.out.println("= " + String.format("%.2f", mediaMeses[i]));
		}
		
		double maior = Integer.MIN_VALUE;
		double menor = Integer.MAX_VALUE;
		int anoMaior = 0;
		int anoMenor = 0;
		for (int i = 0; i < mediaMeses.length; i++) {
			if(maior < mediaMeses[i]) {
				maior = mediaMeses[i];
				anoMaior = i;
			}
			if(menor > mediaMeses[i]) {
				menor = mediaMeses[i];
				anoMenor = i;
			}
		}
		
		System.out.println("\nA maior media encotrada foi no ano " + anoMaior + ", sendo ela: " + String.format("%.2f", maior));
		System.out.println("A menor media encotrada foi no ano " + anoMenor + ", sendo ela: " + String.format("%.2f", menor));
		
		
	}

}
