package jogoDaVelha;

import java.util.Scanner;


public class Principal extends Tabuleiro{
	static Scanner scanner = new Scanner(System.in);
	static String verEscolha;


	public static void main(String[] args) {
			
		configInicio();
		
		alternador();

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



	public static void configInicio() {
		String nivel;
		System.out.println("Selecione o nível de dificuldade digitando  a , b ou c: ");
		nivel = scanner.nextLine();
		
		switch(nivel) {
		case "a":
			System.out.println("Você escolheu 'a', o nível mais fácil!");
			verEscolha = "a";
			break;
		case "b":
			System.out.println("Você escolheu 'b', agora vai ficar mais difícil!");
			verEscolha = "b";
			break;
		case "c":
			System.out.println("\"Você escolheu 'c', o nível dos mestres!");
			verEscolha = "c";
			break;
		default:
			System.out.println("Opção não válida!, ");
			configInicio();
			break;
		}
	}
	
		

	public static void jogadaPc(char[][] tabuleiro) {
		switch(verEscolha) {
		case "a":
			ComputadorA.computadorA(tabuleiro);
		break;
		case "b":
			ComputadorB.computadorB(tabuleiro);
		break;
		case "c":
			ComputadorC.computadorC(tabuleiro);;
		break;
		}
	}
		
	
	
	public static void jogadaHumano (final char[][] tabuleiro, Scanner scanner) {
		Jogador.jogada();
		Validador.validate.posicionador(tabuleiro, Jogador.escolha, 'X');
	}
}
	
	
	

	
	

