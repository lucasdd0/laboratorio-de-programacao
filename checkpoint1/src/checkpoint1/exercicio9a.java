package checkpoint1;
import java.util.Scanner;
public class exercicio9a{
	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
		int x, y;
		
		System.out.println("Digite o valor de x: ");
		x = input.nextInt();
		System.out.println("Digite o valor de y: ");
		y = input.nextInt();
		
		y = (int) (Math.pow(2 * Math.sqrt(x + y * Math.pow(Math.pow(x, 3)/2 , 1.0/25.0)) , 1.0/13.0));
		
		System.out.println("Seu resultado é: " + y);
		
	}
}