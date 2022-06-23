package oo.composicao.heranca.desafio.resposta;

public class Ferrari extends Carro {
//Chamada do construtor padrão, sem informar o parâmetro.
	Ferrari() {
		super(315);
	}
//Chamada do construtor padrão, com o parâmetro informado
	Ferrari(int velocidadeMaxima) {
		super(velocidadeMaxima); 
		//Alteração da variável delta, de 5 para 15
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
