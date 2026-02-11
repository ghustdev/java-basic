package app_estoque;

public class Products {
	// Instancia de atributos vazios - recebem valozem vazios
	public String name; // null
	public double price; // 0.o
	public int qtd; // 0
	
	// Iniciação onrigatória dos atributos - Construtores
	public Products(String name, double price, int qtd) {
		// this - referencia ao proprio objeto
		this.name = name; // referencia aos atributos la em cima
		this.price = price;
		this.qtd = qtd;
	}
	
	// Sobrecarga - com alterações
	public Products(String name, double price) {
		// this - referencia ao proprio objeto
		this.name = name; // referencia aos atributos la em cima
		this.price = price;
	}
	
	public double totalValueInStock() {
		return price * qtd;
	}
	
	public void addProduct(int qtd) {
		// Auto referencia para o objeto
		this.qtd += qtd;
	}
	
	public void removeProduct(int qtd) {
		this.qtd -= qtd;
	}
	
	// Sobreposição de metodos / polimorfismo
	public String toString() {
		return  "Product data: "+ name + ", $ " + price + ", Quantity: " + qtd + ", Totoal value: " + totalValueInStock();
	}
}
