package oo.composicao.encapsulamento.casaB;

import oo.composicao.encapsulamento.casaA.Ana;

public class Pedro extends Ana{

	void testeAcessos() {
		// segredo
		// facoDentroDeCasa
		// formaDeFalar
		// todosSabem
		// System.out.println(esposa.segredo); <- A classe Paulo
		// n�o consegue enxergar a vari�vel segredo, pois � privado da classe Ana.

		Ana mae = new Ana();
		
		
		//System.out.println(mae.segredo);
		//System.out.println(mae.facoDentroDeCasa);

		
		//A vari�vel formaDeFalar � aces�vel por heran�a
		System.out.println(formaDeFalar);
		//Duas formas de acessar a vari�vel p�blica
		System.out.println(mae.todosSabem);		
		System.out.println(new Ana().todosSabem);
	}

}
