package estudoCheck;

import java.util.Scanner;

public class ex10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		String correta, incorreta;
		
		System.out.println("Frase correta: ");
		correta = sc.nextLine();
		System.out.println("Frase incorreta: ");
		incorreta = sc.nextLine();
		
		System.out.println("Total de erros: " + totalErros(correta, incorreta));
		
		sc.close();
		
	}

	private static int totalErros(String correta, String incorreta) {
		int total = 0;
		
		String palavrasCorretas[] = correta.split(" ");
		String palavrasIncorretas[] = incorreta.split(" ");
		StringBuilder lista = new StringBuilder();
		
		for (int i = 0; i < palavrasIncorretas.length; i++) {
			if(!palavrasCorretas[i].equals(palavrasIncorretas[i])) {
				total ++;
				lista.append(palavrasIncorretas[i] + "\t");
			}
		}
		
		System.out.println("Lista de palavras incorretas:\n" + lista);

		return total;
	}
	

}
