package estudoCheck;

import java.util.Scanner;

public class ex03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quantos valores deseja inserir: ");
		int tamanho = sc.nextInt();
		
		int[] valor = new int[tamanho];
		
		System.out.println("Digite os valores: ");
		for (int i = 0; i < valor.length; i++) {
			valor[i] = sc.nextInt();
		}
		
		int maiorValor = determinaMaior(valor);
		
		System.out.println("O maior valor é: " + maiorValor);
		
		sc.close();
	}
	
	public static int determinaMaior(int[] valor) {
		int maior = valor[0];
		
		for (int i = 1; i < valor.length; i++) {
			maior = Math.max(maior, valor[i]);
		}
		
		return maior;
	}

}
