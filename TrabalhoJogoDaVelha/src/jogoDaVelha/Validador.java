package jogoDaVelha;

import java.util.Scanner;

public interface Validador {

	public class validate extends Tabuleiro{
		static Scanner scanner = new Scanner(System.in);

			
	public static boolean fimDeJogo (char[][] tabuleiro) {
					
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

		
		
	public static boolean jogadaValida(char[][] tabuleiro, int escolha ) {
			switch(escolha) {
				case 1:
					return(tabuleiro[0][0]) == ' ';
				case 2:
					return(tabuleiro[0][1]) == ' ';
				case 3:
					return(tabuleiro[0][2]) == ' ';
				case 4:
					return(tabuleiro[1][0]) == ' ';
				case 5:
					return(tabuleiro[1][1]) == ' ';
				case 6:
					return(tabuleiro[1][2]) == ' ';
				case 7:
					return(tabuleiro[2][0]) == ' ';
				case 8:
					return(tabuleiro[2][1]) == ' ';
				case 9:
					return(tabuleiro[2][2]) == ' ';
				default:
					return false;
			
		}
		}
		
		
		
	public static void posicionador(final char[][] tabuleiro, String escolha, char avatar) {
		switch(escolha) {
			case "1":
				tabuleiro[0][0] = avatar;
			break;
			case "2":
				tabuleiro[0][1] = avatar;
			break;
			case "3":
				tabuleiro[0][2] = avatar;
			break;
			case "4":
				tabuleiro[1][0] = avatar;
			break;
			case "5":
				tabuleiro[1][1] = avatar;
			break;
			case "6":
				tabuleiro[1][2] = avatar;
			break;
			case "7":
				tabuleiro[2][0] = avatar;
			break;
			case "8":
				tabuleiro[2][1] = avatar;
			break;
			case "9":
				tabuleiro[2][2] = avatar;
			break;
			default:
				System.out.println("Não válido!");
				
			}
	}


	
	}	
}
