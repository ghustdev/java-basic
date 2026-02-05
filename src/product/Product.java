package product;

public class Product {
	
	private String name;
	private Double price;
	
	// Constructor -> using shorcut Alt + Insert
	public Product(String name, Double price) {
		this.name = name;
		this.price = price;
	}
	
	// Setter
	public void setName(String name) {
		this.name = name;
	}
	
	public void setPrice(Double price) {
		this.price = price;
	}
	
	// Getter
	public String getName() {
		return name;
	}
	
	public Double getPrice() {
		return price;
	}
	
	// Main method
	static void main() {
		System.out.println("Hello World");
	}
}
