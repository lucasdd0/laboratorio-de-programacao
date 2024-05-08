package exercicios;

import java.util.Scanner;

public class exercicio24 {
	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		
		int valor, cont = 1, fat = 1;
		
		System.out.println("Informe um valor inteiro e positivo: ");
		valor = in.nextInt();
		
		if(valor < 0) {
			System.out.println("O valor deve ser inteiro e positivo");
		}else {
			while(cont <= valor) {
				fat *= cont;
				cont += 1;
			}
			System.out.println(fat);
		}
		
		in.close();
	}

}
