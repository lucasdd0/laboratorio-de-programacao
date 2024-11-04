package estudoCheck;

public class metodoRetunr01 {
	public static void main(String[] args) {
		int x = 15, y = 17, soma;
		soma = somar(x, y);
		System.out.println("O resultado da soma é: " + soma);
	}
	
	public static int somar (int x, int y) {			//os que retornam um valor é chamado de função
		int soma;
		soma = x + y;
		return soma;
	}

}
