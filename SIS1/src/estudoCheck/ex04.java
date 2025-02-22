package estudoCheck;

import java.util.Random;

public class ex04 {
	
	static int[] vetor = new int[10];
	
	public static void main(String[] args) {
		preenchendoVetor();
		System.out.println("Vetor antes: ");
		imprimirVetor();
		inverterVetor();
		System.out.println("\nVetor depois: ");
		imprimirVetor();
	}
	
	public static void preenchendoVetor() {
		Random rd = new Random();
		
		for (int i = 0; i < vetor.length; i++) {
			vetor[i] = rd.nextInt(100);
		}
	}
	
	public static void imprimirVetor() {
		for (int i = 0; i < vetor.length; i++) {
			System.out.print(vetor[i] + "\t");
		}
	}
	
	public static void inverterVetor() {
		for (int i = 0; i < vetor.length/2; i++) {
			int aux = vetor[i];
			vetor[i] = vetor[vetor.length - 1 - i];
			vetor[vetor.length - 1 - i] = aux;
		}
	}

}
