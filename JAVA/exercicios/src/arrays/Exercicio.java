package arrays;

import java.util.Arrays;

public class Exercicio {
	public static void main(String[] args) {
		double[] notasAlunoA = new double[5];
		notasAlunoA[0] = 7.9;
		notasAlunoA[1] = 8;
		notasAlunoA[2] = 6.7;
		notasAlunoA[3] = 5.8;
		notasAlunoA[4] = 8.2;

		System.out.println(notasAlunoA[2]);
		System.out.println(Arrays.toString(notasAlunoA));

		double totalAlunoA = 0;
		for (int i = 0; i < notasAlunoA.length; i++) {
			totalAlunoA += notasAlunoA[i];
		}
		System.out.println(totalAlunoA / notasAlunoA.length);

		
		double[] notasAlunoB = { 7.4, 5.6, 8.1, 9 };
		double totalAlunoB = 0;
		for(double n1: notasAlunoB) {
			System.out.println(n1);;
		}
		System.out.println(totalAlunoB / notasAlunoB.length);

	}
}
