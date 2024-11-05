package estudoCheck;

public class stringToChar {
	public static void main(String[] args) {
		
		String palavra = "Hello";
		
		char[] caracteres = palavra.toCharArray();
		
		for(char ch : caracteres) {
			System.out.print(ch + "\t");
		}
		
		
		System.out.println("\n");
		
		
		String palavra2 = "VaiDarBom";
		
		char[] caracteres2 = palavra2.toCharArray();
		caracteres2[0] = 'S';
		
		String palavra2Nova = new String(caracteres2);
		
		System.out.println(palavra2Nova);
		
		
		System.out.println("");
		
		
		String frase = "Java é divertido e poderoso";
		String[] cortes = frase.split(" ");
		
		for(String i : cortes) {
			System.out.print(i + "\t");
		}
		
		
	}

}
