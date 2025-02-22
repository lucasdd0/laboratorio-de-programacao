package SegundoSemestre;

import java.util.Random;
import java.util.Scanner;

public class exercicio23 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[] v = new int[10];

        preenchendo(v);
        imprimindo(v);
        double media = media(v);
        double desvio = desvioPadrao(v, media);
        System.out.println("Desvio padrão:" + desvio);

        in.close();
    }

    
    public static void preenchendo(int v[]) {
        Random rd = new Random();
        for (int i = 0; i < v.length; i++) {
            v[i] = rd.nextInt(0, 100);
        }
    }

    
    public static void imprimindo(int v[]) {
        System.out.print("Vetor: ");
        for (int i = 0; i < v.length; i++) {
            System.out.print(v[i] + " ");
        }
        System.out.println();
    }

    
    public static double media(int v[]) {
        double soma = 0;
        for (int i = 0; i < v.length; i++) {
            soma += v[i];
        }
        double media = soma / v.length;
        System.out.println("Média: " + media);
        return media;
    }

    
    public static double desvioPadrao(int[] v, double media) {
        double somaQuadrados = 0;
        for (int i : v) {
            somaQuadrados += Math.pow(v[i] - media, 2);
        }
        return Math.sqrt(somaQuadrados / (v.length - 1));
    }
}