// Aula 338 - Entidade Produto

package modelo.basico;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name = "produtos", schema = "cuso_java")
public class Produto {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	//Definições da coluna da tabela via classe:
	@Column(name = "prod_nome", length = 200, nullable = false)
	private String nome;
	@Column(name = "prod_preco", nullable = false, precision = 11, scale = 2)
	private Double preco;
	
	// Criação do método construtor padrão:
	// ctrl + espaço
	public Produto() {

	}

	// Criação do método utilizando campos
	// Clique direito + source
	public Produto(String nome, Double preco) {
		this.nome = nome;
		this.preco = preco;
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

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}

}
