package entities;

public class Product {
	
	// Atributos
	private String name;
	private double price;
	private int quantity;
	
	// Getters
	public String getName() {
		return this.name;
	}
	
	public double getPrice() {
		return this.price;
	}
	
	public int getQuantity() {
		return this.quantity;
	}
	
	// Setters
	public void setName(String n) {
		this.name = n;
	}
	
	public void setPrice(double p) {
		this.price = p;
	}
	
	public void setQuantity(int q) {
		this.quantity = q;
	}
	
	// Metodos Publicos
	public double totalValueInStock() {
		return this.quantity * this.price;
	}
	
	public void addProducts(int quantity) {
		this.quantity += quantity;
	}
	
	public void removeProducts(int quantity) {
		this.quantity -= quantity;
	}
	
	public String toString() {
		return "Product data: "
				+ this.name
				+ ", $ "
				+ String.format("%.2f", this.price)
				+ ", "
				+ this.quantity
				+ " units, Total: $ "
				+ String.format("%.2f", totalValueInStock());
	}
}
