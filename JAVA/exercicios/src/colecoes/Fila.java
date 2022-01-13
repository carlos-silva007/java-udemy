package colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {
public static void main(String[] args) {
	Queue<String> fila = new LinkedList<>();
	
	//offer e add = adicionam elementos
	//diferen�a � o comportamento quando a fila esta cheia
	fila.add("Ana");
	fila.offer("Bia");  //offer =adiciona e se nao for possivel retorna true ou false/lan�a exce��o
	fila.add("Carlos");
	fila.offer("Rafaela");
	fila.add("Dayana");
	fila.offer("Gustavo");
	
	//dif quando a fila esta vazia
	//peek e element obter prox elemento da fila sem remover
	System.out.println(fila.peek());  //retorna null
	System.out.println(fila.peek());
	System.out.println(fila.element());  //lan�a uma exce��o
	
	//fila.clear = pra limpar
	//fila.isEmpty = pra saber vazia ou nao
	
	// poll e remove obtem o px elemento da fila e remove
	//diferen�a � o comportamento ocorre
	//quando a fila esta vazia
	
	System.out.println(fila.poll());  //retorna null quando estiver vazia
	System.out.println(fila.remove()); //lan�a uma exce��o
	System.out.println(fila.poll());
	System.out.println(fila.poll());
	System.out.println(fila.poll());
	System.out.println(fila.poll());
	System.out.println(fila.remove());
}
}
