import java.util.Scanner;

public class ex04 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
			
		// Entrada
		int numFuncionario = sc.nextInt();
		
		double horasTrab = sc.nextDouble();
		
		double valorHora = sc.nextDouble();
		
		// Processamento
		double salario = horasTrab * valorHora;
		
		// Saida
		System.out.println("NUMBER = " + numFuncionario);
		System.out.printf("SALARY = U$ %.2f", salario);
		
		
		sc.close();

	}

}