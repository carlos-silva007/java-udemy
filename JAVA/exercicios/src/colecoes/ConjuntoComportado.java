package colecoes;

import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class ConjuntoComportado {
	public static void main(String[] args) {

		// exibe em ordem de cessao
		SortedSet<String> listaAprovados1 = new TreeSet<>();
		listaAprovados1.add("Carlos");
		listaAprovados1.add("Rafaela");
		listaAprovados1.add("Ronaldo");
		listaAprovados1.add("Cintia");

		for (String candidato : listaAprovados1) {
			System.out.println(candidato);
		}

		Set<Integer> numeros = new HashSet<>();
		numeros.add(123);
		numeros.add(50);
		numeros.add(21);
		numeros.add(33);

		for (int n : numeros) {
			System.out.println(n);
		}
	}
}
