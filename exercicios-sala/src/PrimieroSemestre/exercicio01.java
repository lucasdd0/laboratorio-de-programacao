package PrimieroSemestre;
import java.util.Scanner;
public class exercicio01 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		
		double valorbase, valoraltura, arearetangulo, perimetroretangulo;
		
		System.out.println("Vamos calcular a área e o perímetro de um retângulo\n");
		System.out.println("Digite o valor da base: ");
		valorbase = input.nextDouble();
		
		System.out.println("Digite o valor da altura: ");
		valoraltura = input.nextDouble();
		
		arearetangulo = valorbase*valoraltura;
		perimetroretangulo = (valorbase*2) + (valoraltura*2);
		
		System.out.println("O valor da área do seu retângulo é " + arearetangulo + " e o valor do perimetro é " + perimetroretangulo);
		
		input.close();
	}

}