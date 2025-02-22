package SegundoSemestre;

import java.util.Random;
import java.util.Scanner;

public class exercicio26 {
    
    static String[] lista = new String[3];
    static String palavraSecreta;
    static char[] letraDescoberta;
    static int erro = 0;
    static char letra;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rd = new Random();

        System.out.println("Digite as palavras: ");
        for (int i = 0; i < lista.length; i++) {
            lista[i] = sc.next().toUpperCase();
        }

        palavraSecreta = lista[rd.nextInt(lista.length)];
        letraDescoberta = new char[palavraSecreta.length()];
        for (int i = 0; i < letraDescoberta.length; i++) {
            letraDescoberta[i] = '_';
        }

        while (erro < 6 && !descobrir()) {
            System.out.println("A palavra é: ");
            for (char ch : letraDescoberta) {
                System.out.print(ch + " ");
            }
            System.out.println("\nDigite uma letra: ");
            letra = sc.next().toUpperCase().charAt(0);

            if (!verificar()) {
                erro++;
                System.out.println("Você errou pela " + erro + "ª vez. Tente de novo!");
            } else {
                System.out.println("Boa! Você acertou uma letra.");
            }

            System.out.println();
        }

        if (erro == 6) {
            System.out.println("Você foi enforcado! A palavra era: " + palavraSecreta);
        } else {
            System.out.println("Parabéns! Você adivinhou a palavra: " + palavraSecreta);
        }

        sc.close();
    }

    public static boolean verificar() {
        boolean achou = false;
        for (int i = 0; i < palavraSecreta.length(); i++) {
            if (letra == palavraSecreta.charAt(i)) {
                letraDescoberta[i] = letra;
                achou = true;
            }
        }
        return achou;
    }

    public static boolean descobrir() {
        for (char ch : letraDescoberta) {
            if (ch == '_') {
                return false;
            }
        }
        return true; // Se não houver mais '_', significa que a palavra foi descoberta.
    }
}
