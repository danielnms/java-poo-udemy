import java.util.Scanner;

public class ex05 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
			
		// Entrada
		int cod1, cod2, qtd1, qtd2;
		double valor1, valor2, soma1, soma2, total;
		
		cod1 = sc.nextInt();
		qtd1 = sc.nextInt();
		valor1 = sc.nextDouble();
		
		cod2 = sc.nextInt();
		qtd2 = sc.nextInt();
		valor2 = sc.nextDouble();
		
		// Processamento
		soma1 = qtd1 * valor1;
		soma2 = qtd2 * valor2;
		total = soma1 + soma2;
		
		// Saida
		System.out.printf("Produto: %d Quantidade: %d Valor: R$ %.2f = %.2f%n", cod1, qtd1, valor1, soma1);
		System.out.printf("Produto: %d Quantidade: %d Valor: R$ %.2f = %.2f%n", cod2, qtd2, valor2, soma2);
		System.out.printf("VALOR A PAGAR: R$ %.2f", total);
		
		
		sc.close();

	}

}