package exercicios;

import java.util.Scanner;

public class exercicio13 {
	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
		int i, j, menor = 0;
		int v [] = new int [3];
		
		for (i = 0; i < 3; i++)
		{
			System.out.println("Digite o " + (i + 1) + "° valor: ");
			v[i] = input.nextInt();
		}
		
		if (v[0] != v[1] && v[1] != v[2] && v[0] != v[2])
		{
			for (i = 0; i < (3 - 1); i++)
			{
				menor = v[i];
				for (j = i + 1; j < 3; j++)
				{
					if(v[i] > v [j])
					{
						menor = v[j];
					}
				}
			}
			System.out.println("O menor valor é: " + menor);
		}
		
		else
		{
			System.out.println("Digite valores diferentes!");
		}
		
		
		input.close();
	}
}
