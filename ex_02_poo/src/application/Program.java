package application;

import java.util.Scanner;

import entities.Employee;

public class Program {

	public static void main(String[] args) {
		/* Fazer um programa para ler os dados de um funcion�rio (nome, sal�rio bruto e imposto).
		 * Em seguida, mostrar os dados do funcion�rio (nome e sal�rio l�quido).
		 * Em seguida, aumentar o sal�rio do funcion�rio com base em uma porcentagem
		 * dada (somente o sal�rio bruto � afetado pela porcentagem) e mostrar novamente
		 * os dados do funcion�rio. Use a classe projetada abaixo.
		 */

		Scanner sc = new Scanner(System.in);
		
		Employee employee = new Employee();
		
		System.out.print("Name: ");
		employee.name = sc.nextLine();
		System.out.print("Gross Salary: ");
		employee.grossSalary = sc.nextDouble();
		System.out.print("Tax: ");
		employee.tax = sc.nextDouble();
		System.out.println(); 
		
		System.out.println(employee.toString());
		System.out.println();
		
		System.out.print("Which percentage to increase salary? ");
		employee.increaseSalary(sc.nextDouble());
		System.out.println();
		
		System.out.println(employee.toString());
		
		sc.close();
	}

}
