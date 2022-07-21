//Aula 219 - Exce��o Personalizada #01

package excecao.personalizadaA;

@SuppressWarnings("serial")
public class NumeroNegativoException extends RuntimeException {

	private String nomeDoAtributo;

	public NumeroNegativoException(String nomeDoAtributo) {
		this.nomeDoAtributo = nomeDoAtributo;
	}

	public String getMessage() {
		return String.format("O atributo '%s' est� negativo ", nomeDoAtributo);
	}

}
