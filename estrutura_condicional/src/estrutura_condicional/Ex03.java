package estrutura_condicional;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		/* Leia 2 valores inteiros (A e B). Ap�s, o programa deve mostrar uma mensagem
		 * "Sao Multiplos" ou "Nao sao Multiplos", indicando se os valores lidos s�o
		 * m�ltiplos entre si. Aten��o: os n�meros devem poder ser digitados em ordem
		 * crescente ou decrescente.
		 */

		Scanner sc = new Scanner(System.in);
		
		int a, b;
		
		System.out.print("Valor A: ");
		a = sc.nextInt();
		
		System.out.print("Valor B: ");
		b = sc.nextInt();
		
		if (a % b == 0 || b % a == 0) {
			System.out.println("Sao Multiplos");
		} else {
			System.out.println("Nao sao Multiplos");
		}
		
		sc.close();
	}

}
