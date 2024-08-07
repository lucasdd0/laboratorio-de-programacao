package PrimieroSemestre;
import java.util.Scanner;
public class exercicio06 {
	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
		int numero, dezena;
		double divisao;
		
		System.out.println("Digite um núemro de 3 digitos: ");
		numero = input.nextInt();
		
		divisao = numero /10;
		dezena = numero % 10;
		
		System.out.println("O resultado da divisão é " + divisao + " digito das dezenas é " + dezena);
		
		input.close();
	}

}

