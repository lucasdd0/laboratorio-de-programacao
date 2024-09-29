package estudoCheck;

import java.util.Random;

public class ex02 {
    public static void main(String[] args) {
        
        int[][] m = new int[10][10];
        Random rd = new Random();
        
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                m[i][j] = rd.nextInt(1001);
            }
        }
        
        System.out.println("Matriz:");
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                System.out.print(m[i][j] + "\t");
            }
            System.out.println();
        }
        
        int maior = m[0][0];
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                if (maior < m[i][j]) {
                    maior = m[i][j];
                }
            }
        }
        
        System.out.println("\nO maior valor da matriz é: " + maior);
        
        System.out.println("\nLocalizações dos maiores: ");
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                if (maior == m[i][j]) {
                    System.out.print("[" + i + "][" + j + "]" + "\t");
                }
            }
        }
    }
}
