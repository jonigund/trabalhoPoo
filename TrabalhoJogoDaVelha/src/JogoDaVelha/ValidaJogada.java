package JogoDaVelha;

import java.util.Random;
import java.util.Scanner;


public class ValidaJogada {
	
		
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		char[][] tabuleiro = {{' ',' ',' '},{' ',' ',' '},{' ',' ',' '}};
		
		
	imprimeTela(tabuleiro);
	
	while (true) {
		jogadaHumano(tabuleiro, scanner);
		if (fimDeJogo(tabuleiro)) {
			break;
		}
	
		
		jogadaPc(tabuleiro);
		if (fimDeJogo(tabuleiro)) {
			break;
		}
	
		
		imprimeTela(tabuleiro);
		
		}
		//scanner.close();
	}
	
	
		

	private static boolean fimDeJogo(char[][] tabuleiro) {
				
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
			if (jogadaValida(tabuleiro, jogadaComputador)) {
				break;
			}
			}
		System.out.println("O Computador escolheu a posição "+ jogadaComputador);
		posicionador(tabuleiro, Integer.toString(jogadaComputador), 'O');
	}
		
	
	
	private static boolean jogadaValida(char[][] tabuleiro, int escolha ) {
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
	
	
	
 	public static void imprimeTela(char[][] tabuleiro) {
		System.out.println("1" + "|" + "2" + "|" + "3      " + tabuleiro[0][0] + "|" + tabuleiro[0][1] + "|" + tabuleiro[0][2] );
		System.out.println("-+-+-      " + "-+-+-");
		System.out.println("4" + "|" + "5" + "|" + "6      " +tabuleiro[1][0] + "|" + tabuleiro[1][1] + "|" + tabuleiro[1][2] );
		System.out.println("-+-+-      " + "-+-+-");
		System.out.println("7" + "|" + "8" + "|" + "9      " +tabuleiro[2][0] + "|" + tabuleiro[2][1] + "|" + tabuleiro[2][2] );
	}	

	
		
	private static void jogadaHumano(final char[][] tabuleiro, Scanner scanner) {
		String escolha;
		while (true) {
			System.out.println("Selecione a posição que deseja fazer a sua jogada - Digite um número entre 1 e 9: ");
			escolha = scanner.nextLine();	
			if (jogadaValida(tabuleiro, Integer.parseInt(escolha))){
				break;
			} else {
				System.out.println(escolha + "  Não é uma posição válida - Digite um número entre 1 e 9: ");
			}
		}
		posicionador(tabuleiro, escolha, 'X');
		
	}



	private static void posicionador(final char[][] tabuleiro, String escolha, char avatar) {
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
				System.out.println(":(");
				
			}
	}


}
	
	
	

	
	

