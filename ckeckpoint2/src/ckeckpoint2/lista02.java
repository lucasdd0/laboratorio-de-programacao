package ckeckpoint2;

import java.util.Scanner;

public class lista02 {
	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		
		int a = 6, b = 3, c = 2, v1, v2;
		
		v1 = (b % c) + 3;
		v2 = (b % a) + (c % b);
		
		boolean result = v1 >= v2;
		
		System.out.println("O resultado da expressão é: " + result);
		
		
		in.close();
	}

}
