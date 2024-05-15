package ckeckpoint2;

import java.util.Scanner;

public class lista08 {
	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		
		double dias, valor;
		
		System.out.println("Digite quantos dias deseja hospedar: ");
		dias = in.nextInt();
		
		if (dias > 15) {
			valor = dias*15.5;
		}
		else if (dias == 15){
			valor = dias*36;
		}
		else {
			valor = dias*58;
		}
		valor = dias*250;
		
		System.out.println(valor);
		
		in.close();
	}

}
