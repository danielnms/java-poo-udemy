import java.util.Scanner;

public class ex01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a, b, soma;
		
		// Entrada
		System.out.print("Valor A: ");
		a = sc.nextInt();
		
		System.out.print("Valor B: ");
		b = sc.nextInt();
		
		// Processamento
		soma = a + b;
		
		// Sa�da
		System.out.print("SOMA = " + soma);
		
		sc.close();

	}

}
