package controle;

import java.util.Scanner;

public class DesafioWhile {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		int quantidadenotas = 0;
		double nota = 0;
		double total = 0;

		while (nota != -1) {
			System.out.println("Informe a Nota");
			nota = entrada.nextDouble();
			if (nota <= 10 && nota >= 0) {
				total += nota;
				quantidadenotas++;
			} else if (nota != -1) {
				System.out.println("Nota Invalida!!");
			}
		}
		double media = total / quantidadenotas;
		System.out.println("Media = " + media);

		entrada.close();

	}

}
