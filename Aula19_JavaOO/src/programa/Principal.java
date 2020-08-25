package programa;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Random;
import java.util.Scanner;
import cheques.Cheque;
import clientes.Cliente;
import contas.Conta;
import contas.Corrente;
import contas.Poupanca;

public class Principal {
	public static void main(String[] args) throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Scanner sc = new Scanner(System.in);
		Random random = new Random();
		Conta conta;
		String typeAccount = sc.next().toLowerCase();
		sc.nextLine();
		double saldoInicial = sc.nextDouble();
		
		if (typeAccount.charAt(0) == 'p') {
			conta = new Poupanca(saldoInicial, 0.05);
		}else {
			conta = new Corrente(saldoInicial, 200.00);
		}			
		sc.nextLine();
		Cliente client = new Cliente(random.nextInt(), sc.nextLine(), sc.nextLine(), sc.nextLine(), conta);
		System.out.print("Digite o valor do depósito: ");
		conta.depositar(sc.nextDouble());
		sc.nextLine();
		if (conta instanceof Corrente) {
			double valor = sc.nextDouble();
			sc.nextLine();
			((Corrente) conta)
					.depositarCheque( new Cheque( valor, sc.nextLine(), sdf.parse(sc.nextLine())));
		}
		conta.sacar(sc.nextDouble());
		System.out.println(conta);
		
		sc.close();
	}
}
