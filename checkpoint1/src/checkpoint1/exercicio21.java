package checkpoint1;
import java.util.Scanner;
public class exercicio21{
	public static void main (String [] args) {
		Scanner input = new Scanner(System.in);
		
		double salariomensal, reajuste, novosalario;
		
		System.out.println("Digite o valor do seu salário mensal: ");
		salariomensal = input.nextDouble();
		System.out.println("Digite o valor do percentual de reajuste a ser atribuído: ");
		reajuste= input.nextDouble();
		
		novosalario = salariomensal + salariomensal * reajuste/100;
		
		System.out.println("Seu novo salário é de R$ " + String.format("%.2f", novosalario));
		
		
		input.close();
	}
}