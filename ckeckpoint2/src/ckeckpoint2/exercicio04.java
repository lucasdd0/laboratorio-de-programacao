package ckeckpoint2;

import java.util.Scanner;

public class exercicio04 {
	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		
		double x , y, denominador;
		
		System.out.println("Digite o valor de x: ");
		x = in.nextDouble();
		
		denominador = Math.pow(x, 2) - 25;
		
		if (denominador <= 0) {
			System.err.println("Digite um valor válido!");
		}else {
			y = 8/Math.sqrt(denominador);
			System.out.println("O resultado de y é: " + String.format("%.2f", y));
		}
		
		
		in.close();
	}

}