package estudoCheck;

import java.util.Random;

public class ex03 {
	public static void main(String[] args) {
		
		int anos = 10;
		int meses = 12;
		
		int [][] m = new int [anos][meses];
		Random rd = new Random();
		
		String[] nomeMeses = {"Jan", "Fev", "Mar", "Abr", "Mai", "Jun", "Jul", "Ago", "Set", "Out", "Nov", "Dez"};
		
		System.out.println("Temperaturas: ");
		for (int i = 0; i < anos; i++) {
			for (int j = 0; j < meses; j++) {
				m[i][j] = rd.nextInt(0, 35);
			}
		}
		
		double mediasAnuais [] = new double [anos];
		for (int i = 0; i < anos; i++) {
			double soma = 0;
			for (int j = 0; j < meses; j++) {
				soma += m[i][j];
			}
			mediasAnuais[i] = soma / meses;
		}
		
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
            System.out.println(" = " + String.format("%.2f", mediasAnuais[i]));
        }
		
		double maior = Integer.MIN_VALUE;	
		double menor = Integer.MAX_VALUE;	
		int anoMaior = 0;
		int anoMenor = 0;
		for (int i = 0; i < mediasAnuais.length; i++) {
			if(maior < mediasAnuais[i]) {
				maior = mediasAnuais[i];
				anoMaior = i;
			}
			if(menor > mediasAnuais[i]) {
				menor = mediasAnuais[i];
				anoMenor = i;
			}
		}
		
		System.out.println("\nA maior media foi no ano " + (anoMaior + 1) + ", sendo ela: " + String.format("%.2f", maior));
		System.out.println("A menor media foi no ano " + (anoMenor + 1) + ", sendo ela: " + String.format("%.2f", menor));
	}

}
