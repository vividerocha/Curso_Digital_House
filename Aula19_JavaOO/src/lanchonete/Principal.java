package lanchonete;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Principal {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		
		Integer opcao;
		
		do {
			System.out.println("Bem Vindo! MENU!");
			System.out.println("[ 0 ] SAIR");
			System.out.println("[ 1 ] SANDUICHES");
			System.out.println("[ 2 ] MASSAS");
			System.out.println("[ 3 ] BOLOS");
			System.out.println("Escolha uma opção!");
			opcao = sc.nextInt();
			switch (opcao) {
				case 1:
					montaSanduiche();
					break;
				case 2:
					montaMassa();
					break;
				case 3:
					montaBolo();
					break;
			}
		}while(opcao != 0);

		System.out.println("ENCERRANDO O PROGRAMA!");
	}

	public static void montaSanduiche() {
		Double preco = 15.0;
		List<String> ingredientes = new ArrayList<String>();
		
		for(int i = 0; i < 10; i++) {
			System.out.println("Ingrediente " + (i + 1) + " :");
			ingredientes.add(sc.next());
		}
		Sanduiche sanduiche = new Sanduiche(preco, ingredientes);
		System.out.println("PEDIDO: " + sanduiche.toString());
		distancia(sanduiche);
	}

	public static void montaMassa() {
		Double preco = 20.0;
		Integer tipoMassa;
		System.out.println("[ 0 ] ENCERRA O PROGRAMA ");
		System.out.println("[ 1 ] MACARRÃO ");
		System.out.println("[ 2 ] PIZZA ");
		System.out.println("[ 3 ] LASANHA ");
		System.out.println("Escolha um tipo de Massa:");
		tipoMassa = sc.nextInt();
		
		do {
			if(tipoMassa > 0 && tipoMassa < 4) {
				System.out.println("Molho:");
				String molho = sc.next();
				Massa massa;
				
				switch(tipoMassa) {
					case 1:
						massa = new Massa(preco, TiposMassa.MACARRAO, molho);
						System.out.println("PEDIDO: " + massa.toString());
						distancia(massa);
						break;
					case 2:
						massa = new Massa(preco, TiposMassa.PIZZA, molho);
						System.out.println("PEDIDO: " + massa.toString());
						distancia(massa);
						break;
					case 3:
						massa = new Massa(preco, TiposMassa.LASANHA, molho);
						System.out.println("PEDIDO: " + massa.toString());
						distancia(massa);
						break;
				}
				
				break;
			}else {
				System.out.println("ESCOLHA UM ITEM DO MENU!");
			}
		}while(tipoMassa != 0);
	}

	public static void montaBolo() {
		Double preco = 20.0;
		
		System.out.println("Massa: ");
		String massa = sc.next();
		
		System.out.println("Recheio: ");
		String recheio = sc.next();
		
		System.out.println("Cobertura: ");
		String cobertura = sc.next();
		
		Bolo bolo = new Bolo(preco, massa, recheio, cobertura);
		System.out.println("PEDIDO: " + bolo.toString());
		distancia(bolo);
		
	}

	public static void distancia(Lanche lanche) {
		System.out.println("Digite a distância:");
		Double tempoEntrega = lanche.retornaTempoEntrega(sc.nextDouble());
		System.out.println(retornaTempo(tempoEntrega));
	}
	
	public static String retornaTempo(Double tempo) {
		long valor = tempo.longValue();
		long minutos = valor % 60;
		long horas = (valor - minutos) / 60;
		return "Tempo estimado de entrega: " + horas + " horas e " + minutos + " minutos";
	}
	

}
