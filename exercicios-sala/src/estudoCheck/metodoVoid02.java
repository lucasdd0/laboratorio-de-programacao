package estudoCheck;

public class metodoVoid02 {
	public static void main(String[] args) {
		int x = 15, y = 17;
		somar(x, y);
	}
	
	public static void somar (int x, int y) {
		int soma;
		soma = x + y;
		System.out.println("O resultado da soma é: " + soma);
	}

}
