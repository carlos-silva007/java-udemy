package controle;

import java.util.Scanner;

public class DiadaSemana2 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite nome do dia");
		
		String dia = entrada.next();
		
		if("domingo".equalsIgnoreCase(dia)) {  //ignore vai ignorar maiusculas
			System.out.println("Corresponde: " + 1);
		} else if("segunda".equalsIgnoreCase(dia)) {
			System.out.println("Corresponde: " + 2);
		} else if("terça".equalsIgnoreCase(dia) || "terca".equalsIgnoreCase(dia)) {
			System.out.println("Corresponde: " + 3);
		} else if("quarta".equalsIgnoreCase(dia)) {
			System.out.println("Corresponde: " + 4);
		} else if("quinta".equalsIgnoreCase(dia)) {
			System.out.println("Corresponde: " + 5);
		} else if("sexta".equalsIgnoreCase(dia)) {
			System.out.println("Corresponde: " + 6);
		} else if("sábado".equalsIgnoreCase(dia) || "sabado".equalsIgnoreCase(dia)) {
			System.out.println("Corresponde: " + 7);
		} else {
			System.out.println("Dia Invalido");
		}
		
		
		entrada.close();
	}
}
