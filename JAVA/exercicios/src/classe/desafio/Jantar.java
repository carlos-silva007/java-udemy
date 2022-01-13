package classe.desafio;

public class Jantar {
	public static void main(String[] args) {

		Comida c1 = new Comida("Arroz", 0.123);
		Comida c2 = new Comida("Feijao", 0.200);
		Pessoa p1 = new Pessoa("Carlos", 98.8);
		
		System.out.println(p1.apresentar());
		p1.comer(c1);
		System.out.println(p1.apresentar());
		p1.comer(c2);
		System.out.println(p1.apresentar());
		p1.comer(c2);
		System.out.println(p1.apresentar());
		
	}
}
