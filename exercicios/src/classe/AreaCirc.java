package classe;

public class AreaCirc {

	double raio;
	final static double PI = 3.1415;
//Vari�veis est�ticas, acabam sendo uma CONSTANTE

	AreaCirc(double raioInicial) {
		raio = raioInicial;
	}

	double area() {
		return PI * Math.pow(raio, 2);
	}
	
	static double area(double raio) {
		return PI * Math.pow(raio, 2);		
	}

}
