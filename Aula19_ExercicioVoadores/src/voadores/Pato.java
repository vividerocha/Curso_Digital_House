package voadores;

public class Pato implements Voador {
	
	private Integer energia;

	public Pato() {
		energia = 100;
	}
	
	public void voar() {
		this.energia -= 5;
		System.out.println("Estou voando como um pato / Energia: " + this.energia);
	}

}
