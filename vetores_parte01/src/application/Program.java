package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		double soma = 0.0;
		
		int n = sc.nextInt();
		double[] vect = new double[n];
		
		for (int i=0; i<n; i++) {
			vect[i] = sc.nextDouble();
			}
		
		for (int i=0; i<n; i++) {
			soma += vect[i];
		}
		
		double avg = soma / n;
		
		System.out.printf("AVERAGE HEIGHT: %.2f", avg);
		
		sc.close();
	}
}
