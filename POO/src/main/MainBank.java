package main;

import app_encapsulamento.Bank;

import java.util.Scanner;

public class MainBank {
	static void main() {
		Scanner input = new Scanner(System.in);
		
		
		System.out.println("Cadastro de Conta: ");
		System.out.print("Conta: ");
		int conta = input.nextInt();
		
		input.nextLine();
		
		System.out.print("Nome: ");
		String nome = input.nextLine();
		
		System.out.print("Valor: ");
		double valor = input.nextDouble();
		
		Bank cliente1 = new Bank(nome, conta, valor);
		
		cliente1.printDados();
		
		System.out.println("Depositar valor: ");
		double deposito = input.nextDouble();
		cliente1.depositar(deposito);
		
		cliente1.printDados();
		
		System.out.println("Sacar valor: ");
		double saque = input.nextInt();
		cliente1.sacar(saque);
		
		cliente1.printDados();
	}
}
