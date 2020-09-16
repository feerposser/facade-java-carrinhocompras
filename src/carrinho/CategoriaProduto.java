package carrinho;

import java.util.HashMap;
import java.util.Map;

public class CategoriaProduto {
	
	private String nomeCategoria;
	private static Map<String, CategoriaProduto> instances = new HashMap<String, CategoriaProduto>();

	private CategoriaProduto(String nomeCategoria) {
		this.nomeCategoria = nomeCategoria;
	}
	
	public static CategoriaProduto getInstance(String nomeCategoriaProduto) {
		if (!CategoriaProduto.instances.containsKey(nomeCategoriaProduto)) {
			CategoriaProduto.instances.put(nomeCategoriaProduto, 
					new CategoriaProduto(nomeCategoriaProduto));
		}
		return CategoriaProduto.instances.get(nomeCategoriaProduto);
	}

	public String getNomeCategoria() {
		return nomeCategoria;
	}

	public void setNomeCategoria(String nomeCategoria) {
		this.nomeCategoria = nomeCategoria;
	}
	
	@Override
	public String toString() {
		return this.nomeCategoria;
	}

}
