package checkpoint1;
import java.util.Scanner;
public class exercicio14{
	public static void main (String [] args) {
		Scanner input = new Scanner(System.in);
		
		double raio, altura, volume;
		
		System.out.println("Digite o valor do raio: ");
		raio = input.nextDouble();
		System.out.println("Digite o valor da altura: ");
		altura = input.nextDouble();
		
		volume = Math.PI * Math.pow(raio, 2) * altura;
		
		System.out.println("O volume é: " + String.format("%.2f" , volume));
		
		input.close();
	}
}