import java.util.Scanner;

public class aula_27 {
	
	public static void main (String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
			double largura, comprimento, metroQuadrado, area, preco;
			
			System.out.println("Digite os valores abaixo: ");
			
			// Entrada de dados
			System.out.print("Largura: ");
			largura = sc.nextDouble();
			
			System.out.print("Comprimento: ");
			comprimento = sc.nextDouble();
			
			System.out.print("Metro Quadrado: ");
			metroQuadrado = sc.nextDouble();
			
			// Processamento de dados
			area = largura * comprimento;
			preco = metroQuadrado * area;
			
			// Saída de dados
			System.out.println("RESULTADO");
			System.out.printf("AREA = %.2f%n", area);
			System.out.printf("PRECO = %.2f%n", preco);
			
		sc.close();
	}
	
}
