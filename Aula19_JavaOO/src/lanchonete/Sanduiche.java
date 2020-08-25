package lanchonete;

import java.util.List;

public class Sanduiche extends Lanche {

	private List<String> ingredientes;
	
	
	public Sanduiche() {
		
	}
	
	public Sanduiche(Double preco, List<String> ingredientes) {
		super(preco);
		this.ingredientes = ingredientes;
	}


	public List<String> getIngredientes() {
		return ingredientes;
	}


	public void setIngredientes(List<String> ingredientes) {
		this.ingredientes = ingredientes;
	}
	
	@Override
	public Double retornaTempoEntrega(Double distancia) {
		return super.retornaTempoEntrega(distancia) + 15;
	}

	@Override
	public String toString() {
		return "Sanduiche [ingredientes=" + ingredientes + "]"
				+ "\n Preço: " + getPreco();
	}
	
	
	
}
