package exercicios;
import java.util.Scanner;
public class exercicio03 {
	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
		double distancia, velocidademedia, quantidadedelitros, tempo;
		
		System.out.println("Vamos calcular quantos litros você gastou em sua viagem! \n");
		System.out.println("Quantos km você percorreu em sua viagem: ");
		distancia = input.nextDouble();
		
		System.out.println("Qual foi a velocidade média (km/h) da sua viagem: ");
		velocidademedia = input.nextDouble();
		
		tempo = distancia/velocidademedia;
		quantidadedelitros = (velocidademedia * tempo)/10.5;
		
		System.out.println("Você gastou " + String.format("%.2f", quantidadedelitros) + " litros em sua viagem");
	
		
		input.close();
	}

}
