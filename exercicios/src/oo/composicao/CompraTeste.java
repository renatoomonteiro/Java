//Aula 141. Relacionamento Um Pra Muitos
package oo.composicao;

public class CompraTeste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Compra Compra1 = new Compra();
		Compra1.cliente = "Jo�o Pedro";
		Compra1.adicionarItem("Caneta", 20, 7.45);
		Compra1.adicionarItem(new Item("Borracha", 12, 3.89));
		Compra1.adicionarItem(new Item("Caderno", 3, 18.79));

		System.out.println(Compra1.itens.size());
		System.out.println(Compra1.obterValorTotal());
//S� para mostrar a rela��o bidirecional, n�o � utilizado no mercado de trabalho
		double total = Compra1.itens.get(0).compra.itens.get(1).compra.obterValorTotal();
		System.out.println("O total � R$" + total);
	}

}
