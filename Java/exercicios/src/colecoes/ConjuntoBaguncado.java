package colecoes;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoBaguncado {

	@SuppressWarnings({ "unchecked", "rawtypes" })//Supressor de advertências
	public static void main(String[] args) {

		HashSet conjunto = new HashSet();

		conjunto.add(1.2);// converte o tipo primitivo double para uma classe do tipo Double
		conjunto.add(true);// converte o tipo primitivo booleano para uma classe do tipo Boolean
		conjunto.add("Teste"); // A string não precisa, pois já é um objeto
		conjunto.add(1); // Converte int para a classe Integer
		conjunto.add("x"); // converete de char para a classe Caracter

		// Adicionar elementos:
		System.out.println("O tamanho é " + conjunto.size()); // Cinco elementos, ou seja, a quantidade de variáveis do
																// tipo conjunto
		conjunto.add("teste");
		System.out.println("O tamanho é " + conjunto.size()); // Seis elementos, pois teste está com "t" minúsculo, ele
																// não aceita repetições.

		// Remover elementos:
		System.out.println(conjunto.remove("teste")); // Resultado boolean, true para removido e false, para elementos
														// que não estão no conjunto
		System.out.println(conjunto.remove("Teste"));
		System.out.println(conjunto.remove("X"));

		System.out.println("O tamanho é " + conjunto.size());

		System.out.println(conjunto.contains("x"));// Resultado booleano, uma vez que contains verifica se o elemento
													// passado como parâmetro, encontra-se no conjunto
		System.out.println(conjunto.contains(1));
		System.out.println(conjunto.contains(true));

		Set nums = new HashSet();

		nums.add(1); // Adiciona os números ao HashSet Conjunto
		nums.add(2);
		nums.add(3);

		System.out.println(conjunto);
		System.out.println(nums);

		// conjunto.addAll(nums);//União entre conjunto e nums
		conjunto.retainAll(nums); // Intersecção dos conjuntos
		System.out.println(conjunto);

		conjunto.clear();// Limpar
		System.out.println(conjunto);// Exibe vazio

	}

}
