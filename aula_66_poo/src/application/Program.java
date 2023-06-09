package application;

import java.util.Scanner;

import entities.Product;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Product product = new Product();
		
		System.out.println("Enter product data:");
		System.out.print("Name: ");
		product.setName(sc.next());
		System.out.print("Price: ");
		product.setPrice(sc.nextDouble());
		System.out.print("Quantity in stock: ");
		product.setQuantity(sc.nextInt());
		System.out.println();
		
		System.out.println(product.toString());
		System.out.println();
		
		System.out.print("Enter the number of products to be added in stock: ");
		product.addProducts(sc.nextInt());
		System.out.println();
		
		System.out.println(product.toString());
		System.out.println();
		
		System.out.print("Enter the number of products to be removed from stock: ");
		product.removeProducts(sc.nextInt());
		System.out.println();
		
		System.out.println(product.toString());
		
		sc.close();
	}

}
