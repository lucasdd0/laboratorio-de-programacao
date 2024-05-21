package checkpoint3;

import java.util.Scanner;

public class exercicio08 {
	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		
		int numerodependentes;
		double renda, novarenda, IR;
		String cpf;
		
		System.out.println("Digite seu CPF: ");
		cpf = in.next();
		
		System.out.println("Digite o número dos seus dependentes: ");
		numerodependentes = in.nextInt();
		
		System.out.println("Digite sua renda: ");
		renda = in.nextInt();
		
		novarenda = renda - renda * (numerodependentes * 0.05);
		
		int salariominimo = 1500;
		
		if (novarenda < salariominimo * 2) {
			IR = 0;
		} else if(novarenda >= salariominimo * 2 && novarenda <= salariominimo * 3) {
			IR = novarenda * 0.05;
		} else if (novarenda >= salariominimo * 3 && novarenda <= salariominimo * 5) {
			IR = novarenda * 0.1;
		} else if (novarenda >= salariominimo * 5 && novarenda <= salariominimo * 7) {
			IR = novarenda * 0.15;
		} else {
			IR = novarenda * 0.2;
		}
		
		System.out.println("Seu imposto de renda é: " + IR);
		
		
		
		
		in.close();
	}

}
