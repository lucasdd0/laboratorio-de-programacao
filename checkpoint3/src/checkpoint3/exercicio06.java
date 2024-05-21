package checkpoint3;

import java.util.Scanner;

public class exercicio06 {
	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		
		int n, i = 1, primeirotermo = 1, segundotermo = 1, proximotermo;
		
		System.out.println("Digite o total de termos: ");
		n = in.nextInt();
		
		for(i = 1; i <= n; i++) {
			proximotermo = primeirotermo + segundotermo;
			System.out.println(proximotermo + " ");
			primeirotermo = segundotermo;
			segundotermo = proximotermo;
		}
		
		in.close();
	}

}
