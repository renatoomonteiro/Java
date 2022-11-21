//Aula 428 - Inserir Produto #01
//Aula 434 - Aplicando Validações Simples

package br.com.cod3r.exerciciossb.model.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;

//Não esquecer o @Entity para que
//a classe seja mapeada pelo BD
@Entity
public class Produto {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	//A notação @Min(0), garantirá que o
	//valor não poderá ser negativo

	//@NotBlank = Não aceita vazio
	@NotBlank
	private String nome;
	
	@Min(0)
	private double preco;
	
	//As notações @Min(0) e @Max(1), garantirão
	// que o desconto esteja entre 0 e 1.
	@Min(0)
	@Max(1)
	private double desconto; 
	
	public Produto() {

	}

	public Produto(String nome, double preco, double desconto) {
		super();
		this.nome = nome;
		this.preco = preco;
		this.desconto = desconto;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public double getDesconto() {
		return desconto;
	}

	public void setDesconto(double desconto) {
		this.desconto = desconto;
	}

}
