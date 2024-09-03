package estudoCheck;

import java.util.Scanner;

public class ex04 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String[] mes = new String[12];
        double[] temp = new double[12];
        double somaTemp = 0;
        double media = 0;

        for (int i = 0; i < mes.length; i++) {
            System.out.println("Digite o mês: ");
            mes[i] = in.next();

            System.out.println("Digite a temperatura desse mês: ");
            temp[i] = in.nextDouble();

            somaTemp += temp[i];
        }

        media = somaTemp / 12;

        System.out.println("Temperaturas acima da média anual (" + media + "):");
        for (int i = 0; i < mes.length; i++) {
            if (temp[i] > media) {
                System.out.println(mes[i] + " - " + temp[i]);
            }
        }
        
		in.close();
    }
}
