package controle;

public class For2 {
	public static void main(String[] args) {

		/*for (int contador = 10; contador >= 0; contador -= 2) {
			System.out.printf("Contador = %d\n", contador);
		}*/
		
		for(int i = 0; i < 10; i ++){
			for(int j = 10; j > 0; j--){
				System.out.printf("[%d  %d]", i, j);
			}
		}

	}
}
