package controle;

public class DesafioFor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		String valor = "#";
//		for (int i = 1; i <= 10; i++) {
//			System.out.println(valor);
//			valor+"#";
//		}
		//Vers�o do desafio
		//N�o utilizar o valor num�rico para controlar o la�o
		
		for (String v = "#"; !v.equals("#######"); v+= "#")
			System.out.println(v);
	}
}
