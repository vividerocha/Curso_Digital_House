package impressora;

public class Documento implements Imprimivel {

	private String nome;
	private String tipo;
	
	public Documento() {
		// TODO Auto-generated constructor stub
	}
	
	public Documento(String nome, String tipo) {
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

	@Override
	public String toString() {
		return "Sou um documento do Word" +
				"\n Documento [nome=" + nome + ", tipo=" + tipo + "]";
	}

	public void imprimir() {
		
	}

}
