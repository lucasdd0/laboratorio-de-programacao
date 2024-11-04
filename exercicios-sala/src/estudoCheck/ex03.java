package estudoCheck;

import java.util.Scanner;

public class ex03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite um número: ");
        int numero = sc.nextInt();
        
        int[] divisores = encontrarDivisores(numero);
        imprimindo(divisores);
        
        sc.close();
    }

    public static int[] encontrarDivisores(int numero) {
        int contador = 0;

        for (int i = -Math.abs(numero); i <= Math.abs(numero); i++) {
            if (i != 0 && numero % i == 0) {
                contador++;
            }
        }

        int[] divisores = new int[contador];
        int index = 0;

        for (int i = -Math.abs(numero); i <= Math.abs(numero); i++) {
            if (i != 0 && numero % i == 0) {
                divisores[index++] = i;
            }
        }

        return divisores;
    }

    public static void imprimindo(int[] divisores) {
        System.out.println("Os divisores desse número são:");
        for (int divisor : divisores) {
            System.out.println(divisor);
        }
    }
}
