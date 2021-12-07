package fundamentos;

import java.util.Scanner;

public class Console_Scanner {
	
	public static void main(String[] args) {
		System.out.print("Bom");
		System.out.print("Dia!!!\n\n");
		
		System.out.println("Bom");
		System.out.println("Dia");
		
		System.out.printf("Megasena: %d %d %d %d\n", 1, 2, 3, 4);
		
		//scanner
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite seu Nome: ");
		String nome = entrada.nextLine();

		System.out.print("Digite seu Sobrenome: ");
		String sobrenome = entrada.nextLine();
		
		System.out.print("Digite seu Idade: ");
		int idade = entrada.nextInt();  //quando usar numeros int nextInt
		
		System.out.printf("%s %s tem %d anos.%n", nome, sobrenome, idade);
		
		entrada.close();
		
		//sempre fechar o scaner no final
		
	}
	

}
