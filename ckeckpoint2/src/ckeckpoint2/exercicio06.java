package ckeckpoint2;

import java.util.Scanner;

public class exercicio06 {
	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		
		int x;
		
		System.out.println();
		x = in.nextInt();
		
		if(x >= 7) 
			System.out.println("comando 1"); 		//a) x >= 7
		else { 
			if(x <= 8) 								//b) x > 8 (o if (comando2) será ignorado e vai voltar para o else)
				System.out.println("comando 2");	
				System.out.println("comando 3"); 	//c) Impossível!
		} 	
		System.out.println("comando 4");
		
		
		in.close();
	}

}