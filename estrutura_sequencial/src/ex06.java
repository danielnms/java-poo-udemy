import java.util.Scanner;

public class ex06 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
			
		// Entrada
		double a, b, c,
				tria, circ, trap, quad, retang;
		
		a = sc.nextDouble();
		b = sc.nextDouble();
		c = sc.nextDouble();
		
		// Processamento
		tria = (a * c) / 2.0;
		
		circ = 3.14159 * Math.pow(c, 2);
				
		trap = (a + b) / 2.0 * c;
		
		quad = Math.pow(b, 2);
		
		retang = a * b;
		
		// Saida
		System.out.printf("TRIANGULO: %.3f%n", tria);
		System.out.printf("CIRCULO: %.3f%n", circ);
		System.out.printf("TRAPEZIO: %.3f%n", trap);
		System.out.printf("QUADRADO: %.3f%n", quad);
		System.out.printf("RETANGULO: %.3f%n", retang);
		
		
		sc.close();

	}

}