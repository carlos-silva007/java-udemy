package controle;

public class SwitchSemBreak {
	public static void main(String[] args) {

		String faixa = "preta";

		switch (faixa.toLowerCase()) {
		case "preta":
			System.out.println("Sei o Bassai-Dai...");
		case "marrom":
			System.out.println("Sei o Tekki Shodan");
		case "roxa":
			System.out.println("sei o Heian Godan");
		case "verde":
			System.out.println("Sei o Heian Yodan");
		case "laranja":
			System.out.println("Sei o Heidan Sadan");
		case "vermelha":
			System.out.println("Sei o Heidan Nidan");
		case "amarela":
			System.out.println("Sei o Heian shodan");
		default:
			System.out.println("Nao sei nada");
		}
		System.out.println("FIM!!!");
		//------------------- outro exemplo-----------------------
		int idade = 5;
		switch (idade) {
		case 3:
			System.out.println("Sabe Falar");
		case 4:
			System.out.println("Sabe Andar");
		case 5:
			System.out.println("Sabe Correr");

		}

	}

}
