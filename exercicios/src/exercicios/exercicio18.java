package exercicios;
import java.util.Scanner;
public class exercicio18{
	public static void main (String [] args) {
		Scanner input = new Scanner(System.in);
		
		double real, dolar, cotacao;
		
		System.out.println("Informe o valor de cotação de dólar: ");
		cotacao = input.nextDouble();
		System.out.println("Informe a quantidade de dólares que deseja converter: ");
		dolar = input.nextDouble();
		
		real = dolar * cotacao;
		
		System.out.println("Você tem R$ " + String.format("%.2f", real));
		
		input.close();
	}
}