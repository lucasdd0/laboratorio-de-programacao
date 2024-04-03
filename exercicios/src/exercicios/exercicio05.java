package exercicios;
import java.util.Scanner;
public class exercicio05 {
	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
		double x, resultado;
		
		System.out.println("Digite o valor do x: ");
		x = input.nextDouble();
		
		resultado = Math.sqrt(Math.cbrt(x - 0.5));
		
		
		System.out.println(String.format("%.2f",resultado));
		input.close();
	}
}
