package fundamentos;

public class NotacaoPonto {

	public static void main(String[] args) {
		
		String x = "Bom dia X";
		x = x.toUpperCase();  //transforma as letras do x em MAIUSCULAS
	
		System.out.println(x);
	
		x = x.replace("X", "Senhara");  //substitiu a palavra X para Senhora
		System.out.println(x);
		
		String nome = "Boa Tarde X".toUpperCase().concat("!!!!!").replace("X", "Carlos");
		System.out.println(nome);
		
	}
}
