//Aula 248 - Usando Generics em M�todos

package generics;

import java.util.Arrays;
import java.util.List;

public class ListaUtilTeste {
	public static void main(String[] args) {
		List<String> langs = Arrays.asList("JS", "PHP", "Java", "C#");
		List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6);

		// Utiliza��o do m�todo getUltimo1, contido na classe ListaUtil
		String ultimaLinguagem1 = (String) ListaUtil.getUltimo1(langs);
		System.out.println(ultimaLinguagem1);

		Integer ultimoNumero1 = (Integer) ListaUtil.getUltimo1(nums);
		System.out.println(ultimoNumero1);

		//Nos dois casos abaixo, n�o precisa fazer a convers�o cast
		String ultimaLinguagem2 = ListaUtil.getUltimo2(langs);
		System.out.println(ultimaLinguagem2);

		Integer ultimoNumero2 = ListaUtil.getUltimo2(nums);
		System.out.println(ultimoNumero2);
	}
}
