package voadores;

public class Aviao implements Voador {

	private Integer horasVoo;
	
	public Aviao() {
		horasVoo = 0;
	}
	
	public void voar() {
		this.horasVoo += 13;
		System.out.println("Estou voando como um avi�o / Horas de Voo : " + this.horasVoo);
	}

}
