package ckeckpoint2;

import java.util.Scanner;

public class exercicio12 {
	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		
		String vogal = "";
		
		System.out.println("Digite uma vogal: ");
		vogal = in.next();
		
		if (vogal.equalsIgnoreCase("a") || vogal.equalsIgnoreCase("e") || vogal.equalsIgnoreCase("i") || vogal.equalsIgnoreCase("o") || vogal.equalsIgnoreCase("u")) {
			System.out.println("Você digitou uma vogal");
		}else {
			System.out.println("Você não digitou uma vogal");
		}
		
		in.close();
	}

}
