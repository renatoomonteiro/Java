package oo.composicao.encapsulamento.casaB;

import oo.composicao.encapsulamento.casaA.Ana;

public class Pedro extends Ana{

	void testeAcessos() {
		// segredo
		// facoDentroDeCasa
		// formaDeFalar
		// todosSabem
		// System.out.println(esposa.segredo); <- A classe Paulo
		// não consegue enxergar a variável segredo, pois é privado da classe Ana.

		Ana mae = new Ana();
		
		
		//System.out.println(mae.segredo);
		//System.out.println(mae.facoDentroDeCasa);

		
		//A variável formaDeFalar é acesível por herança
		System.out.println(formaDeFalar);
		//Duas formas de acessar a variável pública
		System.out.println(mae.todosSabem);		
		System.out.println(new Ana().todosSabem);
	}

}
