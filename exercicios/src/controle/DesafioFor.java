package controle;

public class DesafioFor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		String valor = "#";
//		for (int i = 1; i <= 10; i++) {
//			System.out.println(valor);
//			valor+"#";
//		}
		//Versão do desafio
		//Não utilizar o valor numérico para controlar o laço
		
		for (String v = "#"; !v.equals("#######"); v+= "#")
			System.out.println(v);
	}
}
