package classe;

public class ProdutoTeste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Produto p1 = new Produto("Notebook R$", 4356.89);
//A variável p1 faz referência à classe Produto
//p1. acessa as variáveis da classe Produto
		//p1.nome = "Notebook";
		//p1.preco = 4356.89;
		//p1.desconto = 0.25;
//O mesmo ocorre com p2, quando a classe produto é instanciada 
// novamente, com new Produto()
		var p2 = new Produto();
		p2.nome = "Caneta Preta2 R$";
		p2.preco = 12.56;
		
		Produto.desconto = 0.50;

		System.out.println(p1.nome + " " +p1.precoComDesconto());
		System.out.println(p2.nome + " " +p1.precoComDesconto());
//Quando chamar o método com()
		double precoFinal1 = p1.precoComDesconto(0);
		double precoFinal2 = p2.precoComDesconto(0.1);
		double mediaCarrinho = (precoFinal1 + precoFinal2) / 2;

		System.out.printf("Média do carrinho R$ %.2f.", mediaCarrinho);
	}

}
