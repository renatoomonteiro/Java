//Aula 245 - Exemplo Básico COM Generics

package generics;

//Classe genérica que pode guardar dados de vários tipos: String, Double, Inteiro, Object, etc.
public class Caixa<T> {
	private T coisa;

	public void guardar(T coisa) {
		this.coisa = coisa;
	}

	public T abrir() {
		return coisa;
	}
}
