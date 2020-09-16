package carrinho;

import java.util.ArrayList;

public class Frete {
	
	ArrayList<Transportadora> transportadoras = new ArrayList<Transportadora>();
	
	public Frete() {
		Transportadora t1 = new Transportadora("Transportes Posser");
		t1.setValores("RS", 50);
		this.transportadoras.add(t1);
	}
	
	public double calculaFrete(String estado) throws Exception {
		for (Transportadora t : this.transportadoras) {
			if (t.transportaPara(estado)) {
				return t.getPreco(estado);
			}
		}
		throw new Exception("Não entrega nesse estado");
	}

}
