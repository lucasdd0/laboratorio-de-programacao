package exercicios;
import java.util.Scanner;
public class exercicio23{
	public static void main (String [] args) {
		Scanner input = new Scanner(System.in);
		
		int a, b, c, nulos, brancos, validos, totaleleitores;
		double percentualvalidos, percentuala, percentualb, percentualc, percentualnulos, percentualbrancos;
		
		System.out.println("Candidado A: ");
		a = input.nextInt();
		System.out.println("Candidado B: ");
		b = input.nextInt();
		System.out.println("Candidado C: ");
		c = input.nextInt();
		System.out.println("Votos em branco: ");
		brancos = input.nextInt();		
		System.out.println("Votos nulos: ");
		nulos = input.nextInt();	
		
		validos = a + b + c;
		totaleleitores = validos + brancos + nulos;
		percentualvalidos = validos * 100.0 / totaleleitores;
		percentuala = a * 100.0 / totaleleitores;
		percentualb = b * 100.0 / totaleleitores;
		percentualc = c * 100.0 / totaleleitores;
		percentualnulos = nulos * 100.0 / totaleleitores;
		percentualbrancos = brancos * 100.0 / totaleleitores;
		
		System.out.println("Total de eleitotes: " + totaleleitores);
		System.out.println("Percentual de votos validos: " + String.format("%.2f", percentualvalidos) + "%");
		System.out.println("Percentual de votos candidato A: " + String.format("%.2f", percentuala) + "%");
		System.out.println("Percentual de votos candidato B: " + String.format("%.2f", percentualb) + "%");
		System.out.println("Percentual de votos candidato C: " + String.format("%.2f", percentualc) + "%");
		System.out.println("Percentual de votos nulos: " + String.format("%.2f", percentualnulos) + "%");
		System.out.println("Percentual de votos em branco: " + String.format("%.2f", percentualbrancos) + "%");
		
		
		input.close();
	}
}