import java.util.Scanner;

public class aula_26 {

	public static void main(String[] args) {
		// entrada de dados em Java
		
		Scanner sc = new Scanner(System.in);
		
			String x;
			int y;
			double z;
			
			System.out.print("Digite seu nome: ");
			x = sc.nextLine();
			
			System.out.print("Digite sua idade: ");
			y = sc.nextInt();
			
			System.out.print("Digite sua altura: ");
			z = sc.nextDouble();
			
			System.out.println("Dados digitados: ");
			System.out.printf("Nome: %s %nIdade: %d %nAltura: %.2f", x, y, z);
					
		sc.close();
		
	}

}
