package correcaoProva;

import java.util.Random;
import java.util.Scanner;

public class ex01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rd = new Random();
        
        int ordem = 3;
        
        int [][] m = new int[ordem][ordem];
        
        for (int i = 0; i < ordem; i++) {
            for (int j = 0; j < ordem; j++) {
                m[i][j] = rd.nextInt(1, 20);
            }
        }
        
        for (int i = 0; i < ordem; i++) {
            for (int j = 0; j < ordem; j++) {
                System.out.print(m[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println();
        
        for (int i = ordem - 1; i >= 0; i--) {
            for (int j = ordem - 1; j >= 0; j--) {
                System.out.print(m[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
