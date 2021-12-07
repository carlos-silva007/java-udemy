package fundamentos.operadores;

public class Aritmeticos {

	public static void main(String[] args) {

		var x = 32.60;
		double y = 14.20;
		System.out.println(x + y);
		System.out.println(x - y);
		System.out.println(x * y);
		System.out.println(x / y);

		int a = 53;
		int b = 22;
		System.out.println(a + b);
		System.out.println(a - b);
		System.out.println(a * b);
		System.out.println(a / b);
		System.out.println(a / (double) b);

		// resto ou modulo
		System.out.println(a % b);
		System.out.println(53 % 22);
		
		System.out.println(x + y - a * b);
	}
}
