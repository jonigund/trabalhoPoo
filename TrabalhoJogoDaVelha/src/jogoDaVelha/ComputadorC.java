package jogoDaVelha;

import jogoDaVelha.Tabuleiro;
import jogoDaVelha.Validador;

public class ComputadorC extends Computador {

	
	public static void computadorC (char[][] tabuleiro) {
		
		
				if (tabuleiro[1][1] == ' ') {
					System.out.println("O Computador escolheu a posi��o "+ 5);
					Validador.validate.posicionador(tabuleiro, Integer.toString(5), 'O');		
				}
				else if (tabuleiro[2][2] == ' ') {
					System.out.println("O Computador escolheu a posi��o "+ 9);
					Validador.validate.posicionador(tabuleiro, Integer.toString(9), 'O');		
				}
				else if (tabuleiro[0][0] == ' ') {
					System.out.println("O Computador escolheu a posi��o "+ 1);
					Validador.validate.posicionador(tabuleiro, Integer.toString(1), 'O');		
				}
				else if (tabuleiro[0][2] == ' ') {
					System.out.println("O Computador escolheu a posi��o "+ 3);
					Validador.validate.posicionador(tabuleiro, Integer.toString(3), 'O');		
				}
				else if (tabuleiro[2][0] == ' ') {
					System.out.println("O Computador escolheu a posi��o "+ 7);
					Validador.validate.posicionador(tabuleiro, Integer.toString(7), 'O');		
				}
				else if (tabuleiro[0][1] == ' ') {
					System.out.println("O Computador escolheu a posi��o "+ 2);
					Validador.validate.posicionador(tabuleiro, Integer.toString(2), 'O');		
				}
				else if (tabuleiro[1][0] == ' ') {
					System.out.println("O Computador escolheu a posi��o "+ 4);
					Validador.validate.posicionador(tabuleiro, Integer.toString(7), 'O');		
				}
				else if (tabuleiro[1][2] == ' ') {
					System.out.println("O Computador escolheu a posi��o "+ 6);
					Validador.validate.posicionador(tabuleiro, Integer.toString(6), 'O');		
				}
				else if (tabuleiro[2][1] == ' ') {
					System.out.println("O Computador escolheu a posi��o "+ 8);
					Validador.validate.posicionador(tabuleiro, Integer.toString(8), 'O');	
							
			
				}	
		}
}

	

