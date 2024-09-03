package estudoCheck;

import java.util.Scanner;

public class ex031 {
	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		
		double[] notas = new double[4];
        double[] medias = new double[3];
        int alunosAprovados = 0;
        
        for (int i = 0; i < medias.length; i++) {
			System.out.println("Digite as notas do " + (i+1) + "º aluno: ");
			
			double somaNotas = 0;
			
			for (int j = 0; j < notas.length; j++) {
				System.out.println("Digite a " + (i+1) + "º nota: ");
				notas[j] = in.nextDouble();
				somaNotas += notas[j];
			}
			
			medias[i] = somaNotas / notas.length;
			
			if(medias[i] >= 6.0) {
				alunosAprovados++;
			}
		}
        
        System.out.println("A qauntidade de alunos aprovados foram: " + alunosAprovados);
		
		
	}

}
