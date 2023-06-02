public class Main {

	public static void main(String[] args) {
		int x;
		double y, b, B, h, area;
		
			//EXEMPLO 1
		x = 5;
		y = 2 * x;
	
		System.out.printf ("%d %.1f%n", x, y);
		System.out.println (y);
		

			//EXEMPLO 2: Cálculo de área de um trapézio
		b = 6.0;
		B = 8.0;
		h = 5.0;
		area = (b + B) / 2.0 * h;
		
		System.out.println (area);
		
	}

}
