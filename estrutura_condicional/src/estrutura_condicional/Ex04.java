package estrutura_condicional;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		/* Leia a hora inicial e a hora final de um jogo.
		 * A seguir calcule a dura��o do jogo, sabendo que
		 * o mesmo pode come�ar em um dia e terminar em outro,
		 * tendo uma dura��o m�nima de 1 hora e m�xima de 24 horas.
		 */
		
		Scanner sc = new Scanner(System.in);
		
		int horaTotal;
		int horaInicial = sc.nextInt();
		int horaFinal = sc.nextInt();
		
		if(horaInicial > horaFinal) {
			horaTotal = 24 - horaInicial + horaFinal;
		} else if(horaInicial < horaFinal) {
			horaTotal = horaFinal - horaInicial;
		} else {
			horaTotal = 24;
		}
		
		System.out.print("O JOGO DUROU " + horaTotal + " HORA(S)");
		
		sc.close();
	}

}
