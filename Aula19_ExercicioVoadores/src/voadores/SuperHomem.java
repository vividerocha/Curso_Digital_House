package voadores;

public class SuperHomem implements Voador{

	private Integer experiencia;
	
	public SuperHomem() {
		experiencia = 0;
	}

	public void voar() {
		this.experiencia += 3;
		System.out.println("Estou voando como um campe�o / Experi�ncia : " + this.experiencia);
	}
}
