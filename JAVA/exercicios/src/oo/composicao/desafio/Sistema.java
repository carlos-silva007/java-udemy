package oo.composicao.desafio;

public class Sistema {
	
	public static void main(String[] args) {
		
		
		Compra compra1 = new Compra();
		compra1.addItem("Caderno", 10, 4);
		compra1.addItem(new Produto("Notebook",1900), 2);

		Compra compra2 = new Compra();
		compra2.addItem("Borracha", 2, 6);
		compra2.addItem(new Produto("Impressora", 210), 3);

		Compra compra3 = new Compra();
		compra3.addItem("Lapis", 2.99, 10);
		compra3.addItem(new Produto("Monitor", 400), 1);
		
		Cliente cliente1 = new Cliente("Carlos A R Silva");
		cliente1.adicionarCompra(compra1);
		cliente1.compras.add(compra2);
		
		Cliente cliente2 = new Cliente("Dayana Karine");
		cliente2.adicionarCompra(compra3);
		
		System.out.println(cliente1.obterValorTotal());
		System.out.println(cliente2.obterValorTotal());
		
	}

}
