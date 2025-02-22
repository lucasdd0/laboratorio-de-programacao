package estudoCheck;

import java.util.Scanner;

public class ex01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int numero;
		
		System.out.println("Digite um número: ");
		numero = sc.nextInt();
		
		int[] divisores = encotrarDivisores(numero);
		imprimir(numero, divisores);
		
		sc.close();
		
	}
	
	public static int[] encotrarDivisores(int numero) {
		
		int contador = 0;
		
		for (int i = -Math.abs(numero); i <= Math.abs(numero); i++) {
			if(i != 0 && numero % i == 0) {
				contador++;
			}
		}
		
		int[] divisores = new int [contador];
		int index = 0;
		
		for (int i = -Math.abs(numero); i <= Math.abs(numero); i++) {
			if(i != 0 && numero % i == 0) {
				divisores[index++] = i;
			}
		}
		
		return divisores;
	}
	
	public static void imprimir(int numero, int[] divisores) {
		System.out.println("Os divisores do numero " + numero + "são: ");
		for(int divisor : divisores) {
			System.out.print(divisor + "\t");
		}
	}

}
