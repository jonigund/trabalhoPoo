package jogoDaVelha;


import java.util.Scanner;


public class Jogador{
	static Scanner scanner = new Scanner(System.in);
	static String escolha;
	
	
	public static void jogada () {
		while (true) {
			System.out.println("Selecione a posição que deseja fazer a sua jogada - Digite um número entre 1 e 9: ");
			escolha = scanner.nextLine();	
			if (Validador.validate.jogadaValida(Tabuleiro.tabuleiro, Integer.parseInt(escolha))){
				break;
			} else {
				System.out.println(escolha + "  Não é uma posição válida - Digite um número entre 1 e 9: ");
			}
		}
				
		
	}
}


