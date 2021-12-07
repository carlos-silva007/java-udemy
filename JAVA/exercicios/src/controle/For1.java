package controle;

public class For1 {

	public static void main(String[] args) {

		// declaração da varial, a expressao e o inclemento

		for (int contador = 1; contador <= 10; contador++) {
			System.out.println("Bom dia");
		}

		for (int contador = 1; contador <= 20; contador += 2) {
			System.out.printf("i = %d\n", contador);
		}
	}
}
