package estudoCheck;

import java.util.Random;
import java.util.Scanner;

public class ex07 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		Random rd = new Random();
		int x = rd.nextInt(10);
		
		System.out.println(x);
		
		
		in.close();
	}

}
