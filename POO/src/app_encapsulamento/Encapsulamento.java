package app_encapsulamento;

public class Encapsulamento {
	
	private String name;
	private double price;
	
	// Construtor
	public Encapsulamento(String name, double price) {
		this.name = name;
		this.price = price;
	}
	
	// ENcapsulamto
	static void main() {
		System.out.println("Encapsulamento");
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public double getPrice() {
		return price;
	}
	
	public String getName() {
		return name;
	}
}
