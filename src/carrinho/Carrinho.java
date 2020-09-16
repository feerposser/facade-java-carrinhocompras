package carrinho;

public class Carrinho {

	public static void main(String[] args) {
		
		Produto kimono = new Produto("Kimono", 200, CategoriaProduto.getInstance("bjj"));
		Produto tenis = new Produto("Tenis", 100, CategoriaProduto.getInstance("Tenis"));
		Produto camisa = new Produto("Camisa", 50, CategoriaProduto.getInstance("Camisa"));
		
		CarrinhoCompras cc = new CarrinhoCompras();
		
		cc.addProduto(camisa);
		cc.addProduto(tenis);
		cc.addProduto(kimono);
		
		System.out.println("Preco final: " + cc.getPrecoFinal());

	}

}
