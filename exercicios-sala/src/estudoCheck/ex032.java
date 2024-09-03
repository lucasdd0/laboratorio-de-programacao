package estudoCheck;

import java.util.Scanner;

public class ex032 {
	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		
		String[] alunos = new String[4];
        double[] medias = new double[4];
        int alunosAprovados = 0;
        
        for (int i = 0; i < alunos.length; i++) {
			System.out.println("Nome do aluno: ");
			alunos[i] = in.next();
			
			double somaNotas = 0;
			
			for (int j = 0; j < 4; j++) {
				System.out.println("Digite a " + (j+1) + "º nota: ");
				double notas = in.nextDouble();
				somaNotas += notas;
			}
			
			medias[i] = somaNotas / 4;
			
			if(medias[i] >= 6.0) {
				alunosAprovados++;
			}
		}
        
        System.out.println("Alunos aprovados:\n");
        for (int i = 0; i < alunos.length; i++) {
			if(medias[i] >= 6.0) {
				System.out.println(alunos[i]);
			}
		}
        
        System.out.println("A quantidade de alunos aprovados foram: " + alunosAprovados);
		
		
	}

}
