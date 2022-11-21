//Aula 428 - Inserir Produto #01
//Aula 435 - Consultando Todos os Produtos
//Aula 436 - Consultando Produtos por ID
//Aula 438 - Alterando o Produto #02
//Aula 439 - Excluindo o Produto por ID
//Aula 440 - Consulta Paginada

package br.com.cod3r.exerciciossb.controllers;

import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.cod3r.exerciciossb.model.entities.Produto;
import br.com.cod3r.exerciciossb.model.repositories.ProdutoRepository;

@RestController
@RequestMapping("/api/produtos")
public class ProdutoController {

	// Injeção de dependência
	// @Autowired insere um objeto em produto
	@Autowired
	private ProdutoRepository produtoRepository;

	// @PostMapping
	// @RequestParam fará com que os parâmetros sejam
	// passados durante a requisição URL
	// @ResponseBody notação que fará parte
	// do corpo da resposta
	// Classe com os parâmetros, não será muito útil
	// se tiver muitos parâmetros
//	public @ResponseBody Produto novoProduto(
//			@RequestParam String nome,
//			@RequestParam double preco,
//			@RequestParam double desconto) {
//		Produto produto = new Produto(nome, preco, desconto);
//		produtoRepository.save(produto);
//		return produto;
//	};

	// Instanciando o objeto sem passar todos os parâmetros
	// O Spring atribui a cada parâmetro de acordo com a requisição
	// adequando a cada atributo
	// A notação @Valid garantirá que o banco aceitará apenas
	// produtos válidos, de acordo com as regras de validação
	// definidas na classe produto
	//@PostMapping
	//Este método do java recebe dois métodos HTTP, o POST e o PUT
	//o que permite INSERIR e ALTERAR dados
	// @PostMapping
	@RequestMapping(method = {RequestMethod.POST, RequestMethod.PUT})
	public @ResponseBody Produto salvarProduto(@Valid Produto produto) {
		produtoRepository.save(produto);
		return produto;
	}

	@GetMapping
	public Iterable<Produto> obterProdutos() {
		return produtoRepository.findAll();
	}

	//Método que consulta o produto apenas com parte do nome
	@GetMapping(path="/nome/{parteNome}")
	public Iterable<Produto> obterProdutosPorNome(@PathVariable String parteNome) {
		//return produtoRepository.findByNomeContainingIgnoreCase(parteNome);
		//Localiza por parte do nome, de acordo com a query definida na
		//classe ProdutoRepository
		return produtoRepository.searchByNameLike(parteNome);
	}
	
	//Consulta paginada
	@GetMapping(path = "/pagina/{numeroPagina}/{qtdePagina}")
	public Iterable<Produto> obterProdutosPorPagina(
			@PathVariable int numeroPagina, @PathVariable int qtdePagina){
		//Validação que não permite mais de cinco elementos por página
		if(qtdePagina>=5) qtdePagina=5;
		//Página 0 com 3 elementos
		Pageable page = PageRequest.of(numeroPagina, qtdePagina);
		return produtoRepository.findAll(page);
	}
	
	@GetMapping(path="/{id}")
	public Optional<Produto> obterProdutoPorId(@PathVariable int id) {
		return produtoRepository.findById(id);
	}
	
//	@PutMapping
//	public Produto alterarProduto(@Valid Produto produto) {
//		produtoRepository.save(produto);
//		return produto;
//	}
	
	//Método DELETE por id
	//basta informar o nº do id na URL, após o /api/produtos
	//Aconselhável utilizar o método de deletar
	//Com flag, com colunas de identificação do usuário, data/hora e IP;
	//para não excluir o dado definitivamente do BD
	@DeleteMapping(path="/{id}")
	public void excluirProduto(@PathVariable int id) {
		produtoRepository.deleteById(id);
	}
}
