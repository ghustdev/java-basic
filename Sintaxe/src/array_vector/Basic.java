package array_vector;

import java.util.Scanner;

public class Basic {
	public static void main() {
		// ----- Functions Sintaxe -----
		Scanner  sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		System.out.println(Higher(n, m));
	}
	
	public static int Higher(int a, int b) {
		if (a > b) {
			System.out.println("A > B");
		} else {
			System.out.println("A < B");
		}
		return (a + b);
	}
}
