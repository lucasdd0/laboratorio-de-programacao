package checkpoint1;
import java.util.Scanner;
public class exercicio19{
	public static void main (String [] args) {
		Scanner input = new Scanner(System.in);
		
		int a, b, c, total;
		
		System.out.println("Digite o valor a: ");
		a = input.nextInt();
		System.out.println("Digite o valor b: ");
		b = input.nextInt();
		System.out.println("Digite o valor c: ");
		c = input.nextInt();
		
		total = (int) (Math.pow(a, 2) + Math.pow(b, 2) + Math.pow(c, 2));
		
		System.out.println("Resultado: " + total);
		
		
		input.close();
	}
}