package app_encapsulamento;

public class Bank {
	private String nome;
	private int conta;
	private double valorDeposito;
	
	public Bank(String nome, int conta, double valorDepositoInicial) {
		setNome(nome);
		this.conta = conta;
		depositar(valorDepositoInicial);
	}
	
	public Bank(String nome, int conta) {
		setNome(nome);
		this.conta = conta;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public int getConta() {
		return conta;
	}
	
	public double getValorDeposito() {
		return valorDeposito;
	}
	
	public void depositar(double valorDeposito) {
		this.valorDeposito += valorDeposito;
	}
	
	public void sacar(double valorSacar) {
		this.valorDeposito -= (valorSacar + 5);
	}
	
	public void alterarNome(String nome) {
		this.nome = nome;
	}
	
	public String toString() {
		return ("Nome: " + getNome() + ", Conta: " + getConta() + ", Deposito: " + getValorDeposito());
	}
}
