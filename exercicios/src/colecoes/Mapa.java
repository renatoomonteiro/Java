//Aula 134. Map - Chave Valor
package colecoes;

import java.util.Map.Entry;
import java.util.HashMap;
import java.util.Map;

public class Mapa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Map<Key, Value>
		Map<Integer, String> usuarios = new HashMap<>();
//Adicionar elementos com o "put"
		usuarios.put(1, "Roberto");
		usuarios.put(2, "Ricardo");
		usuarios.put(3, "Rafaela");
		usuarios.put(4, "Rebeca");

		System.out.println(usuarios.size());
		System.out.println(usuarios.isEmpty());

		System.out.println(usuarios.keySet());// Pegar as chaves
		System.out.println(usuarios.values());// Pegar os valores
		System.out.println(usuarios.entrySet());// Pegar chave e valor

		System.out.println(usuarios.containsKey(1));// Cont�m a chave
		System.out.println(usuarios.containsValue("Roberto"));// Cont�m o valor

		System.out.println(usuarios.get(4)); // Pegar o valor atrav�s da chave
		System.out.println(usuarios.remove(1)); // Remove o usu�rio de chave 1
		System.out.println(usuarios.remove(4, "Gui")); // N�o remove o usu�rio, pis o valor est� diferente
		

		for (int chave : usuarios.keySet()) {// Pegar a chave atrav�s do la�o de for
			System.out.println(chave);
		}

		for (String valor : usuarios.values()) { // Pegar o valor atrav�s do la�o for
			System.out.println(valor);
		}

		for (Entry<Integer, String> registro : usuarios.entrySet()) {
			System.out.print(registro.getKey() + " = ");
			System.out.println(registro.getValue());

		}
	}

}
