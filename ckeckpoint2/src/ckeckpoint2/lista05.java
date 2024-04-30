package ckeckpoint2;

import java.util.Scanner;

public class lista05 {
	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		
		int a = 2, b = 7;
		double c = 3.5;
		boolean d = false, e = true, result1, result2, resultfinal;
		
		result1 = (b / c) == c;
		result2 = (b / a) != c;
		
		resultfinal = result1 || result2;
		
		
		System.out.println("O resultado da expressão é: " + resultfinal);
		
		in.close();
	}

}