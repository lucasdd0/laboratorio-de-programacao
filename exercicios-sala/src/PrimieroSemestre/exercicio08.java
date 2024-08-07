package PrimieroSemestre;
import java.util.Scanner;
public class exercicio08 {
	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
		int bits, bit1, bit2, bit3, bit4, resultado1, resultado2, resultado3, resultado4, resultadofinal;
		
		
		System.out.println("Insira um número binário de 4 bits: ");
		bits = input.nextInt();
		
		bit1 = bits /1000;
		bit2 = (bits % 1000)/100;
		bit3 = (bits % 100)/10;
		bit4 = bits % 10;
		
		if (bit1 == 1 || bit1 ==0)
		{
			if (bit2 == 1 || bit2 ==0)
			{
				if (bit3 == 1 || bit3 ==0)
				{
					if (bit4 == 1 || bit4 ==0)
					{
						resultado1 = (int)(bit1 * Math.pow(2, 3));
						resultado2 = (int)(bit2 * Math.pow(2, 2));
						resultado3 = (int)(bit3 * Math.pow(2, 1));
						resultado4 = (int)(bit4 * Math.pow(2, 0));
						
						resultadofinal = resultado1 + resultado2 + resultado3 + resultado4;
						System.out.println("O númmero decimal equivalente é: " + resultadofinal );
					}else
					{
						System.out.println("Você não digitou um número binário!");
					}
				}else
				{
					System.out.println("Você não digitou um número binário!");
				}
			}else
			{
				System.out.println("Você não digitou um número binário!");
			}
		}
		else
		{
			System.out.println("Você não digitou um número binário!");
		}
			
		
		input.close();
	}

}
