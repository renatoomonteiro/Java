package oo.composicao.heranca.desafio.resposta;

public class Ferrari extends Carro {
//Chamada do construtor padr�o, sem informar o par�metro.
	Ferrari() {
		super(315);
	}
//Chamada do construtor padr�o, com o par�metro informado
	Ferrari(int velocidadeMaxima) {
		super(velocidadeMaxima); 
		//Altera��o da vari�vel delta, de 5 para 15
		delta = 350;		
	}

//	@Override
//	void acelerar() {
////Aumento de velocidade em 15
//		velocidadeAtual += 15;
//		// TODO Auto-generated method stub
//		// super.acelerar();
//	}
}
