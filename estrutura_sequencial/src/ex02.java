import java.util.Scanner;

public class ex02 {

	public static void main(String[] args) {
		
		/*
		 * Fa�a um programa para ler o valor do raio de um c�rculo,
		 * e depois mostrar o valor da �rea deste c�rculo com quatro
		 * casas decimais conforme exemplos.
		 * 
		 * F�rmula da �rea: area = tt . raio2
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
