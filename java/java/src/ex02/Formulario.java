package ex02;

import java.util.Scanner;

public class Formulario {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Paciente pc = new Paciente();

        System.out.println("Digite seu nome: ");
        pc.nome = sc.next();
        System.out.println("Digite sua idade: ");
        pc.idade = sc.nextInt();
        System.out.println("Digite sua frequência cadíaca: ");
        pc.frequencia = sc.nextInt();

        sc.close();
    }
}
