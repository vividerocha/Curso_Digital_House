package cheques;

import java.util.Date;

public class Cheque {
	//Um cheque tem um valor, um banco emissor e uma data de pagamento.
	private Double valor;
	private String banco;
	private Date dataPagamento;
	
	public Cheque() {
		
	}
	public Cheque(Double valor, String banco, Date dataPagamento) {
		this.valor = valor;
		this.banco = banco;
		this.dataPagamento = dataPagamento;
	}
	public Double getValor() {
		return valor;
	}
	public void setValor(Double valor) {
		this.valor = valor;
	}
	public String getBanco() {
		return banco;
	}
	public void setBanco(String banco) {
		this.banco = banco;
	}
	public Date getDataPagamento() {
		return dataPagamento;
	}
	public void setDataPagamento(Date dataPagamento) {
		this.dataPagamento = dataPagamento;
	}
	@Override
	public String toString() {
		return "Cheque [valor=" + valor + ", banco=" + banco + ", dataPagamento=" + dataPagamento + "]";
	}
	
}