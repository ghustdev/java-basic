package main;

import app_encapsulamento.Bank;

import java.util.Scanner;

public class MainBank {
	static void main() {
		Scanner input = new Scanner(System.in);
		
		Bank cliente1;
		
		System.out.println("Cadastro de Conta: ");
		System.out.print("Conta: ");
		int conta = input.nextInt();
		
		input.nextLine();
		
		System.out.print("Nome: ");
		String nome = input.nextLine();
		
		System.out.println("É um depósito inicial? (s/n)");
		if (input.nextLine().equals("s")) {
			cliente1 = new Bank(nome, conta);
		} else {
			System.out.print("Valor: ");
			double valor = input.nextDouble();
			cliente1 = new Bank(nome, conta, valor);
		}
		
		cliente1.toString();
		
		System.out.println("Depositar valor: ");
		double deposito = input.nextDouble();
		cliente1.depositar(deposito);
		
		cliente1.toString();
		
		System.out.println("Sacar valor: ");
		double saque = input.nextInt();
		cliente1.sacar(saque);
		
		cliente1.toString();
	}
}
