package ckeckpoint2;

import java.util.Scanner;

public class lista07 {
	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		
		int a = 2, b = 7;
		double c = 3.5;
		boolean d = false, e = true, resultado1, resultado2, resultadofinal;
		
		resultado1 = b/a >= c;
		resultado2 = !(a <= c);
		
		resultadofinal = d && resultado1 || resultado2;
		
		System.out.println("O resultado é: " + resultadofinal);
		
		in.close();
	}

}
