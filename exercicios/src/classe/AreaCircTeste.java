package classe;

public class AreaCircTeste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//Atributos em it�lico, s�o da classe, devem ser acessados 
//diretamente, sem a necessidade de inst�ncia.
		
		AreaCirc a1 = new AreaCirc(10);
		a1.raio = 10;

		AreaCirc a2 = new AreaCirc(5);
		a2.raio = 100;
//Acesso ao m�todo pi atrav�s da classe AreaCirc
		//AreaCirc.PI = 3.1415;
		
		System.out.println(a1.area());
		System.out.println(a2.area());
		
		System.out.println(AreaCirc.PI);
		System.out.println(Math.PI);
		
	}

}
