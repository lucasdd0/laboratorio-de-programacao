package estudoCheck;

import java.util.Scanner;

public class ex05 {
	public static void main(String[] args) {
		
		String [] lista = new String [5];
		
		lerPalavra(lista);
		localizarPar(lista);
		
	}
	
	public static void lerPalavra(String [] lista) {
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < lista.length; i++) {
			System.out.println("Digite a " + (i + 1) + "ª palavra: ");
			lista[i] = sc.next();
		}
		
	}
	
	public static void localizarPar(String [] lista) {
		String invertida;
		for (String palavra : lista) {
			invertida = inverter(palavra);
		}
	}
	
	public static String inverter(String palavra) {
		
		char[] letra = palavra.toCharArray();
		
		for(int i = 0; i < letra.length /2; i++) {
			char aux = letra[i];
			letra[i] = letra[letra.length - i - 1];
			letra[letra.length - i - 1] = aux;
		}
		
		String aux = new String(letra);
		System.out.println(aux);
		return aux;
		
	}
	

}
