package estudoCheck;

public class metodoVoid02 {
	public static void main(String[] args) {
		int x = 15, y = 17;
		somar(x, y);								//argumento é o valor enviado
	}
													//métpdo que não retorna valor é um procedimento
	public static void somar (int x, int y) {		//assinatura é o "cabeçalho" e os paramêtros são as variáveis necessárias dentro do (...)
		int soma;									//paramêtro é o valor recebido
		soma = x + y;
		System.out.println("O resultado da soma é: " + soma);
	}

}
