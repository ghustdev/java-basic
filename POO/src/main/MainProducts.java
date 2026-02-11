package main;

import app_estoque.Products;

import java.util.Scanner;

public class MainProducts {
	static void main() {
		Scanner sc = new Scanner(System.in);
		
		// Construtor padrão - deve vir após as informações definidas
		// Products p1 = new Products();
		
		System.out.println("Enter product: ");
		System.out.println("Name: ");
		String name = sc.nextLine();
		System.out.println("Price: ");
		double price = sc.nextDouble();
		System.out.println("Quantity: ");
		int qtd = sc.nextInt();
		
		Products p1 = new Products(name, price, qtd);
		
		System.out.println("Datas: ");
		System.out.println(p1.name + ", " +  p1.price + ", " + p1.qtd);
		System.out.println(p1.toString());
	}
}
