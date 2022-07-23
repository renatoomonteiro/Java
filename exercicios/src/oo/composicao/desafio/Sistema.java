package oo.composicao.desafio;

//import oo.composicao.Aluno;

public class Sistema {
//O método main chama todas as classes envolvidas no pacote
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Compra compra1 = new Compra();// Instanciando a classe Compra, através da variável compra1
//Chamou o primeiro método, que possui a assinatura com três parâmetros;
		compra1.adicionarItem("Caneta", 1, 100);
//Chamou o segundo método, que possui a assinatura com dois parâmetros, porém, o primeiro
//foi chamado e instanciou um novo produto, que é o método construtor Produto, da classe Produto
//que recebe o nome do produto e o seu valor, o segundo parâmetro é a quantidade, que 
//posteriormente será multiplicada pelo valor.
		compra1.adicionarItem(new Produto("Notebook", 2000), 2);

//Instanciando novamente a classe Compra, mas com novos dados, da variável compra2
		Compra compra2 = new Compra();
		compra2.adicionarItem("Caderno", 10, 10);
		compra2.adicionarItem(new Produto("Impressora", 1000), 1);

//Instanciando a classe Cliente, atavés da variável cliente, passando o nome "Maria Julia Moraes"
//como parâmetro

		Cliente cliente = new Cliente("Maria Julia Moraes");
//Chamando o ArrayList de compras, criado na classe cliente, passando os dados da compra1 como 
//parâmetro.
		Produto produto = new Produto("Monitor");
		cliente.adcionarCompra(compra1);// Adiciona compra através do método adicionarCompra da
//classe Cliente

		cliente.compras.add(compra2);// Adiciona compra através do ArrayList da classe Cliente

		System.out.println(cliente.obterValorTotal());
		System.out.println(cliente.nome);
		System.out.println(produto.nome);

	}

}
