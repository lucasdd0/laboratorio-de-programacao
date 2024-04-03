package exercicios;
import java.util.Scanner;
public class exercicio04 {
	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
		double ValorDescontoINSS, SalarioBruto, SalarioLiquidoMensal, ValorAulaHora, HorasTrabalhadasMes, PorcentagemDescontoINSS;
		
		System.out.println("Digite qual é o valor aula-hora: ");
		ValorAulaHora = input.nextDouble();
		
		System.out.println("Digite o número de horas trabalhadas por mês: ");
		HorasTrabalhadasMes = input.nextDouble();
		
		System.out.println("Digite a porcentagem de desconto do INSS: ");
		PorcentagemDescontoINSS = input.nextDouble();
		
		SalarioBruto = ValorAulaHora*HorasTrabalhadasMes;
		
		ValorDescontoINSS = (SalarioBruto * PorcentagemDescontoINSS)/100;
				
		SalarioLiquidoMensal = SalarioBruto - ValorDescontoINSS;
		
	
		System.out.println("Seu salário bruto é " + SalarioBruto + " e seu salário líquido é "+ String.format("%.2f", SalarioLiquidoMensal));
		
		
		
		
		input.close();
	}

}
