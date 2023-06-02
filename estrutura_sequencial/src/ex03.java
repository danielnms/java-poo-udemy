import java.util.Scanner;

public class ex03 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
			
		// Entrada
		int a, b, c, d, dif;
		
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		d = sc.nextInt();
		
		// Processamento
		dif = (a * b - c * d);
		
		// Saida
		System.out.println("DIFERENCA = " + dif);
		
		
		sc.close();

	}

}
