package estrutura_condicional;

import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double x = sc.nextDouble();
		double y = sc.nextDouble();
		
		if(x == 0.0 && y == 0.0) {
			System.out.print("Origem");
		} else if(x == 0.0) {
			System.out.print("Eixo Y");
		} else if(y == 0.0) {
			System.out.print("Eixo X");
		} else if(x > 0.0 && y > 0.0) {
			System.out.print("Q1");
		} else if(x < 0.0 && y > 0.0) {
			System.out.print("Q2");
		} else if(x < 0.0 && y < 0.0) {
			System.out.print("Q3");
		} else {
			System.out.print("Q4");
		}
		
		sc.close();

	}

}
