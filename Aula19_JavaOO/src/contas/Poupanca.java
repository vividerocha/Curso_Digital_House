package contas;

public class Poupanca extends Conta{
	private Double taxaJuros; //0.05
	
	public Poupanca() {
		super();
	}
	public Poupanca(Double saldo, Double taxaJuros) {
		super(saldo);
		this.taxaJuros = taxaJuros;
	}
	public Double getTaxaJuros() {
		return taxaJuros;
	}
	public void setTaxaJuros(Double taxaJuros) {
		this.taxaJuros = taxaJuros;
	}
	
	//Sacar dinheiro: o cliente pode sacar dinheiro desde que não supere seu saldo.
	
	@Override
	public void sacar(double valor) {
		double limite = getSaldo() - valor;
		
		if(limite < 0) {
			System.out.println("Você superou seu limite de saque!");
		}else {
			super.sacar(valor);
		}
	}
	//Recolher juros: o cliente pode recolher os juros mensais aplicados pela
	//sua conta poupança.
	public void recolherJuros() {
		depositar( getSaldo() * taxaJuros );
	}
	
}