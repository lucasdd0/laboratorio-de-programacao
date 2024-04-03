package exercicios;
import java.util.Scanner;
public class exercicio10 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int diarias, valor = 0, valorfixo = 250;
		
		System.out.println("Digite o total de diárias: ");
		diarias = input.nextInt();
		
		if (diarias < 15)
		{
			valor = valorfixo + 15;
		}
		if (diarias == 15)
		{
			valor = valorfixo + 36;
		}
		if (diarias > 15)
		{
			valor = valorfixo + 58;
		}
		
		System.out.println("O valor que você deve pagar é: " + valor);
		
		
		
		
		input.close();
	}
}