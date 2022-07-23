package fundamentos;

public class Temperatura {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Modelo da fórmula do exercício:
		// (ºF-32) x 5/9 = º C
		double f = 100.0;
		final double C = 32.0;
		final double FATOR = 5.0 / 9.0;

		System.out.println(f + "ºF equivalem a " + (f - C) * FATOR + "ºC");
		// ALT+para cima/para baixo, movimenta a linha
		// em que o cursor está
	}

}
