package JogoDaVelha;

import java.util.Scanner;

public class ValidaJogada {
	

	public static void main(String[] args) {	
		char[][] tabuleiro = {{' ',' ',' '},{' ',' ',' '},{' ',' ',' '}};
	
		imprimeTela(tabuleiro);
		
		
		Scanner scanner = new Scanner(System.in);
		repeteJogadaHumano(tabuleiro, scanner);
		
		
		
		imprimeTela(tabuleiro);
	}

	private static void repeteJogadaHumano(char[][] tabuleiro, Scanner scanner) {
		System.out.println("Selecione a posição que deseja fazer a sua jogada - Digite um número entre 1 e 9: ");
		String escolha = scanner.nextLine();
				
		switch(escolha) {
			case "1":
				tabuleiro[0][0] = 'X';
			break;
			case "2":
				tabuleiro[0][1] = 'X';
			break;
			case "3":
				tabuleiro[0][2] = 'X';
			break;
			case "4":
				tabuleiro[1][0] = 'X';
			break;
			case "5":
				tabuleiro[1][1] = 'X';
			break;
			case "6":
				tabuleiro[1][2] = 'X';
			break;
			case "7":
				tabuleiro[2][0] = 'X';
			break;
			case "8":
				tabuleiro[2][1] = 'X';
			break;
			case "9":
				tabuleiro[2][2] = 'X';
			break;
			default:
				System.out.println(":(");
				
				
		}
	}

	private static void imprimeTela(char[][] tabuleiro) {
		System.out.println("1" + "|" + "2" + "|" + "3      " + tabuleiro[0][0] + "|" + tabuleiro[0][1] + "|" + tabuleiro[0][2] );
		System.out.println("-+-+-      " + "-+-+-");
		System.out.println("4" + "|" + "5" + "|" + "6      " +tabuleiro[1][0] + "|" + tabuleiro[1][1] + "|" + tabuleiro[1][2] );
		System.out.println("-+-+-      " + "-+-+-");
		System.out.println("7" + "|" + "8" + "|" + "9      " +tabuleiro[2][0] + "|" + tabuleiro[2][1] + "|" + tabuleiro[2][2] );
	}	
	
}