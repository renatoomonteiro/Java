package fundamentos;

public class Temperatura {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Modelo da f�rmula do exerc�cio:
		// (�F-32) x 5/9 = � C
		double f = 100.0;
		final double C = 32.0;
		final double FATOR = 5.0 / 9.0;

		System.out.println(f + "�F equivalem a " + (f - C) * FATOR + "�C");
		// ALT+para cima/para baixo, movimenta a linha
		// em que o cursor est�
	}

}
