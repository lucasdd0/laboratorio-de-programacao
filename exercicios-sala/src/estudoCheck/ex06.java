package estudoCheck;

import java.util.Scanner;

public class ex06 {
	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		
		int [] array = new int [6];
		
		for (int i = 0; i < array.length; i++) {
			System.out.println("Digite o " + (i+1) + "º elemento: ");
			array[i] = in.nextInt();
		}
		
		boolean especial = true;
		
		for (int i = 0; i < array.length - 1; i++) {		//prestar atenção no MENOSSSS "-"
			if(array[i] % 2 == array[i + 1] % 2) {
				especial = false;
			}
		}

		if(especial) {
			System.out.println("Esse array é especial");
		}
		else {
			System.out.println("Esse array não é especial");
		}
		
		
		in.close();
	}

}
