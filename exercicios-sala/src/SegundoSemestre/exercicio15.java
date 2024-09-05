package SegundoSemestre;

import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;

public class exercicio15 {
	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		Random rd = new Random();
		
		String[] categoria = {"Eletronicos", "Produtos", "Roupas"};
		String[] mes = {"Jan", "Fev", "Mar"};
		int[][] venda = new int[categoria.length][mes.length];
		int total;
		
		for(int i = 0; i < venda.length; i++) {
			for(int j = 0; j < venda[i].length; j++) {
				venda[i][j] = rd.nextInt(20);
				System.out.print(venda[i][j] + "\t");
			}
			System.out.println();
		}
		
		for(int i = 0; i < venda.length; i++) {
			total = 0;
			for(int j = 0; j < venda[i].length; j++) {
				total += venda[i][j];
			}
			System.out.println("Categoria: " + categoria[i]);
			System.out.println("Total: " + total);
		}
		in.close();
	}

}
