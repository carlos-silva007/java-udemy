package controle;

import javax.swing.JOptionPane;

public class IfElse {
	public static void main(String[] args) {

		// joption.showinput habilita uma janela pra usua digitar
		String valor = JOptionPane.showInputDialog("Informe o numero:");
		int numero = Integer.parseInt(valor);

		/*
		 * mesma operacao abaixo usando else(caso contrario) 
		 * if(numero % 2 == 0) {
		 * System.out.println("Numero Par!!"); } 
		 * if(numero % 2 == 1) {
		 * System.out.println("Numero Impar!!"); }
		 */
		if (numero % 2 == 0) {
			System.out.println("Numero Par!");
		} else {
			System.out.println("Numero Impar");
		}

	}
}
