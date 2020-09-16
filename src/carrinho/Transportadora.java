package carrinho;

import java.util.HashMap;
import java.util.Map;

public class Transportadora {

	private String nome;
	private Map<String, Double> valores = new HashMap<String, Double>();

	public Transportadora(String nome) {
		this.nome = nome;
	}
	
	public boolean transportaPara(String estado) {
		return this.valores.containsKey(estado);
	}
	
	public void setValores(String estado, double custo) {
		valores.put(estado, Double.valueOf(custo));
	}
	
	public double getPreco(String estado) {
		if (valores.containsKey(estado)) {
			return valores.get(estado);
		}
		return 0;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

}
