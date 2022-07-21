package classe;

public class Usuario {
	String nome, email;

//Object � a classe m�e em java
	public boolean equals(Object objeto) {

		if (objeto instanceof Usuario) {

			Usuario outro = (Usuario) objeto;

			boolean nomeIgual = outro.nome.equals(this.nome);
			boolean emailIgual = outro.email.equals(this.email);

			return nomeIgual && emailIgual;
		} else {
			return false;
		}
//O hashcode ser� abordado em outra aula!
	}
}
