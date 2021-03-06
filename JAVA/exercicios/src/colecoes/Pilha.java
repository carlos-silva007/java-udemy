package colecoes;

import java.util.ArrayDeque;
import java.util.Deque;

public class Pilha {

	public static void main(String[] args) {

		Deque<String> livros = new ArrayDeque<String>();

		//add e push adiciona na pilha
		livros.add("O Pequeno Principe");
		livros.push("Don Quixote");
		livros.push("O Hobbit");

		// adiciona peek e element e vai px elemento
		System.out.println(livros.peek());
		System.out.println(livros.element());
		
		for(String livro: livros){  //este for seria o foreach
			System.out.println(livro);
		}

		// remove = peek e remove e pop
		System.out.println(livros.poll());
		System.out.println(livros.remove()); //traz execao = erro se nao tiver nada na pilha
		System.out.println(livros.pop()); //traz execao = erro se nao tiver nada na pilha

		//System.out.println(livros.size()); // ver o tamanho
		//livros.clear(); // para limpar
        //livros.contains();
	}

}
