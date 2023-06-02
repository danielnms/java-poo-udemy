import java.util.Scanner;

public class ex02 {

	public static void main(String[] args) {
		
		/*
		 * Faça um programa para ler o valor do raio de um círculo,
		 * e depois mostrar o valor da área deste círculo com quatro
		 * casas decimais conforme exemplos.
		 * 
		 * Fórmula da área: area = tt . raio2
		 * Considere o valor de pi = 3.14159 
		 */
		
		Scanner sc = new Scanner(System.in);
		
		// Entrada
		double pi = 3.14159;
		double raio = sc.nextDouble();
		
		// Processamento
		double area = pi * Math.pow(raio, 2);
		
		// Saida
		System.out.printf("A=%.4f", area);
		
		sc.close();

	}

}
