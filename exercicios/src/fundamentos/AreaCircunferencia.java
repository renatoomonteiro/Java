package fundamentos;

public class AreaCircunferencia {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double raio = 3.4;
		final double PI = 3.14159;
		//final define uma constante.
		double area = PI*raio*raio;
		// separador de casas decimais é o ponto = .
		System.out.println(area);
		raio=10;
		area=PI*raio*raio;
		System.out.println("Área = "+ area + " m2");
		
	}

}
