package estudoCheck;

import javax.swing.JOptionPane;

public class ex08 {
	public static void main(String[] args) {
		String email;
		
		email = JOptionPane.showInputDialog("Digite seu email");
		validar(email);
	}

	private static void validar(String email) {
		char[] verifica = email.toCharArray();
		for (int i = 0; i < verifica.length; i++) {
			
		}
		if (email.startsWith("@") || email.endsWith("@")) {
			JOptionPane.showMessageDialog(null, "Email inválido");
		} else {
			JOptionPane.showMessageDialog(null, "Email cadastrado");
		}
		
	}

}
