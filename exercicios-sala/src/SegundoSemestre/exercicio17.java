package SegundoSemestre;

import java.util.Scanner;

public class exercicio17 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int[] lados = new int[3];
        
        for (int i = 0; i < lados.length; i++) {
            System.out.println("Digite o " + (i + 1) + "º valor: ");
            lados[i] = in.nextInt();
        }
        
        classificarTriangulo(lados[0], lados[1], lados[2]);
        
        in.close();
    }

    public static void classificarTriangulo(int a, int b, int c) {
        if (a + b > c && b + c > a && a + c > b) {
            if (a == b && b == c) {
                System.out.println("É um triângulo equilátero");
            } else if (a == b || b == c || a == c) {
                System.out.println("É um triângulo isósceles");
            } else {
                System.out.println("É um triângulo escaleno");
            }
        } else {
            System.out.println("Os valores não formam um triângulo");
        }
    }

}
