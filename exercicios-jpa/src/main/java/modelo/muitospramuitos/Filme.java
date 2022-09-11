//Aula 351 - Muitos Pra Muitos #02

package modelo.muitospramuitos;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "filmes")
public class Filme {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String nome;

	private Double nota;

	@ManyToMany(cascade = CascadeType.PERSIST)
	@JoinTable(
			name = "atores_filmes",
			joinColumns = @JoinColumn(name="filme_id", referencedColumnName = "id"),
			inverseJoinColumns = @JoinColumn(name="ator_id", referencedColumnName = "id")
			)
	private List<Ator> atores;
	
	public Filme() {
	
	}

	public Filme(String nome, Double nota) {
		super();
		this.nome = nome;
		this.nota = nota;
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

	public Double getNota() {
		return nota;
	}

	public void setNota(Double nota) {
		this.nota = nota;
	}

	public List<Ator> getAtores() {
		//Se atores for nulo
		//retorne uma lista vazia
		if(atores == null) {
			atores = new ArrayList<>();
		}
		return atores;
	}

	public void setAtores(List<Ator> atores) {
		this.atores = atores;
	}
	
	//Método que irá adicionar um ator
	public void adicionarAtor(Ator ator) {
		//Se ator for diferente de nullo e getAtores não contiver ator
		if(ator != null && !getAtores().contains(ator)) {
			//getAtores adiciona ator
			getAtores().add(ator);
			//Se o ator não estiver no filme atual, então adiciona o filme
			if(!ator.getFilmes().contains(this)) {
				ator.getFilmes().add(this);
			}
		}
	}	
}