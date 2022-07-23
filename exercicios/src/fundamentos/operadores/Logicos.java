package fundamentos.operadores;

public class Logicos {
	public static void main(String[] args) {
		// TODO Auto-generated constructor stub
		boolean condicao1 = true;
		boolean condicao2 = 3 > 7;

		System.out.println("\nCondições");
		System.out.println(condicao1 && condicao2);
// && = and
		System.out.println(condicao1 || condicao2);
// || = or
		System.out.println(condicao1 ^ condicao2);
// ^ = xor (ou exclusivo)
		System.out.println(!condicao1);
// ! = not
		System.out.println(!condicao2);
// ! = not		
		System.out.println("\nOperadores binários");
		//Tabela verdade E
		System.out.println("\nTabela verdade E");
		System.out.println(true && true);
		System.out.println(true && false);
		//System.out.println(false && true);
		//System.out.println(false && false);

		
		//Tabela verdade OU
		System.out.println("\nTabela verdade OU");
		//System.out.println(true || true);
		//System.out.println(true || false);
		System.out.println(false || true);
		System.out.println(false || false);

		//Tabela verdade OU Exclusivo
		System.out.println("\nTabela verdade OU Exclusivo (XOR)");
		System.out.println(true ^ true);
		System.out.println(true ^ false);
		System.out.println(false ^ true);
		System.out.println(false ^ false);
		
		System.out.println("\nOperador unário");
		
		System.out.println("\nTabela verdade NOT");
		System.out.println(!true);
		System.out.println(!false);
		
	}

}
