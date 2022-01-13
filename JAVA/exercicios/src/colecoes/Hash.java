package colecoes;

import java.util.HashSet;

public class Hash {
	public static void main(String[] args) {
		      //ligando com a classe Usuario//
		HashSet<Usuario> users = new HashSet<Usuario>();
		
		users.add(new Usuario("Pedro"));
		users.add(new Usuario("Carlos"));
		users.add(new Usuario("Dayana"));
		users.add(new Usuario("Dayana"));
		
		boolean resultado = users.contains (new Usuario("Carlos")); //vai localizar o usuario carlos ret true
		System.out.println(resultado);
	}
//preferencialmente usar o hash e equals juntos
}
