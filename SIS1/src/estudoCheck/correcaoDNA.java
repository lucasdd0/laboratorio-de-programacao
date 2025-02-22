package estudoCheck;

import java.util.Scanner;

public class correcaoDNA {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String saudavel, infectado;
		
		System.out.println("Digite o DNA saudável: ");
		saudavel = sc.next();
		System.out.println("Digite o DNA infectado: ");
		infectado = sc.next();
		
		System.out.println("Total de infectados: " + calcular(saudavel, infectado));
		
		sc.close();
		
	}

	private static int calcular(String saudavel, String infectado) {
		int total = 0, s = 0, i = 0;
		
		StringBuilder parteInfec = new StringBuilder();
		
		if(!saudavel.equals(infectado)) {
			while(s < saudavel.length()) {
				if(saudavel.charAt(s) != infectado.charAt(i)) {
					total++;
					parteInfec.append(infectado.charAt(i));
				}else {
					s++;
				}
				i++;
			}
			System.out.println("Parte infectada: " + parteInfec.toString());
		}
		
		return total;
	}

}
