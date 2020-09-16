package carrinho;

import java.util.ArrayList;

public class Promocao {

	private static ArrayList<Promocao.Promo> promocoes = new ArrayList<Promocao.Promo>();

	private class Promo {
		private CategoriaProduto categoriaProduto;
		private double porcentagem;

		public Promo(CategoriaProduto categoriaProduto, double porcentagem) {
			this.categoriaProduto = categoriaProduto;
			this.porcentagem = porcentagem;
		}

		public CategoriaProduto getCategoriaProduto() {
			return categoriaProduto;
		}

		public void setCategoriaProduto(CategoriaProduto categoriaProduto) {
			this.categoriaProduto = categoriaProduto;
		}

		public double getPorcentagem() {
			return porcentagem;
		}

		public void setPorcentagem(double porcentagem) {
			this.porcentagem = porcentagem;
		}
	}

	public Promocao(CategoriaProduto... categoriaProdutos) {
		for (int i = 0; i <= categoriaProdutos.length - 1; i++) {
			this.promocoes.add(new Promo(categoriaProdutos[i], 20));
		}
	}

	public double getPromocao(CategoriaProduto categoriaProduto) {
		for (Promo promo : this.promocoes) {
			if (promo.getCategoriaProduto() == categoriaProduto) {
				return promo.getPorcentagem();
			}
		}
		return 0;
	}
}
