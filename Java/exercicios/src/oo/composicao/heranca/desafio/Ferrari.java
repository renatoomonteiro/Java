package oo.composicao.heranca.desafio;

public class Ferrari extends Carro {
//	Reescrita do método da super classe, com o @Override, 
// com o aumento da velocidade em 15 Km/h, devido ser um carro veloz	
	
	@Override
	public double acelerar() {
		return velocidadeAtual += 15.0;
	}
}
