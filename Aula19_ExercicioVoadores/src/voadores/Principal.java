package voadores;

public class Principal {

	public static void main(String[] args) {
		
		
		Pato pato = new Pato();
		Aviao aviao = new Aviao();
		SuperHomem superHomem = new SuperHomem();
		TorreDeControle torre = new TorreDeControle();
		
		torre.adicionarVoador(pato);
		torre.adicionarVoador(aviao);
		torre.adicionarVoador(superHomem);
		torre.voemTodos();

	}

}
