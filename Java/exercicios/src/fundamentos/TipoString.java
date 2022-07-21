package fundamentos;

public class TipoString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Ol� pessoal!".charAt(2));
//charAt percorre o �ndice da string de acordo com o 
//par�metro.

		String s = "Boa tarde";
		s = s.toUpperCase();
//System.out.println(s);
		System.out.println(s.concat("!!!"));
		System.out.println(s + "!!!");
		System.out.println(s.startsWith("BOA"));
		System.out.println(s.startsWith("Boa"));
//Verifica se come�a com Boa, resultado boolean
		System.out.println(s.endsWith("TARDE"));
//Verifica se termina com..., de acordo com o par�metro
		System.out.println(s.length());
//Retorna um n�mero inteiro com o tamanho da string
		System.out.println(s.equals("boa tarde"));
//Compara��o de igualdade de string
		System.out.println(s.equalsIgnoreCase("Boa tarde"));
//Compara��o de igualdade de string independente 
//se s�o mai�sculas ou min�sculas

		var nome = "Pedro"; // vai�veis com Infer�ncia
		var sobrenome = "Santos";
		var idade = 33;
		var salario = 1234.987;

		String maisUmaFrase = "Nome: " + nome + " Sobrenome: " + sobrenome + " Idade: " + idade + " Sal�rio " + salario
				+ "\n\n";
		/*
		 * \n = pula linha; %s = chama string; %d = chama double; %f = chama float; %.2f
		 * = chama float com duas casas decimais; %.2d = chama double com duas casas
		 * decimais;
		 * 
		 */

		System.out.println("Nome: " + nome + " Sobrenome: " + sobrenome + " Idade: " + idade + " Sal�rio " + salario);
//System.out.printf("Nome: %s %s " , nome, sobrenome);
//%s = chama a vari�vel do tipo string
		System.out.printf("O senhor %s %s tem %d anos e ganha R$ %.2f\n", nome, sobrenome, idade, salario);
		String frase = String.format("O senhor %s %s tem %d anos e ganha R$ %.2f", nome, sobrenome, idade, salario);
//String.format
		System.out.println(frase);
		System.out.println(maisUmaFrase);

		System.out.println("Frase qualquer\n".contains("Frase"));
		// Verifica se cont�m a palavra "Frase" na string, retorno boolean
		System.out.println("Frase qualquer\n".indexOf("qual"));
		// Verifica qual a posi��o no array de string est� a palavra qual
		System.out.println("Frase qualquer\n".substring(6));
		// Verifica qual palavra inicia na posi��o 6
		System.out.println("Frase qualquer\n".substring(6, 8));
		// Verifica qual palavra inicia na posi��o 6 e termina na posi��o 8

	}

}
