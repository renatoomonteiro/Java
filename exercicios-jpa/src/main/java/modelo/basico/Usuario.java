//Aula 330 - Entidade Usu�rio

package modelo.basico;

import javax.persistence.Entity;
import javax.persistence.Id;

// A classe e a tabela devem ter o mesmo nome
@Entity
public class Usuario {
	@Id
	private Long id;
	private String nome, email;

	public Usuario() {

	}

	public Usuario(String nome, String email) {
		this.nome = nome;
		this.email = email;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
