package ckeckpoint2;

import java.util.Scanner;

public class exercicio01 {
	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
		int x;
		
		System.out.println();
		x = input.nextInt();
		
		if(x >= 7)
		{
			System.out.println("comando 1");
		}
		if(x <= 8)
		{
			System.out.println("comando 2");
		}
		
		input.close();
	}

}