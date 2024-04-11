package checkpoint1;
import java.util.Scanner;
public class exercicio8a{
	public static void main (String [] args) {
		Scanner input = new Scanner (System.in);
		
		int x, y, a, b;
		
		System.out.println("Informe o valor de x: ");
		x = input.nextInt();
		System.out.println("Informe o valor de a: ");
		a = input.nextInt();
		System.out.println("Informe o valor de b: ");
		b = input.nextInt();
		
		y = (int) ((2 + a)/(b - 3) - 2 * x + Math.pow(x, 3));		//sempre que usar Math... colocar o int () apenmas na expressão ou nela toda pois Math retrona um valor double		
		System.out.println("O resultado é: " + y);
	
	}
}
	