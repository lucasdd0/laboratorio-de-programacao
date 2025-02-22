import java.util.Scanner;

public class MainAluno {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Aluno a = new Aluno();

        System.out.print("Digite seu RM: ");
        a.rm = sc.nextInt();
        sc.nextLine();
        System.out.print("Digite seu nome: ");
        a.Nome = sc.nextLine();

        for (int i = 0; i < 2; i++) {
            System.out.print("Digite sua " + (i + 1) + "° nota: ");
            a.nota[i] = sc.nextDouble();
        }

        System.out.println("RM: " + a.rm);
        System.out.println("Nome: " + a.Nome);
        for (int i = 0; i <= 1; i++) {
            System.out.println((i + 1) + "° nota: " + a.nota[i]);
        }

        System.out.println("Média: " + a.CalcularMedia());

        sc.close();
    }
}