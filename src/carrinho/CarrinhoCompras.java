package carrinho;

import java.util.ArrayList;

public class CarrinhoCompras {
	
	private ArrayList<Produto> produtos = new ArrayList<Produto>();
	private String estado = "RS";
	private Frete frete = new Frete();
	private Promocao promocoes;
	
	public CarrinhoCompras() {
		CategoriaProduto tenis = CategoriaProduto.getInstance("Tenis");
		CategoriaProduto bjj = CategoriaProduto.getInstance("bjj");
		promocoes = new Promocao(tenis, bjj);
	}
	
	public void addProduto(Produto produto) {
		this.produtos.add(produto);
	}
	
	private double calculaFrete() {
		try {
			return this.frete.calculaFrete(this.estado);
		} catch (Exception e) {
			e.printStackTrace();
			return 0;
		}
	}
	
	private double calculaProduto(Produto produto) {
		double promocao = this.promocoes.getPromocao(produto.getCategoriaProduto());
		double precoProduto = produto.getPreco();
		if (promocao > 0) {
			double desconto = (promocao / 100) * precoProduto;
			precoProduto -= desconto;
			System.out.println("Preço de: " + produto.getNome() + 
					":" + produto.getPreco());
			System.out.println("preço final: " + 
					precoProduto + " com %" + 
					this.promocoes.getPromocao(produto.getCategoriaProduto()) + "\n");
		}
		return precoProduto;
	}
	
	private double calculaProdutos() {
		double precoTotal = 0;
		for (Produto p : this.produtos) {
			precoTotal += this.calculaProduto(p);
		}
		return precoTotal;
	}
	
	public double getPrecoFinal( ) {
		return this.calculaFrete() + this.calculaProdutos();
	}

}
