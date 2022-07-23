//Aula 245 - Exemplo B�sico COM Generics

package generics;

//Classe gen�rica que pode guardar dados de v�rios tipos: String, Double, Inteiro, Object, etc.
public class Caixa<T> {
	private T coisa;

	public void guardar(T coisa) {
		this.coisa = coisa;
	}

	public T abrir() {
		return coisa;
	}
}
