package ckeckpoint2;

import java.util.Scanner;

public class exercicio05 {
	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		
		int lado1, lado2, lado3;
		
		System.out.println("Digite tamanho do lado 1 :");
		lado1 = in.nextInt();
		System.out.println("Digite tamanho do lado 2 :");
		lado2 = in.nextInt();
		System.out.println("Digite tamanho do lado 3 :");
		lado3 = in.nextInt();
		
		if (lado1 < lado2 + lado3 && lado2 < lado1 + lado3 && lado3 < lado1 + lado2)
		{
			if (lado1 == lado2 && lado2 == lado3 && lado1 == lado3) {
				System.out.println("É um triângulo equilátero");
			}
			else if (lado1 == lado2 || lado2 == lado3 || lado3 == lado1) {
				System.out.println("É um triângulo isóceles");
			}
			else {
				System.out.println("É um triangulo escaleno");
			}
		}else {
			System.out.println("Não é um triângulo!");
		}
		
		
		in.close();
	}

}