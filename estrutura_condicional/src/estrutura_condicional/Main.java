package estrutura_condicional;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		// Declaracoes
		System.out.print("Que horas são: ");
		int hora = sc.nextInt();
		
		// Condicao simples
		if(hora > 0) {
			System.out.println("Olá!");
		}
	
		// Condicao composta
		if(hora < 12) {
			System.out.print("Bom dia!");
		}
		else {
			System.out.println("Boa tarde!");
		}
		
		// Condicao composta encadeada
		if(hora < 12) {
			System.out.println("Bom dia!");
		}
		else if(hora < 18) {
			System.out.println("Boa tarde!");
		}
		else {
			System.out.println("Boa noite!");
		}
	
		sc.close();
	}

}
