package fundamentos;

public class Primitivos {

	public static void main(String[] args) {
		byte anosDeEmpresa = 23;
		short numerodeVoos = 544;
		int id = 56789;
		long pontosAcumulados = 3_234_133_578L; //usar L no final pra indicar long

	//tipos numeros reais
		float salario = 11_445.44F;  //indicar o F no final p/ float
		double vendasAcumuladas= 2_995_797_103.50;
		
			
		//tipo booleano
		boolean estaDeFerias = true;  //false
		
		//tipo caractere
		char status = 'A';
		
		//dias de empresa
		System.out.println(anosDeEmpresa * 365);
		
		//numeros de viagens
		System.out.println(numerodeVoos / 2);
		
		//pontos por real
		System.out.println(pontosAcumulados / vendasAcumuladas);
		
		System.out.println(id + ": ganha ->" + salario);
		System.out.println("Ferias?" + estaDeFerias);
		System.out.println("Status" + status);
	}
}
