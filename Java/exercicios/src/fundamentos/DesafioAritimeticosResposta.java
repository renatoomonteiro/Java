package fundamentos;

public class DesafioAritimeticosResposta {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double numA = Math.pow(6 * (3 + 2), 2);
		double denA = 3 * 2;

		double numB = (1 - 5) * (2 - 7);
		double denB = 2;

		double superiorA = numA / denA;
		double superiorB = Math.pow(numB / denB, 2);

		double superior = Math.pow(superiorA - superiorB, 3);
		double inferior = Math.pow(10, 3);

		double resultado = superior / inferior;
		System.out.println("O resultado � " + resultado);

	}

}
