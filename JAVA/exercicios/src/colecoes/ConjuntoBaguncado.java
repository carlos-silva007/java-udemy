package colecoes;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoBaguncado {
	@SuppressWarnings({ "rawtypes", "unchecked" })  //silenciar as advertencia CTRL+1
	public static void main(String[] args) {

		HashSet conjunto = new HashSet();

		conjunto.add(1.2); // double > Double
		conjunto.add(true); // boolean > Bolean
		conjunto.add("Teste");
		conjunto.add(1);
		conjunto.add('x');

		System.out.println("Tamanho é: " + conjunto.size());

		conjunto.add("Teste");
		conjunto.add('x');
		System.out.println("Tamanho é: " + conjunto.size());
		System.out.println(conjunto.remove("teste"));
		System.out.println(conjunto.remove("Teste"));
		System.out.println(conjunto.remove('x'));

		System.out.println("Tamanho é: " + conjunto.size());

		System.out.println(conjunto.contains('x'));
		System.out.println(conjunto.contains(1));
		System.out.println(conjunto.contains(1.2));

		
		Set nums = new HashSet();
		nums.add(1);
		nums.add(2);
		nums.add(33);
		
		System.out.println(nums);
		System.out.println(conjunto);
		
		conjunto.addAll(nums);    //fazendo a uniao dos dois conjuntos
		System.out.println(conjunto);
		
		conjunto.retainAll(nums);   //ele mostra somente os itens em comum
		System.out.println(conjunto);
		
		conjunto.clear();
		System.out.println(conjunto);
		
	}
}
