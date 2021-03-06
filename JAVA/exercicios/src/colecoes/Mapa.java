package colecoes;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Mapa {
	public static void main(String[] args) {
		
		Map<Integer, String> usuarios = new HashMap<Integer, String>(); 
		
		//adiciona usando .put porem ele substitui com ultimo valor na msm id
		usuarios.put(10, "Carlos");
		usuarios.put(20, "Ricardo");
		usuarios.put(30, "Ronaldo");
		usuarios.put(40, "Dayana");
		usuarios.put(50, "Gustavo");
		
		System.out.println(usuarios); //mostra os dados do obj
		
		System.out.println(usuarios.size());  //quantas chaves tem
		System.out.println(usuarios.isEmpty()); //pergunta se esta vazio
		
		
		//.keySet mostra o conjunto das chaves
		System.out.println(usuarios.keySet());
		
		System.out.println(usuarios.values()); //vai mostras os valores dentro
		System.out.println(usuarios.entrySet()); //mostra as chaves e os valores juntos
		
		System.out.println(usuarios.containsKey(50)); //pergunta se tem a chave 50  //ret true ou false
		System.out.println(usuarios.containsValue("Dayana")); //pergunta se tem a string Dayana
		
		System.out.println(usuarios.get(4)); //retorna o valor dentro da memoria 4
		
		//percorrendo chaves //retorna os numeros das chaves dentro(foreach)
		for(int chave: usuarios.keySet()){
			System.out.println(chave);
		}
		//percorrendo os valores dentro das chaves (foreach)
		for(String valor: usuarios.values()){
			System.out.println(valor);
		}
		//percorrendo os dois chave e valores ao mesmo tempo
		//Entry = import java map util + fun??o entrySet
		for(Entry<Integer, String> registro: usuarios.entrySet()){
			//System.out.println(registro); mostra todos ou
			System.out.print(registro.getKey() + " => ");
			System.out.println(registro.getValue());
		}
		
	}

}
