//Aula 249 - Criando uma Estrutura Chave/Valor com Generics

package generics;

import java.util.LinkedHashSet;
import java.util.Optional;
import java.util.Set;

public class Pares<C extends Number, V> {
	// Set não aceita repetições
	//LinkedHashSet<>() garantirá a ordem de inclusão
	private final Set<Par<C, V>> itens = new LinkedHashSet<>();

	public void adicionar(C chave, V valor) {// Embora o método seja void,
		if (chave == null)
			return;// caso chegue nesse ponto e a chave seja nula, return fará com que saia do
		// método sem que nada seja feito.

		Par<C, V> novoPar = new Par<C, V>(chave, valor);

		if (itens.contains(novoPar)) {
			itens.remove(novoPar);
		}
		itens.add(novoPar);
	}

	public V getValor(C chave) {

		if (chave == null)
			return null;

		Optional<Par<C, V>> parOpcional = itens.stream().filter(par -> chave.equals(par.getChave())).findFirst();
		return parOpcional.isPresent() ? parOpcional.get().getValor() : null;
	}
}
