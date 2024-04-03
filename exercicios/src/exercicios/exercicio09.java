package exercicios;
import java.util.Scanner;
public class exercicio09 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		double l1, l2, l3;
		
		System.out.println("Digite o valor de um lado: ");
		l1 = input.nextDouble();
		System.out.println("Digite o valor de um lado: ");
		l2 = input.nextDouble();
		System.out.println("Digite o valor de um lado: ");
		l3 = input.nextDouble();
		
		if (l1<l2+l3 && l2<l1+l3 && l3<l2+l1)
		{
			System.out.println("Os lados do seu triangulo são " + l1 + ", " + l2 + " e " + l3 + "e formam um triângulo!");
			
			if (l1 == l2 && l2 == l3)
			{
				System.out.println("Esse triângulo é equilátero!");
			}
			else
			{
				if (l1 == l2 || l2 == l3 || l3 == l1)
				{
					System.out.println("Esse triângulo é isósceles");
				}
				else
				{
					System.out.println("Esse triângulo é escaleno");
				}
			}
		}else
		{
			System.err.println("Não forma um triângulo!");
		}
		
		//clicar em RUN depois em DEBUG AS
		
		input.close();
	}

}
