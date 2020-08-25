package lanchonete;

public abstract class Lanche {

	private Double preco;
	
	public Lanche() {
		
	}
	
	public Lanche(Double preco) {
		this.preco = preco;
	}
	
	
	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}
	
	public Double retornaTempoEntrega(Double distancia) {
		Double tempoEntrega = (distancia * 10);
		return tempoEntrega;
		
	}

}
