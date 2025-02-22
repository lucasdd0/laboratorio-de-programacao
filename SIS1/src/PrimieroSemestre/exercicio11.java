package PrimieroSemestre;
import java.util.Scanner;
public class exercicio11 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		double a, b, c, delta, x1, x2;
		
		System.out.println("Digite o valor de a: ");
		a = input.nextDouble();
		System.out.println("Digite o valor de a: ");
		b = input.nextDouble();
		System.out.println("Digite o valor de a: ");
		c = input.nextDouble();
		
		delta = Math.pow(b, 2) - 4*a*c;
		
		if (delta < 0)
		{
			System.err.println("Essa equação não possui raízes!");
		}
		else
		{
			x1 = -b + Math.sqrt(delta);
			x2 = +b + Math.sqrt(delta);
			System.out.println("As raízes são " + x1 + " e " + x2);
		}
		
		
		input.close();
	}
}
