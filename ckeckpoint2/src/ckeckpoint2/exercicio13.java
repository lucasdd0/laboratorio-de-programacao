package ckeckpoint2;

import java.util.Scanner;

public class exercicio13 {
	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		
		String vogal = "";
		
		System.out.println("Digite uma vogla: ");
		vogal = in.next();
		vogal = vogal.toLowerCase();
		
		switch (vogal) {
		case "a":
		case "e":
		case "i":
		case "o":
		case "u":
			System.out.println("Você digitou uma vogal");
			break;
			default:
			System.out.println("Você não digitou uma vogal");
		}
		
		
		in.close();
	}

}