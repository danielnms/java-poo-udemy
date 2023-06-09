package estrutura_condicional;

import java.util.Scanner;

public class Ex08 {
	
	/* Em um pa�s imagin�rio denominado Lisarb, todos os habitantes ficam felizes em pagar seus impostos,
	 * pois sabem que nele n�o existem pol�ticos corruptos e os recursos arrecadados s�o utilizados em
	 * benef�cio da popula��o, sem qualquer desvio. A moeda deste pa�s � o Rombus, cujo s�mbolo � o R$.
	 * 
	 * Leia um valor com duas casas decimais, equivalente ao sal�rio de uma pessoa de Lisarb. Em seguida,
	 * calcule e mostre o valor que esta pessoa deve pagar de Imposto de Renda, segundo a tabela abaixo.
	 * 
	 * de 0.00 a 2000.00			Isento
	 * de 2000.01 at� 3000.00		8%
	 * de 3000.01 at� 4500.00		18%
	 * acima de 4500.00				28%
	 * 
	 * Lembre que, se o sal�rio for R$ 3002.00, a taxa que incide � de 8% apenas sobre R$ 1000.00, pois
	 * a faixa de sal�rio que fica de R$ 0.00 at� R$ 2000.00 � isenta de Imposto de Renda. No exemplo
	 * fornecido (abaixo), a taxa � de 8% sobre R$ 1000.00 + 18% sobre R$ 2.00, o que resulta em
	 * R$ 80.36 no total. O valor deve ser impresso com duas casas decimais.
	 */
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double sal = sc.nextDouble();
		double imposto;
		
		if(sal <= 2000.00) {
			imposto = 0.0;
		} else if(sal <= 3000.00) {
			imposto = (sal - 2000.00) * 0.08;
		} else if(sal <= 4500.00) {
			imposto = (1000.00 * 0.08) + (sal - 3000.00) * 0.18;
		} else {
			imposto = (1000.00 * 0.08) + (1500.00 * 0.18) + (sal - 4500.00) * 0.28;
			System.out.println(imposto);
		}
		
		if (imposto == 0.0) {
			System.out.println("Isento");
		}
		else {
			System.out.printf("R$ %.2f%n", imposto);
		}
		
		sc.close();

	}

}
