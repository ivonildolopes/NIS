package Util;

import javax.swing.JOptionPane;

public class PrimeiroNome {

	public String primeiroNome(String nome) {
		String primeiroNome = "";

		for (int i = 0; i < nome.length(); i++) {
			if (nome.charAt(i) != ' ') {
				primeiroNome += nome.charAt(i);
			} else
				break;
		}

		return primeiroNome;
	}

	public static void main(String[] arg) {

		String nome;
		String primeiroNome = "";

		nome = JOptionPane.showInputDialog("Informe o nome e o sobrenome");

		for (int i = 0; i < nome.length(); i++) {
			if (nome.charAt(i) != ' ') {
				primeiroNome += nome.charAt(i);
			} else
				break;
		}

		System.out.println("primeiro nome é: " + primeiroNome);

	}
}
