package ckeckpoint2;

import java.util.Scanner;

public class exercicio02 {
	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
		double prova1, prova2, trabalho1, trabalho2, trabalho3, mediaprova, mediatrabalho, mediafinal;
		double tolerancia = 0.1;
		
		System.out.println("Digite o valor da prova 1: ");
		prova1 = input.nextDouble();
		System.out.println("Digite o valor da prova 2: ");
		prova2 = input.nextDouble();
		
		System.out.println("Digite o valor do trabalho 1: ");
		trabalho1 = input.nextDouble();
		System.out.println("Digite o valor do trabalho 2: ");
		trabalho2 = input.nextDouble();
		System.out.println("Digite o valor do trabalho 3: ");
		trabalho3 = input.nextDouble();
		
		mediaprova = (prova1 + prova2) / 2;
		mediatrabalho = (trabalho1 + trabalho2 + trabalho3) / 3;
		
		mediafinal = (mediaprova * 0.70) + (mediatrabalho * 0.30);
		
		if(mediafinal >= 6 - tolerancia){		//ou seja: 6 - 0.1 = 5.9 (vai ser considerado esse novo valor)
			System.out.println("Sua nota é " + String.format("%.1f", mediafinal) + " e você foi aprovado!");
		}else {
			System.err.println("Sua nota é " + String.format("%.1f", mediafinal) + " e você foi reprovado!");
		}
		
		input.close();
	}

}