package fundamentos;

public class TipoString {

	public static void main(String[] args) {
		/*
		System.out.println("Ola Mundo".charAt(5));  //pra saber qual a letra 5 
		
		String s = "Boa Tarde";
		System.out.println(s.concat("!!!!2"));    //adiciona mais letras na string
		System.out.println(s + "???");
		System.out.println(s.startsWith("Boa"));  //perguntando se começa com Boa
		System.out.println(s.endsWith("tarde"));  //perguntando se termina com tarde
 		System.out.println(s.length());   //pra saber qts caracteres tem a string
 		System.out.println(s.equals("boa tarde"));   //pra comparar
 		System.out.println(s.equalsIgnoreCase("boa Tarde"));   //pra comparar ignorando maisc/mins
		*/
		var nome = "Carlos";
		var sobrenome = "Silva";
		var idade = 33;
		var salario = 12345.50;
		// pra exigir tudo de uma unica vez \n pra quebra paragrafo
		System.out.printf("o Senhor %s %s tem %d anos e ganha R$%.2f.", 
				nome, sobrenome, idade, salario);
		// cria a string ja formatada com dados
		String frase = String.format("\n o Senhor %s %s tem %d anos e ganha R$%.2f.", 
				nome, sobrenome, idade, salario);
		System.out.printf(frase);  //pra exibir usar printF no final
	}
}
