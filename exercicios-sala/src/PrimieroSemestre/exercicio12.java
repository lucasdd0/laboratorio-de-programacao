package PrimieroSemestre;
import java.util.Scanner;
public class exercicio12 {
	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
		int i, j, aux;
		int v [] = new int [3];
		
		for (i = 0; i < 3; i++)
		{
			System.out.println("Digite o " + (i + 1) + "° valor: ");
			v[i] = input.nextInt();
		}
		
		for (i = 0; i < (3 - 1); i++)
		{
			for (j = i + 1; j < 3; j++)
			{
				if(v[i] > v [j])
				{
					aux = v[i];
					v[i] = v[j];
					v[j] = aux;
				}
			}
		}
		
		for (i = 0; i < 3; i++)
		{
			System.out.print(v[i] + " ");
		}
		
		
		input.close();
	}

}
