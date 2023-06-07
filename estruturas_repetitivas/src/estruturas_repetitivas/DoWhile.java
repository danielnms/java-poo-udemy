package estruturas_repetitivas;

import java.util.Scanner;

public class DoWhile {

	public static void main(String[] args) {
		/* fazer um programa para ler uma temperatura em Celsius e mostrar
		 * o equivalente em Fahrenheit. Perguntar se o usuario deseja repetir (s/n).
		 * Caso o usuario digite "s", repetir o programa.
		 */

		
		Scanner sc = new Scanner(System.in);
		
		char resp;
		
		do {
			System.out.print("Digite a temperatura em Celsius: ");
			double c = sc.nextDouble();
			double f = 9.0 * c / 5.0 + 32.0;
			System.out.printf("Equivalente em Fahrenheit: %.1f%n", f);
			System.out.print("Deseja repetir (s/n)? ");
			resp = sc.next().charAt(0);
		} while(resp != 'n');

		
		sc.close();
	}

}
