package ckeckpoint2;

import java.util.Scanner;
import java.text.Normalizer;

public class exercicio11 {
	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		
		String cargo = "";
		int tempo;
		double salario;
		
		System.out.println("Digite seu cargo: ");
		cargo = in.next();
		String cargoNormalizado = Normalizer.normalize(cargo, Normalizer.Form.NFD).replaceAll("[\\p{InCombiningDiacriticalMarks}]", "");
		
		System.out.println("Digite seu tempo de serviço em anos: ");
		tempo = in.nextInt();
		System.out.println("Digite seu salario: ");
		salario = in.nextDouble();
		
		if (cargo.equalsIgnoreCase("gerente"))
		{
			if (tempo >= 5){
				salario *= 1.1;
			}
			else if (tempo >= 3 && tempo <5) {
				salario *= 1.09;
			}
			else {
				salario *= 1.08;
			}
		System.out.println("Seu novo salário é: " + salario);
		}
		
		if (cargo.equalsIgnoreCase("engenheiro"))
		{
			if (tempo >= 5){
				salario *= 1.11;
			}
			else if (tempo >= 3 && tempo <5) {
				salario *= 1.1;
			}
			else {
				salario *= 1.09;
			}
		System.out.println("Seu novo salário é: " + salario);
		}
		
		if ((cargoNormalizado.equalsIgnoreCase("tecnico")))
		{
			if (tempo >= 5){
				salario *= 1.12;
			}
			else if (tempo >= 3 && tempo <5) {
				salario *= 1.11;
			}
			else {
				salario *= 1.10;
			}
		System.out.println("Seu novo salário é: " + salario);
		}
		
		in.close();

	}
}