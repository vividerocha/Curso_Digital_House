package contas;
import cheques.Cheque;

public class Corrente extends Conta{
	private Double limiteChequeEspecial;
	
	public Corrente() {
		
	}
	public Corrente(Double saldo, Double limiteChequeEspecial) {
		super(saldo);
		this.limiteChequeEspecial = limiteChequeEspecial;
	}
	public Double getLimiteChequeEspecial() {
		return limiteChequeEspecial;
	}
	public void setLimiteChequeEspecial(Double limiteChequeEspecial) {
		this.limiteChequeEspecial = limiteChequeEspecial;
	}
	
	//Sacar dinheiro: o cliente pode sacar dinheiro e, caso não tenha saldo
	//suficiente, usar seu cheque especial.
	//Saldo - Valor - Limite = 200
	//100 - 80 = 20
	//100 - 120 = -20 = 180
	//100 - 320 =
	@Override
	public void sacar(double valor) {
		double limite = getSaldo() - valor;
		
		if((limite + limiteChequeEspecial) < 0) {
			System.out.println("Você superou seu limite de saque incluindo o Cheque Especial!");
		}else {
			super.sacar(valor);			
			if(limite < 0) {
				limiteChequeEspecial = limiteChequeEspecial + limite;
			}
		}
	}
	
	//Depositar cheques: o cliente pode depositar cheques. Um cheque tem
	//um valor, um banco emissor e uma data de pagamento.
	public void depositarCheque(Cheque cheque) {
		depositar(cheque.getValor());
	}
	
	@Override
	public String toString() {
		return "ContaCorrente [limiteChequeEspecial=" + limiteChequeEspecial + ", getSaldo()=" + getSaldo() + "]";
	}
	
}