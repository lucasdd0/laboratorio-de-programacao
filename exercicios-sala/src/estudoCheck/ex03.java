package estudoCheck;

import java.util.Scanner;

public class ex03 {
	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		
		String [] aluno = new String [10];
		double [] nota = new double [4];
		
		
		int alunosAprovados = 0;
		
		for (int i = 0; i < aluno.length; i++) {
			System.out.println("Nome do " + (i+1) + "º aluno: ");
			aluno[i] = in.next();
			
			double somaNotas = 0, media = 0;
			
			for (int j = 0; j < nota.length; j++) {
				System.out.println("Digite a " + (j+1) + "º nota do(a) " + aluno[i] + ": ");
				nota[j] = in.nextDouble();
				somaNotas += nota[j];
			}
		
			media = somaNotas / nota.length;
			
			if(media >= 6.0) {
				alunosAprovados++;
			}
			
		}
		
		System.out.println("O número de alunos aprovados é: " + alunosAprovados);
		
	}

}
