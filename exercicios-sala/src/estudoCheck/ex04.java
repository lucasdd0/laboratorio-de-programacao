package estudoCheck;

import java.util.Random;

public class ex04 {
	public static void main(String[] args) {
		
		int meses = 6;
		int produtos = 3;
		
		String [] categoriaProdutos = {"Eletrônicos", "Vestimentas", "Alimentos"};
		
		int [][] vendas = new int [produtos][meses];
		Random rd = new Random ();
		
		for (int i = 0; i < produtos; i++) {
			for (int j = 0; j < meses; j++) {
				vendas[i][j] = rd.nextInt(0, 20);
			}
		}
		
		System.out.print("\t\t");
		for (int i = 0; i < meses; i++) {
			System.out.print("Mês " + (i + 2010) + "\t");
		}
		System.out.println();
		
		for (int i = 0; i < produtos; i++) {
			for (int j = 0; j < meses; j++) {
				
			}
		}
		
		for (int i = 0; i < produtos; i++) {
			System.out.print(categoriaProdutos[i] + "\t");
			int soma = 0;
			for (int j = 0; j < meses; j++) {
				System.out.print(vendas[i][j] + "\t\t");
				soma += vendas[i][j];
			}
			System.out.println("= " + soma);
		}
		
		
	}

}
