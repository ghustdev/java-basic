package app_triangle;

public class Triangle {
	// Declaração de atributos
	public double a;
	public double b;
	public double c;
	
	// Método / Função
	public double Area() {
		double p = (a + b + c) / 2;
		double area = Math.sqrt(p *(p - a) * (p - b) * (p - c));
		return area;
	}
}
