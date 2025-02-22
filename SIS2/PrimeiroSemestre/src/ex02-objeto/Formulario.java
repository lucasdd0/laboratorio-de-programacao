import java.util.Scanner;

public class Formulario {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Paciente pc = new Paciente();

        System.out.println("Digite seu nome: ");
        pc.nome = sc.nextLine();
        System.out.println("Digite sua idade: ");
        pc.idade = sc.nextInt();
        System.out.println("Digite sua frequência cadíaca: ");
        pc.frequencia = sc.nextInt();

        System.out.println("Frequencia Máxima: " + pc.frequanciaMaxima());
        double[] alvo = pc.frequenciaAlvo();
        System.out.println("Frequencia Alvo: " + alvo[0] + " a " + alvo[1]);

        sc.close();
    }
}
