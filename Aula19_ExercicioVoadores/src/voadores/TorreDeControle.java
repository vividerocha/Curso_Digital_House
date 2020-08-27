package voadores;

import java.util.ArrayList;
import java.util.List;

public class TorreDeControle {

	private List<Voador> voadores = new ArrayList<Voador>();
	
	public TorreDeControle() {
		
	}

	public void voemTodos() {
		for(Voador voador : voadores){ 
			voador.voar(); 
		}
		for(int i = 0; i < this.voadores.size(); i++) {
			
		}
	}
	
	public void adicionarVoador(Voador umVoador) {
		this.voadores.add(umVoador);
	}
}
