package fundamentos;

public class NotacaoPonto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "Bom dia x";
		
		s = s.replace("X", "Senhora");//Altera o dado
		s = s.toUpperCase();//Passa para mai�sculo
		s = s.concat(" !!!");
		// a nota��o ponto habilita
		//propriedades da vari�vel, 
		//nesse caso, passar� tudo para o mai�sculo
		//Tamb�m funcionar� no syso
		System.out.println(s);
		
		String x = "Renato".toUpperCase();
		System.out.println(x);
		
		String y = "Bom dia X".
				replace("X", "Gabriel").toUpperCase()
				.concat(" !!!");
		System.out.println(y);
		//Tipos primitivos n�o possuem o operador ponto
		//".", apenas o pr�prio valor
		int a = 3;
		System.out.println(a);
		
	}

}
