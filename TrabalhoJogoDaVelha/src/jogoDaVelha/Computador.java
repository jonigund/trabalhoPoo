package jogoDaVelha;

import java.util.Random;
import jogoDaVelha.Validador;

public class Computador {
	

	private static void computadorA (char[][] tabuleiro) {
		Random randomico = new Random();	
		int jogadaComputador;
		while (true) {
			jogadaComputador = randomico.nextInt(9)+1;
			if (Validador.validate.jogadaValida(tabuleiro, jogadaComputador)) {
				break;
			}
			}
		System.out.println("O Computador escolheu a posição "+ jogadaComputador);
		Validador.validate.posicionador(tabuleiro, Integer.toString(jogadaComputador), 'O');
	}
	
	
	
	
	

}
