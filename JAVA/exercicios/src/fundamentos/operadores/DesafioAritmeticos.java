package fundamentos.operadores;

public class DesafioAritmeticos {

	public static void main(String[] args) {
		
		//Math.pow eleva o numero
		double numA = Math.pow(6 * (3 + 2), 2);
		double denA = 3 * 2;
		
		double numB = (1 - 5) * (2 - 7);
		double denB = 2;
		
		double superiorA = numA / denA;
		double superiorB = Math.pow(numB / denB, 2);
		
		double superior = Math.pow(superiorA - superiorB, 3);
		double inferior = Math.pow(10, 3);
		
		double resultado = superior / inferior;
		
		System.out.println("O resultado ?: " + resultado);
				
		
	}

}
  // para debugar o codigo, clica duas vezes na barra azul,
//aponta ate qual lugar ele vai debugar o codigo e apos F11 (icone da baratinha)
//e vai apertando F6 que vai passando linha por linha
