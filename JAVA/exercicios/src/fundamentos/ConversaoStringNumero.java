package fundamentos;

import javax.swing.JOptionPane;

public class ConversaoStringNumero {

	public static void main(String[] args) {

		String valor1 = JOptionPane.showInputDialog("Dgite o primeiro Numero: "); // aparece janela visual
		String valor2 = JOptionPane.showInputDialog("Dgite o segundo Numero: "); // aparece janela visual
		System.out.println(valor1 + valor2);  //ele vai somar pois sao duas string
		 
		//agora convertendo a string pra numero e executar a soma
		
		double numero1 = Double.parseDouble(valor1);
		double numero2 = Double.parseDouble(valor2);
				
		double soma = numero1 + numero2;
		System.out.println("A Soma é : " + soma );
		System.out.println("Media é: " + soma / 2);
		
				
	}

}
