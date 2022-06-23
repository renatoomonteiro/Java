package oo.composicao.encapsulamento.casaA;

public class Paulo {

	Ana esposa = new Ana();

	void testeAcessos() {
		// segredo
		// facoDentroDeCasa
		// formaDeFalar
		// todosSabem
		// System.out.println(esposa.segredo); <- A classe Paulo
		// não consegue enxergar a variável segredo, pois é privado da classe Ana.

		System.out.println(esposa.facoDentroDeCasa);
		System.out.println(esposa.formaDeFalar);
		System.out.println(esposa.todosSabem);

		// Para exergar o que há disponível para essa classe,
		// basta digitar esposa. e ver o que o eclipse dá de opção
	}

}
