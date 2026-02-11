package app_encapsulamento;

public class Bank {
	private String nome;
	private int conta;
	private double valorDeposito;
	
	public Bank(String nome, int conta, double valorDeposito) {
		setNome(nome);
		setConta(conta);
		setValorDeposito(valorDeposito);
	}
	
	public Bank(String nome, int conta) {
		setConta(conta);
		setNome(nome);
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
	
	public void setConta(int conta) {
		this.conta = conta;
	}
	
	public double getValorDeposito() {
		return valorDeposito;
	}
	
	public void setValorDeposito(double valorDeposito) {
		this.valorDeposito = valorDeposito;
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
	
	public void printDados() {
		System.out.println("Nome: " + getNome() + ", Conta: " + getConta() + ", Deposito: " + getValorDeposito());
	}
}
