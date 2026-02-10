package app_estoque;

public class Products {
	public String name;
	public double price;
	public int qtd;
	
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
}
