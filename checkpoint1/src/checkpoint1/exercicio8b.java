package checkpoint1;
import java.util.Scanner;
public class exercicio8b{
	public static void main (String [] args) {
		Scanner input = new Scanner (System.in);
		
		int x, a, b, c, d;
		
		System.out.println("Digite o valor de a: ");
		a = input.nextInt();
		System.out.println("Digite o valor de b: ");
		b = input.nextInt();
		System.out.println("Digite o valor de c: ");
		c = input.nextInt();
		System.out.println("Digite o valor de d: ");
		d = input.nextInt();
		
		x = (b/(a + c) + 4 * a)/((d - 2 * a) / (3 + c));
		
		System.out.println("O resultado é: " + x);
		
	}
}