package oo.composicao.encapsulamento.casaB;

import oo.composicao.encapsulamento.casaA.Ana;

public class Julia {

	void testeAcessos() {
		Ana sogra = new Ana();

		// Vari�veis inacess�veis � classe Julia,
		// devido o n�vel de visibilidade
		// System.out.println(sogra.segredo);
		// System.out.println(sogra.facoDentroDeCasa);
		// System.out.println(sogra.formaDeFalar);
		System.out.println(sogra.todosSabem);
	}
}
