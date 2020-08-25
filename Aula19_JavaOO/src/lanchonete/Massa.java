package lanchonete;

public class Massa extends Lanche{

	private TiposMassa tipoMassa;
	private String molho;
		
	public Massa() {
		
	}
	public Massa(Double preco, TiposMassa tipoMassa, String molho) {
		super(preco);
		this.molho = molho;
		this.tipoMassa = tipoMassa;
	}

	public TiposMassa getTipoMassa() {
		return tipoMassa;
	}

	public void setTipoMassa(TiposMassa tipoMassa) {
		this.tipoMassa = tipoMassa;
	}

	public String getMolho() {
		return molho;
	}

	public void setMolho(String molho) {
		this.molho = molho;
	}
	
	@Override
	public Double retornaTempoEntrega(Double distancia) {
		return super.retornaTempoEntrega(distancia) + 30;
	}
	
	@Override
	public String toString() {
		return "Massa [tipoMassa=" + tipoMassa + ", molho=" + molho + "]"
				+ "\n Preço: " + getPreco();
	}

}
