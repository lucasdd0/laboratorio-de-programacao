package exercicios;
import java.util.Scanner;
public class exercicio16{
	public static void main (String [] args) {
		Scanner input = new Scanner(System.in);
		
		int a, b;
		
		System.out.println("Digite o valeo de a: ");
		a = input.nextInt();
		System.out.println("Digite o valor de b: ");
		b = input.nextInt();
		
		a = a + b;
		b = a - b;
		a = a - b;

		
		System.out.println("Valor final de a: " + a);
		System.out.println("Valor final de b: " + b);
		
		
		input.close();
	}
}