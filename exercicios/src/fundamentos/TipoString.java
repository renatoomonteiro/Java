package fundamentos;

public class TipoString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Olá pessoal!".charAt(2));
//charAt percorre o índice da string de acordo com o 
//parâmetro.

		String s = "Boa tarde";
		s = s.toUpperCase();
//System.out.println(s);
		System.out.println(s.concat("!!!"));
		System.out.println(s + "!!!");
		System.out.println(s.startsWith("BOA"));
		System.out.println(s.startsWith("Boa"));
//Verifica se começa com Boa, resultado boolean
		System.out.println(s.endsWith("TARDE"));
//Verifica se termina com..., de acordo com o parâmetro
		System.out.println(s.length());
//Retorna um número inteiro com o tamanho da string
		System.out.println(s.equals("boa tarde"));
//Comparação de igualdade de string
		System.out.println(s.equalsIgnoreCase("Boa tarde"));
//Comparação de igualdade de string independente 
//se são maiúsculas ou minúsculas

		var nome = "Pedro"; // vaiáveis com Inferência
		var sobrenome = "Santos";
		var idade = 33;
		var salario = 1234.987;

		String maisUmaFrase = "Nome: " + nome + " Sobrenome: " + sobrenome + " Idade: " + idade + " Salário " + salario
				+ "\n\n";
		/*
		 * \n = pula linha; %s = chama string; %d = chama double; %f = chama float; %.2f
		 * = chama float com duas casas decimais; %.2d = chama double com duas casas
		 * decimais;
		 * 
		 */

		System.out.println("Nome: " + nome + " Sobrenome: " + sobrenome + " Idade: " + idade + " Salário " + salario);
//System.out.printf("Nome: %s %s " , nome, sobrenome);
//%s = chama a variável do tipo string
		System.out.printf("O senhor %s %s tem %d anos e ganha R$ %.2f\n", nome, sobrenome, idade, salario);
		String frase = String.format("O senhor %s %s tem %d anos e ganha R$ %.2f", nome, sobrenome, idade, salario);
//String.format
		System.out.println(frase);
		System.out.println(maisUmaFrase);

		System.out.println("Frase qualquer\n".contains("Frase"));
		// Verifica se contém a palavra "Frase" na string, retorno boolean
		System.out.println("Frase qualquer\n".indexOf("qual"));
		// Verifica qual a posição no array de string está a palavra qual
		System.out.println("Frase qualquer\n".substring(6));
		// Verifica qual palavra inicia na posição 6
		System.out.println("Frase qualquer\n".substring(6, 8));
		// Verifica qual palavra inicia na posição 6 e termina na posição 8

	}

}
