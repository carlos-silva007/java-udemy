package fundamentos;

public class Wrappers {
	public static void main(String[] args) {

		// byte
		Byte b = 100;
		Short s = 1000;
		Integer i = 10000; // int
		Long l = 1000000L;

		System.out.println(b.byteValue()); // mostra valor da variavel
		System.out.println(s.toString()); // converte short em string
		System.out.println(i * 3);
		System.out.println(l / 3);
		
		Float f = 123.10F;
		System.out.println(f);
		
		Double d = 1234.5678;
		System.out.println(d);
		
		
		Boolean bo = Boolean.parseBoolean("false");
		System.out.println(bo);
		System.out.println(bo.toString().toUpperCase()); //convertei bo pra string e maiuscula
		
		Character c = '#';   //char
		System.out.println(c + ".texto.");
	}

}
