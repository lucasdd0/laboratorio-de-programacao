package estudoCheck;

import java.util.Scanner;

public class ex02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] lados = new int[3];
		
		System.out.println("Digite os valores do triangulo: ");
		for (int i = 0; i < lados.length; i++) {
			lados[i] = sc.nextInt();
		}
		
		boolean triangulo = verificarTriangulo(lados);
		
		classificarTriangulo(lados, triangulo);
		
		sc.close();
		
	}
	
	public static boolean verificarTriangulo(int[] lados) {
	    return (lados[0] + lados[1] > lados[2]) &&
	           (lados[0] + lados[2] > lados[1]) &&
	           (lados[1] + lados[2] > lados[0]);
	}
	
	public static void classificarTriangulo(int[] lados, boolean triangulo) {
		
		if(triangulo) {
			if (lados[0] == lados[1] && lados[1] == lados[2]) {
				System.out.println("O triângulo é equilátero.");
			} else if (lados[0] == lados[1] || lados[0] == lados[2] || lados[1] == lados[2]) {
				System.out.println("O triângulo é isósceles.");
			} else {
				System.out.println("O triângulo é escaleno.");
			}
		}else {
			System.out.println("Não é um triângulo");
		}
		
	}
	

}
