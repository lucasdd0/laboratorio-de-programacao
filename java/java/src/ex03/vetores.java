package ex03;

import java.util.Scanner;

public class vetores{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] rm = new int[30];
        double[] nota1 = new double[30];
        double[] nota2 = new double[30];
        double[] media = new double[30];
        String[] aprovacao = new String[30];
        int rmsc;
        int n = 0;

        System.out.println("Informe RM ou valor negativo para enmcerrar: ");
        rmsc = sc.nextInt();

        while(rmsc > 0){
            rm[n] = rmsc;
            System.out.println("Nota 1: ");
            nota1[n] = sc.nextInt();
            System.out.println("Nota 2: ");
            nota2[n] = sc.nextInt();
            media[n] = (nota1[n] + nota2[n]) / 2;
            n++;

            System.out.println("Digite o RM ou valor negativo para encerrar: ");
            rmsc = sc.nextInt();
        }

        int nAp = 0;
        for(int i = 0; i < n; i++){
            if(media[i] >= 6){
                aprovacao[nAp] = "Aprovado";
                nAp++;
            }else{
                aprovacao[nAp] = "Reprovado";
                nAp++;
            }
        }
        
        for(int i = 0; i < n; i++){
            System.out.print("RM: " + rm[i] + "\t Média: " + media[i]);
            for(int j = 0; j < nAp; j++){ // <- Loop desnecessário
                System.out.println(" => " + aprovacao[i]);
            }
        }
        
        sc.close();

    }
}