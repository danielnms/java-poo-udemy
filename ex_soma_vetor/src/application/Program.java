package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		/* Faça um programa que leia N números reais e armazene-os em um vetor. Em seguida:
		 * - Imprimir todos os elementos do vetor
		 * - Mostrar na tela a soma e a média dos elementos do vetor
		 */
		
		Scanner sc = new Scanner(System.in);
		
		int n;
		double sum, avg;
		
		System.out.print("Quantos numeros voce vai digitar? ");
		n = sc.nextInt();
		double[] vect = new double[n];
		
		for(int i=0; i<vect.length; i++) {
			System.out.print("Digite um numero: ");
			vect[i] = sc.nextDouble();
		}
		
		System.out.println();
		System.out.print("VALORES = ");
		
		for(int i=0; i<vect.length; i++) {
			System.out.print(vect[i] + "  ");
		}
		
		sum = 0.0;
		for(int i=0; i<vect.length; i++) {
			sum += vect[i];
		}
		
		avg = sum / vect.length;
		
		System.out.printf("\nSOMA = %.2f%n", sum);
		System.out.printf("MEDIA = %.2f%n", avg);
		
		sc.close();
	}

}
