package classe.desafio;

public class Jantar {
	
	public static void main(String[] args) {
		
		Comida c1 = new Comida("Arroz", 0.180);
		Comida c2 = new Comida("Feijão", 0.300);
		
		Pessoa p = new Pessoa("João", 99.8);
		
		System.out.println(p.apresentar());
		p.comer(c1);
		System.out.println(p.apresentar());
		p.comer(c2);
		
		System.out.println(p.apresentar());
//		double [] a = new double[6];
//		a[0] = 5.6;
//		System.out.println(a[0]);
		
		//double[][] b = new double[3][3]; //Array de 2 dimensões
	}

}
