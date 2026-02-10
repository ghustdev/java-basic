package entities;

import app_estoque.Products;

import java.util.Scanner;

public class MainProducts {
	static void main() {
		Scanner sc = new Scanner(System.in);
		
		Products p1 = new Products();
		System.out.println("Enter product: ");
		System.out.println("Name: ");
		p1.name = sc.nextLine();
		System.out.println("Price: ");
		p1.price = sc.nextDouble();
		System.out.println("Quantity: ");
		p1.qtd = sc.nextInt();
		
		System.out.println("Datas: ");
		System.out.println(p1.name + ", " +  p1.price + ", " + p1.qtd);
	}
}
