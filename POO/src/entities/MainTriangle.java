package entities;

import app_triangle.Triangle;

import java.util.Scanner;

public class MainTriangle {
	public static void main() {
		Scanner sc = new Scanner(System.in);
		
		Triangle t1, t2; // Objetos do tipo triangle
		// Instancia dos objetos
		t1 = new Triangle();
		t2 =  new Triangle();
		
		System.out.println("Enter the measures of triangle t1: ");
		t1.a = sc.nextDouble();
		t1.b = sc.nextDouble();
		t1.c = sc.nextDouble();
		
		System.out.println("Enter the measures of triangle t2: ");
		t2.a = sc.nextDouble();
		t2.b = sc.nextDouble();
		t2.c = sc.nextDouble();
		
		System.out.println("Area t1: " + t1.Area());
		System.out.println("Area t2: " + t2.Area());
	}
}
