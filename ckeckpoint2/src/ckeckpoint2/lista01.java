package ckeckpoint2;

import java.util.Scanner;

public class lista01 {
	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		
		int a = 6, b = 3, c = 2, v1, v2;
		
		v1 = a + b / c;
		v2 = c / a + 4;
		
		boolean result = v1 < v2;
		
		System.out.println("O resultado da expressão é: " + result);
		
		
		in.close();
	}

}