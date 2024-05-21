package checkpoint2;

import java.util.Scanner;

public class exercicio07 {
	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		
		double diarias, valor;
		
		System.out.println("Digite o total de dias: ");
		diarias = in.nextDouble();
		
		if (diarias > 15) {
			valor = diarias * 15.50;
		}
		else if (diarias == 15) {
			valor = diarias * 36;
		}
		else {
			valor = diarias * 58;
		}
		
		valor += diarias * 250;
		
		System.out.println("Você deve pagar: " + valor);
		
		in.close();
	}

}
