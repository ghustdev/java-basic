package main;

import app_converter_utils.CurrancyConverter;

import java.util.Scanner;

public class MainConverter {
	static void main() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o valor do dolar: ");
		double value = sc.nextDouble();
		System.out.println("Digite o valor a pagar: ");
		double price = sc.nextDouble();
		
		System.out.println("Quatia em reais: " + CurrancyConverter.converterDolar(value, price));
	}
}
