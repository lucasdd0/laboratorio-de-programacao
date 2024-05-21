package checkpoint3;

import java.util.Scanner;

public class exercicio11 {
	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		
		int i, n, pagamento;
		double valor, total = 0;
		boolean valido = false;
		
		System.out.println("Digite quantas compras foram feitas: ");
		n = in.nextInt();
		
		for (i = 1; i <= n; i++) {
			System.out.println("Digite o valor da compra: ");
			valor = in.nextDouble();
			total += valor;
		}
		
		while (!valido) {
			System.out.println("Forma de pagamento:\nÀ vista (digite 1)\nEm duas vezes (digite 2)");
			pagamento = in.nextInt();
			
			if(pagamento == 1) {
				total -= total * 0.1;
				valido = true;
			}else if (pagamento == 2) {
				total += total * 0.155;
				valido = true;
			}else {
				System.err.println("Digite 1 ou 2!");
			}
		}
		
		System.out.println("O valor a ser pago é: " + total);
		
		
		in.close();
	}

}