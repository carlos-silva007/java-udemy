package fundamentos;

public class ConversaoTipoNumericos {

	public static void main(String[] args) {

		double a = 1; // implicita
		System.out.println(a);

		float b = (float) 1.12323232338; // explicita(CAST) com perda de informacao
		System.out.println(b);

		int c = 4;
		byte d = (byte) c;
		System.out.println(d);

		double e = 1.99999;
		int f = (int) e; // CAST forçando a troca
		System.out.println(f);

		Integer num1 = 10000;
		System.out.println(num1.toString().length());

	}
}
