package fundamentos.operadores;

public class Ternarios {

	public static void main(String[] args) {
		
		double media = 6.6;
		String resultadoFinal = media >= 7.0 ? "aprovado" : "reprovado";
		System.out.println("o Aluno esta: " + resultadoFinal);
		
		double nota = 9.9;
		boolean bomComportamento = false;
		boolean passouPorMedia = nota >= 7;
		boolean temDesconto = bomComportamento && passouPorMedia;
		String resultado = temDesconto ? "Sim." : "Nao.";
		
		System.out.printf("Tem Desconto: %s ", resultado);
	}
}
