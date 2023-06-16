package entities;

public class Product {
	
	public String name;
	public double price;
	public int quantity;
	
	// Construtor
	public Product(String name, double price, int quantity) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}
	
	// Metodos
	public double totalValueInStock() {
		return quantity * price;
	}
	
	public void addProducts(int quantity) {
		this.quantity += quantity;
	}
	
	public void removeProducts(int quantity) {
		this.quantity -= quantity;
	}
	
	public String toString() {
		return String.format("%s, $ %.2f, %d units, Total: $ %.2f",
				name, price, quantity, totalValueInStock());
	}
}
