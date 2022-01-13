package classe;

public class ProdutoTeste {

	public static void main(String[] args) {

		Produto p1 = new Produto("Notebook", 4350);
		//p1.desconto = 4356.89;
		//p1.desconto = 0.25;
				
		Produto p2 = new Produto("Caneta Preta", 40);
		//p2.nome = "Caneta Preta";
		//p2.preco = 20.56;
		
		Produto.desconto = 0.50;
		
		System.out.println(p1.nome + " " + p1.precoComDesconto());
		System.out.println(p2.nome + " " + p2.precoComDesconto());
		
		double precoFinal1 = p1.precoComDesconto();
		double precoFinal2 = p2.precoComDesconto(0.2);
		double mediaCarrinho = (precoFinal1 + precoFinal2) / 2 ;
		
		System.out.printf("Media do Carrinho = R$ %.2f.", mediaCarrinho);

	}

}
