package estruturas_repetitivas;

import java.util.Scanner;

public class Funcoes_aula60 {

	public static void main(String[] args) {
		// Fazer um programa para ler tres numeros inteiros e mostrar na tela o maior deles.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Three Numbers:");
		
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		int n3 = sc.nextInt();
		
		int maior = higher(n1, n2, n3);
		
		showResult(maior);
		
		sc.close();
	}
	
	public static int higher(int a, int b, int c) {
		
		int x = 0;
		
		if(a > b && a > c) {
			x = a;
		}
		else if(b > c) {
			x = b;
		}
		else {
			x = c;
		}
		
		return x;
	}
	
	public static void showResult(int value) {
		
		System.out.println("Higher = " + value);
		
	}

}
