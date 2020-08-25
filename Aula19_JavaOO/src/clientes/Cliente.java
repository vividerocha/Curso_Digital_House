package clientes;

import contas.Conta;

public class Cliente {
//um número de cliente, um sobrenome, um número de RG e um CPF.
	private Integer numero;
	private String sobrenome;
	private String rg;
	private String cpf;
	private Conta conta;
	
	public Cliente() {
		
	}
	
	public Cliente(Integer numero, String sobrenome, String rg, String cpf, Conta conta) {
		this.numero = numero;
		this.sobrenome = sobrenome;
		this.rg = rg;
		this.cpf = cpf;
		this.conta = conta;
	}
	public Integer getNumero() {
		return numero;
	}
	public void setNumero(Integer numero) {
		this.numero = numero;
	}
	public String getSobrenome() {
		return sobrenome;
	}
	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}
	public String getRg() {
		return rg;
	}
	public void setRg(String rg) {
		this.rg = rg;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public Conta getConta() {
		return conta;
	}
	public void setConta(Conta conta) {
		this.conta = conta;
	}
	@Override
	public String toString() {
		return "Cliente [numero=" + numero + ", sobrenome=" + sobrenome + ", rg=" + rg + ", cpf=" + cpf + ", conta="
				+ conta + "]";
	}
	
	
}