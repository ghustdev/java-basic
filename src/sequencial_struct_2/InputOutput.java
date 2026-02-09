package sequencial_struct_2;

import java.util.Locale;
import java.util.Scanner;

public class InputOutput {
	
	static void main() {
		Locale.setDefault(Locale.US);
		
		// --- Formated output ---
		int n1 = 10;
		double n2 = 10.07347987184198;
		
		System.out.printf("Number one: %.5f\n", n2);
		System.out.println("Number two: " + n1);
		System.out.printf("Numbers %d and %f\n", n1, n2);
		
		// --- Input ---
		Scanner sc = new Scanner(System.in);
		
		String nome;
		System.out.println("Digite um nome: ");
		// nome = sc.next(); -> Le apenas uma palavra
		nome = sc.nextLine(); // Le a linha inteira
		System.out.println("Nome: " + nome);
		
		System.out.println("Digite um número: ");
		int numero = sc.nextInt();
		System.out.println("Número: " + numero);
		
		System.out.println("Digite um número: ");
		double d = sc.nextDouble();
		System.out.println("Número: " + d);
		
		int s1 = sc.nextInt();
		sc.nextLine(); // Limpar buffer
		String s2 = sc.nextLine();
		char s3 = sc.next().charAt(0);
		
//		System.out.println(s1);
//		System.out.println(s2);
//		System.out.println(s3);
		
		sc.close();
		
		// --- Funções ---
		double m = 3.0;
		double A = Math.pow(m, 2);
		System.out.println("A: " + A);
	}
	
}
