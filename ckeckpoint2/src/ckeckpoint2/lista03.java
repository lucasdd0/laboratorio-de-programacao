package ckeckpoint2;

import java.util.Scanner;

public class lista03 {
	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		
		int a = 2, b = 7;
		double c = 3.5;
		boolean d = false, e = true;
		
		boolean result = (b == a * c) && (d || b != c);
		
		System.out.println("O resultado da expressão é: " + result);
		
		in.close();
	}

}