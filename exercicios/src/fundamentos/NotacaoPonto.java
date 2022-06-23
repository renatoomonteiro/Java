package fundamentos;

public class NotacaoPonto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "Bom dia x";
		
		s = s.replace("X", "Senhora");//Altera o dado
		s = s.toUpperCase();//Passa para maiúsculo
		s = s.concat(" !!!");
		// a notação ponto habilita
		//propriedades da variável, 
		//nesse caso, passará tudo para o maiúsculo
		//Também funcionará no syso
		System.out.println(s);
		
		String x = "Renato".toUpperCase();
		System.out.println(x);
		
		String y = "Bom dia X".
				replace("X", "Gabriel").toUpperCase()
				.concat(" !!!");
		System.out.println(y);
		//Tipos primitivos não possuem o operador ponto
		//".", apenas o próprio valor
		int a = 3;
		System.out.println(a);
		
	}

}
