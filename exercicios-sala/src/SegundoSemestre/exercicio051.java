package SegundoSemestre;

import java.util.Scanner;

public class exercicio051 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Digite o tamanho da array: ");
        int tamanhoArray = in.nextInt();

        int[] array = lerArray(in, tamanhoArray);

        if (isEspecial(array)) {
            System.out.println("Esse array é considerado especial");
        } else {
            System.out.println("Esse array não é considerado especial");
        }
    }
    
    
    private static int[] lerArray(Scanner in, int tamanhoArray) {
        int[] array = new int[tamanhoArray];
        for (int i = 0; i < array.length; i++) {
            System.out.println("Digite o valor [" + i + "] = ");
            array[i] = in.nextInt();
        }
        return array;
    }
    
    
    private static boolean isEspecial(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] % 2 == array[i + 1] % 2) {
                return false;
            }
        }
        return true;
    }
}