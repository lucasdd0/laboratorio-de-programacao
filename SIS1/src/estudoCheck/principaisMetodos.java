package estudoCheck;

public class principaisMetodos {
	public static void main(String[] args) {
		
		String str = "Exemplo";
		int tamanho = str.length();
		System.out.println("Tamanho: " + tamanho);
		
		char c = str.charAt(2);
		System.out.println(c);
		String sub = str.substring(1, 4);
		System.out.println(sub);
		String maiuscula = str.toUpperCase();
		System.out.println(maiuscula);
		boolean contem = str.contains("xem");
		System.out.println(contem);
		
		String s1 = "Olá, ";
		String s2 = "Mundo!";
		String resultado = s1 + s2;
		System.out.println(resultado);
		String resultado2 = s1.concat(s2);
		System.out.println(resultado2);
		String resultado3 = s2.concat(s1);
		System.out.println(resultado3);
		
		String s3 = "Banana";
		String s4 = "Apple";
		String s5 = "Banana";
		System.out.println(s3.compareTo(s4));
		System.out.println(s3.compareTo(s5));
		System.out.println(s4.compareTo(s5));
		
		String palavra = "Java";
		char[] caracteres = palavra.toCharArray();
		
		System.out.println();
		for (char ch : caracteres) {
			System.out.print(ch + "\t");
		}
	}

}
