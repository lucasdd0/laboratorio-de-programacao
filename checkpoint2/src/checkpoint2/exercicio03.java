package checkpoint2;

import java.util.Scanner;

public class exercicio03 {
	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		
		double totaldecompra, desconto;
		
		System.out.print("Digite o valor total das suas compras: R$");
		totaldecompra = in.nextDouble();
		
		if (totaldecompra > 1000) {
			desconto = totaldecompra * 0.85;
		}else {
			desconto = totaldecompra * 0.92;
		}
		
		System.out.print("O valor que deve pagar é de R$" + String.format("%.2f", desconto) + " e economizou R$" + String.format("%.2f",(totaldecompra-desconto)));
		
		in.close();
	}

}
