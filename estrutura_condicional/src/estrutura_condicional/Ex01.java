package estrutura_condicional;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		// Fazer um programa para ler um n�mero inteiro e depois dizer se este n�mero � negativo ou n�o.
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		if(n >= 0) {
			System.out.println("NAO NEGATIVO");
		} else {
			System.out.println("NEGATIVO");
		}
		
		sc.close();
	}

}
