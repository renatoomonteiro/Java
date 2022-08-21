//Aula 341 - Obter Produto

package infra;

import modelo.basico.Produto;

public class ProdutoDAO extends DAO<Produto> {
	
	public ProdutoDAO() {
		super(Produto.class);
	}
}
