//Aula 248 - Usando Generics em M�todos

package generics;

import java.util.List;

public class ListaUtil {

	// @SuppressWarnings("rawtypes")
	// Lista de qualquer coisa = <?>
	public static Object getUltimo1(List<?> lista) {
		// Pegar o �ltimo elemento de uma lista:
		return lista.get(lista.size() - 1);
	}

	public static <T> T getUltimo2(List<T> lista) {
		return lista.get(lista.size() - 1);
	}
	//M�todo com mais de um par�metro gen�rico:
	public static <A, B, C> C teste(A paramA, B paramB) {
		C teste = null;
		return teste;
	}
}
