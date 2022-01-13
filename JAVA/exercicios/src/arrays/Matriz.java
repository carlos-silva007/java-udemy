package arrays;

import java.util.Scanner;

public class Matriz {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.print("Quantos Alunos? ");
		int qtDeAlunos = entrada.nextInt();

		System.out.print("Quantos notas por Aluno? ");
		int qtDeNotas = entrada.nextInt();

		// matriz, um array dentro do outro
		double[][] notasDaTurma = new double[qtDeAlunos][qtDeNotas];

		double total = 0;
		for (int a = 0; a < notasDaTurma.length; a++) {
			for (int n = 0; n < notasDaTurma[a].length; n++) {
				System.out.printf("Informe a Nota %d do Aluno %d: ", a  + 1, n + 1);
				notasDaTurma[a][n] = entrada.nextDouble();
				total += notasDaTurma[a][n];
			}

		}
		double media = total / (qtDeAlunos * qtDeNotas);
		System.out.println("A Meda da Turma é: " + media);

		entrada.close();
	}
}
