package entities;

public class Rectangle {

	public double width;
	public double height;
	
	public double area() {
		return this.width * this.height;
	}
	
	public double perimeter() {
		return this.height * 2 + this.width * 2;
	}
	
	public double diagonal() {
		return Math.sqrt( (Math.pow(width, 2)) + (Math.pow(height, 2)) );
	}
	
	public String toString() {
		return String.format("AREA = %.2f%n"
				+ "PERIMETER = %.2f%n"
				+ "DIAGONAL = %.2f%n", area(), perimeter(), diagonal());
	}
}
