package SegundoSemestre;

import java.util.Scanner;

// tabela ascii

public class exercicio25 {public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String palavra, codificada;
    int deslocamento;
    
    System.out.println("Palavra a ser codificada: ");
    palavra = sc.next();
    System.out.println("Deslocamento: ");
    deslocamento = sc.nextInt();
    
    codificada = codificar(palavra, deslocamento);
    
    System.out.println("Palavra codificada: " + codificada);
    
    sc.close();
}

public static String codificar(String palavra, int deslocamento) {
    char letra, letraCodificada;
    StringBuilder palavraCodificada = new StringBuilder();
    
    for (int i = 0; i < palavra.length(); i++) {
        letra = palavra.charAt(i);
        if (Character.isUpperCase(letra)) {
            letraCodificada = (char) ((letra - 'A' + deslocamento) % 26 + 'A');
            palavraCodificada.append(letraCodificada);
        } else if (Character.isLowerCase(letra)) {
            letraCodificada = (char) ((letra - 'a' + deslocamento) % 26 + 'a');
            palavraCodificada.append(letraCodificada);
        }
    }
    return palavraCodificada.toString();
}

}
