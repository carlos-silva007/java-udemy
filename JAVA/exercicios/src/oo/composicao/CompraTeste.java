package oo.composicao;

public class CompraTeste {

	public static void main(String[] args) {
		
		Compra compra1 = new Compra();
		
		compra1.cliente = "Carlos";
		compra1.adicionarItem(new Item("Caneta", 10, 2.45));
		compra1.adicionarItem(new Item("Borracha", 14, 0.33));
		compra1.adicionarItem(new Item("Caderno", 3, 20.50));
		
		System.out.println(compra1.itens.size());
		System.out.println(compra1.obterValorTotal());
		
	}
}
