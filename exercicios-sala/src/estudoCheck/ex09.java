package estudoCheck;

import java.util.Scanner;

public class ex09 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("DNA saudável: ");
		String DNASaudavel = sc.next();
		System.out.println("DNA contaminado: ");
		String DNAContaminado = sc.next();
		
		char[] nucleotidiosSaudavel = DNASaudavel.toCharArray();
		char[] nucleotidiosContaminado = DNAContaminado.toCharArray();
		
		if(DNASaudavel != DNAContaminado) {
			int cont = 0;
			for (int i = 0; i < nucleotidiosContaminado.length; i++) {
				if(nucleotidiosSaudavel[i] != nucleotidiosContaminado[i])
				System.out.print(nucleotidiosContaminado[i]);
				cont++;
			}
			System.out.println("\nTotal de nucelotidios: " + cont);
		}
		
	}

}
