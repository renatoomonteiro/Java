package oo.composicao.heranca.teste;

import oo.composicao.heranca.desafio.Ferrari;
import oo.composicao.heranca.desafio.Fusca;

public class CarroTeste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ferrari f = new Ferrari();
		Fusca f2 =  new Fusca();
		
		System.out.println("A velocidade da Ferrari � " + f.acelerar() + " Km/H");
		System.out.println("A Ferrari freou, sua velocidade � " + f.frear() + " Km/H");
		System.out.println("A velocidade da Ferrari � " + f.acelerar() + " Km/H");
		System.out.println("A Ferrari freou, sua velocidade � " + f.frear() + " Km/H");

		
		System.out.println("A velocidade do Fusca � " + f2.acelerar() + " Km/H");
		System.out.println("A Fusca freou, sua velocidade � " + f2.frear() + " Km/H");
		
		
		
	}

}
