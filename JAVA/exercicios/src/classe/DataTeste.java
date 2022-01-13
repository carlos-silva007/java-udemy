package classe;

public class DataTeste {

	public static void main(String[] args) {
		
		Data data01 = new Data();
	

		System.out.println(data01.obterDataFormatada());
		
		Data data02 = new Data(30, 12, 2021);
				
		System.out.println(data02.obterDataFormatada());
		
		data01.imprimirDataFormatada();
		data02.imprimirDataFormatada();
	}

}
