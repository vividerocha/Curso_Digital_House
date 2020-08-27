package impressora;

import java.util.ArrayList;
import java.util.List;

public abstract class Impressora {

	private List<Imprimivel> imprimiveis = new ArrayList<Imprimivel>();
	
	public Impressora() {
		// TODO Auto-generated constructor stub
	}
	
	public Impressora(List<Imprimivel> imprimiveis) {
		this.imprimiveis = imprimiveis;
	}
	
	public void imprimirTudo() {
		for(int i = 0; i < this.imprimiveis.size(); i++) {
			System.out.println("Imprimivel " + (i+1) + " : " + this.imprimiveis.get(i));
		}
	}
	
	public void adicionarImprimivel(Imprimivel umImprimivel) {
		this.imprimiveis.add(umImprimivel);
	}

}
