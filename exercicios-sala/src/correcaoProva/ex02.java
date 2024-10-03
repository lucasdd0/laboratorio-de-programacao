package correcaoProva;

import java.util.Random;
import java.util.Scanner;

public class ex02 {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
        
        int cidade = 4;
        int origem, destino, parada, total;
        int [][] tempo = new int [cidade][cidade];
        Random rd = new Random();
        
        for (int i = 0; i < cidade - 1; i++) {
			for (int j = 1 + i; j < cidade; j++) {
				tempo[i][j] = rd.nextInt(1, 100);
				tempo[j][i] = tempo[i][j];
				//if(i == j) {
				//	tempo[i][j] = 0;
				//}
				//System.out.print(tempo[i][j] + "\t");
			}
			//System.out.println();
		}
        
        for (int i = 0; i < cidade; i++) {
			for (int j = 0; j < cidade; j++) {
				System.out.print(tempo[i][j] + "\t");
			}
			System.out.println();
		}
        
        System.out.println("Cidade de origem: ");
        origem = sc.nextInt();
        System.out.println("Cidade de destino: ");
        destino = sc.nextInt();
        System.out.println("Cidade de parada: ");
        parada = sc.nextInt();
        
        total = tempo[origem - 1][parada - 1] + tempo[parada - 1][destino - 1];
        
        System.out.println("Tempo: " + total);
        
        
        
        
        
    }
}
