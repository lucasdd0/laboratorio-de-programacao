package estudoCheck;

import java.util.Random;
import java.util.Scanner;

public class ex01 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[][] m = new int[4][4];
        Random rd = new Random();

        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m.length; j++) {
                m[i][j] = rd.nextInt(20);
            }
        }

        System.out.println("Matriz geral: ");
        for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m.length; j++) {
				System.out.print(m[i][j] + "\t");
			}
			System.out.println();
		}
        
        int somaPrincipal = 0;
        for (int i = 0; i < m.length; i++) {
			somaPrincipal += m[i][i];
		}
        System.out.println("\nSoma da linha primária:" + somaPrincipal);
        
        int somaSecundaria = 0;
        for (int i = 0; i < m.length; i++) {
			somaSecundaria += m[i][m.length - i - 1];
		}
        System.out.println("Soma da linha secundária: " + somaSecundaria);
        
        

        in.close();
    }
}
