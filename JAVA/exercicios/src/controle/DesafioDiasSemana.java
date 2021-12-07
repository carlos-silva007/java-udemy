package controle;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class DesafioDiasSemana {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		String dia = JOptionPane.showInputDialog("Informe o numero:");

		int numero = Integer.parseInt(dia);

		if (numero == 1) {
			System.out.println("Hoje é Domingo");
		} else if (numero == 2) {
			System.out.println("Hoje é Segunda");
		} else if (numero == 3) {
			System.out.println("Hoje é Terça");
		} else if (numero == 4) {
			System.out.println("Hoje é Quarta");
		} else if (numero == 5) {
			System.out.println("Hoje é Quinta");
		} else if (numero == 5) {
			System.out.println("Hoje é Sexta");
		} else if (numero == 5) {
			System.out.println("Hoje é Sabado");
		}

		entrada.close();
	}
}
