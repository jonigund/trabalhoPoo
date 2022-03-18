package jogoDaVelha;

import java.util.Random;
import jogoDaVelha.Tabuleiro;
import jogoDaVelha.Validador;



public class ComputadorA extends Computador {
	
	public static void computadorA (char[][] tabuleiro) {
		Random randomico = new Random();
		int rotinaA;
		
			while (true) {
				rotinaA = randomico.nextInt(9)+1;
				if (Validador.validate.jogadaValida(tabuleiro, rotinaA)) {
					break;
				}
				}
			System.out.println("O Computador escolheu a posição "+ rotinaA);
			Validador.validate.posicionador(tabuleiro, Integer.toString(rotinaA), 'O');

		}
}
