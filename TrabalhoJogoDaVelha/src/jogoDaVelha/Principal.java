package jogoDaVelha;

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
			if (Validador.validate.fimDeJogo(tabuleiro)) {
				break;
			}
		
			
			jogadaPc(tabuleiro);
			if (Validador.validate.fimDeJogo(tabuleiro)) {
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
	
		

	private static void jogadaPc(char[][] tabuleiro) {
		Computador.computadorA(tabuleiro);
		
	}
		
	
	
	public static void jogadaHumano (final char[][] tabuleiro, Scanner scanner) {
		Jogador.jogada();
		Validador.validate.posicionador(tabuleiro, Jogador.escolha, 'X');
		
	}



	

}
	
	
	

	
	

