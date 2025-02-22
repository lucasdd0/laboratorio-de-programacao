package SegundoSemestre;

import java.util.Iterator;
import java.util.Scanner;

public class exercicio08 {
	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		
		System.out.println("Digite o total de funcionários: ");
		int rep = in.nextInt();
		
		double totalsalario = 0, mediasalarial = 0;
		
		String [] nome = new String [rep];
		
		double [] salario = new double [rep];
		
		for (int i = 0; i < rep; i++) {
			System.out.println("Digite o seu nome: ");
			nome[i] = in.next();
			System.out.println("Digite seu salário: ");
			salario[i] = in.nextDouble();
			
			totalsalario =+ salario[i];
			mediasalarial = totalsalario / rep;
		}
		
		System.out.println(totalsalario);
		System.out.println(mediasalarial);
		
		


		
		
	}

}
