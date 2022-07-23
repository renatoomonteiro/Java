package oo.composicao.desafio;

//import oo.composicao.Aluno;

public class Sistema {
//O m�todo main chama todas as classes envolvidas no pacote
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Compra compra1 = new Compra();// Instanciando a classe Compra, atrav�s da vari�vel compra1
//Chamou o primeiro m�todo, que possui a assinatura com tr�s par�metros;
		compra1.adicionarItem("Caneta", 1, 100);
//Chamou o segundo m�todo, que possui a assinatura com dois par�metros, por�m, o primeiro
//foi chamado e instanciou um novo produto, que � o m�todo construtor Produto, da classe Produto
//que recebe o nome do produto e o seu valor, o segundo par�metro � a quantidade, que 
//posteriormente ser� multiplicada pelo valor.
		compra1.adicionarItem(new Produto("Notebook", 2000), 2);

//Instanciando novamente a classe Compra, mas com novos dados, da vari�vel compra2
		Compra compra2 = new Compra();
		compra2.adicionarItem("Caderno", 10, 10);
		compra2.adicionarItem(new Produto("Impressora", 1000), 1);

//Instanciando a classe Cliente, atav�s da vari�vel cliente, passando o nome "Maria Julia Moraes"
//como par�metro

		Cliente cliente = new Cliente("Maria Julia Moraes");
//Chamando o ArrayList de compras, criado na classe cliente, passando os dados da compra1 como 
//par�metro.
		Produto produto = new Produto("Monitor");
		cliente.adcionarCompra(compra1);// Adiciona compra atrav�s do m�todo adicionarCompra da
//classe Cliente

		cliente.compras.add(compra2);// Adiciona compra atrav�s do ArrayList da classe Cliente

		System.out.println(cliente.obterValorTotal());
		System.out.println(cliente.nome);
		System.out.println(produto.nome);

	}

}
