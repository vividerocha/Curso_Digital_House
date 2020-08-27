package impressora;

public class Foto implements Imprimivel {

	private String nome;
	private String tipo;
	
	public Foto() {
		// TODO Auto-generated constructor stub
	}
	
	public Foto(String nome, String tipo) {
		this.nome = nome;
		this.tipo = tipo;
	}

	
	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getTipo() {
		return tipo;
	}


	public void setTipo(String tipo) {
		this.tipo = tipo;
	}


	public void imprimir() {
		System.out.println(this.toString());
	}
	
	@Override
	public String toString() {
		return "Sou uma selfie" +
				"\n Foto [nome=" + nome + ", tipo=" + tipo + "]";
	}
}
