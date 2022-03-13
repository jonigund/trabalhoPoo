package jogoDaVelha;

import java.util.Random;
import java.util.Scanner;
import jogoDaVelha.Jogador;
import jogoDaVelha.Tabuleiro;
import jogoDaVelha.Computador;
import jogoDaVelha.Validador;




public class Principal extends Tabuleiro{
	static Scanner scanner = new Scanner(System.in);


	
	public static void main(String[] args) {
					
		configInicio();
		
		alternador();
		
		System.out.println("_______________________________________________________________");
		
		//scanner.close();
		
	}



	private static void alternador() {
		while (true) {
			Tabuleiro.imprimeTela(tabuleiro);;
			jogadaHumano(tabuleiro, scanner);
			if (fimDeJogo(tabuleiro)) {
				break;
			}
		
			
			jogadaPc(tabuleiro);
			if (fimDeJogo(tabuleiro)) {
				break;
			}
		
		}
	}



	private static void configInicio() {
		String nivel;
		System.out.println("Selecione o nível de dificuldade digitando  A , B ou C: ");
		nivel = scanner.nextLine();
		switch(nivel) {
		case "A":
			System.out.println("acerto miseravi");
			break;
		}
	}
	
	
	
	private static boolean fimDeJogo (char[][] tabuleiro) {
				
		if ((tabuleiro[0][0] =='X' && tabuleiro[0][1] =='X' && tabuleiro[0][2] =='X') ||
			(tabuleiro[1][0] =='X' && tabuleiro[1][1] =='X' && tabuleiro[1][2] =='X') ||
			(tabuleiro[2][0] =='X' && tabuleiro[2][1] =='X' && tabuleiro[2][2] =='X') ||
			
			(tabuleiro[0][0] =='X' && tabuleiro[1][0] =='X' && tabuleiro[2][0] =='X') ||
			(tabuleiro[0][1] =='X' && tabuleiro[1][1] =='X' && tabuleiro[2][1] =='X') ||
			(tabuleiro[0][2] =='X' && tabuleiro[1][2] =='X' && tabuleiro[2][2] =='X') ||
			
			(tabuleiro[0][0] =='X' && tabuleiro[1][1] =='X' && tabuleiro[2][2] =='X') ||
			(tabuleiro[0][2] =='X' && tabuleiro[1][1] =='X' && tabuleiro[2][0] =='X')) {
			imprimeTela(tabuleiro);
			System.out.println("Você venceu!");
			return true;
			}
		
		else if ((tabuleiro[0][0] =='O' && tabuleiro[0][1] =='O' && tabuleiro[0][2] =='O') ||
				(tabuleiro[1][0] =='O' && tabuleiro[1][1] =='O' && tabuleiro[1][2] =='O') ||
				(tabuleiro[2][0] =='O' && tabuleiro[2][1] =='O' && tabuleiro[2][2] =='O') ||
				
				(tabuleiro[0][0] =='O' && tabuleiro[1][0] =='O' && tabuleiro[2][0] =='O') ||
				(tabuleiro[0][1] =='O' && tabuleiro[1][1] =='O' && tabuleiro[2][1] =='O') ||
				(tabuleiro[0][2] =='O' && tabuleiro[1][2] =='O' && tabuleiro[2][2] =='O') ||
				
				(tabuleiro[0][0] =='O' && tabuleiro[1][1] =='O' && tabuleiro[2][2] =='O') ||
				(tabuleiro[0][2] =='O' && tabuleiro[1][1] =='O' && tabuleiro[2][0] =='O')) {
				imprimeTela(tabuleiro);
				System.out.println("Game Over, o computador venceu!");
				return true;
				}
				
		
		for (int i = 0; i <tabuleiro.length; i++) {
			for (int j = 0; j < tabuleiro[i].length; j++) {
				if (tabuleiro[i][j] == ' ') {
					return false;
				}
			}
		}
		imprimeTela(tabuleiro);
		System.out.println("O jogo empatou!");
		
		
		return false;
		
	}

	

	private static void jogadaPc(char[][] tabuleiro) {
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
		
	
	
	public static void jogadaHumano (final char[][] tabuleiro, Scanner scanner) {
		Jogador.jogada();
		Validador.validate.posicionador(tabuleiro, Jogador.escolha, 'X');
		
	}



	

}
	
	
	

	
	

