package jogoDaVelha;


import java.util.Scanner;


public class Jogador{
	static Scanner scanner = new Scanner(System.in);
	static String escolha;
	
	
	public static void jogada () {
		while (true) {
			System.out.println("Selecione a posi��o que deseja fazer a sua jogada - Digite um n�mero entre 1 e 9: ");
			escolha = scanner.nextLine();	
			if (Validador.validate.jogadaValida(Tabuleiro.tabuleiro, Integer.parseInt(escolha))){
				break;
			} else {
				System.out.println(escolha + "  N�o � uma posi��o v�lida - Digite um n�mero entre 1 e 9: ");
			}
		}
				
		
	}
}


