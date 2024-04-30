package ckeckpoint2;

import java.util.Scanner;

public class exercicio08 {
	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		
		double a, b, c, delta, x1, x2;
		
		System.out.println("Digite o valo de a: ");
		a = in.nextDouble();
		System.out.println("Digite o valo de b: ");
		b = in.nextDouble();
		System.out.println("Digite o valo de c: ");
		c = in.nextDouble();
		
		delta = Math.pow(b, 2) - (4 * a * c);
		
		if (delta < 0) {
			System.err.println("Não existe raízes pois delta é negativo!");
		} else if (delta == 0){
			x1 = -b / (2*a);
			System.out.println("Existe uma única raíz real: " + x1);
		}
		else {
		x1 = (-b + Math.sqrt(delta)) / (2*a);
		x2 = (-b - Math.sqrt(delta)) / (2*a);
		System.out.println("Raiz x1 = " + x1);
		System.out.println("Raiz x2 = " + x2);
		}
		
		in.close();
	}

}
