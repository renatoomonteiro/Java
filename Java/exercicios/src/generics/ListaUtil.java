//Aula 248 - Usando Generics em Métodos

package generics;

import java.util.List;

public class ListaUtil {

	// @SuppressWarnings("rawtypes")
	// Lista de qualquer coisa = <?>
	public static Object getUltimo1(List<?> lista) {
		// Pegar o último elemento de uma lista:
		return lista.get(lista.size() - 1);
	}

	public static <T> T getUltimo2(List<T> lista) {
		return lista.get(lista.size() - 1);
	}
	//Método com mais de um parâmetro genérico:
	public static <A, B, C> C teste(A paramA, B paramB) {
		C teste = null;
		return teste;
	}
}
