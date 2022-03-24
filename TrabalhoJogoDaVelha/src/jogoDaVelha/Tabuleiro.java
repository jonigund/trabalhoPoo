package jogoDaVelha;


public class Tabuleiro { //a classe Tabuleiro apenas instancia o objeto tabuleiro e imprime a formatacao proposta
	
	
	static char[][] tabuleiro = {{' ',' ',' '},{' ',' ',' '},{' ',' ',' '}}; //cria a variavel array do tipo char que vai armazenar as jogadas
	
	
	public static void imprimeTela(char[][] tabuleiro) { //metodo que formata o array
		System.out.println("1" + "|" + "2" + "|" + "3         " + tabuleiro[0][0] + "|" + tabuleiro[0][1] + "|" + tabuleiro[0][2] );
		System.out.println("-+-+-         " + "-+-+-");
		System.out.println("4" + "|" + "5" + "|" + "6         " +tabuleiro[1][0] + "|" + tabuleiro[1][1] + "|" + tabuleiro[1][2] );
		System.out.println("-+-+-         " + "-+-+-");
		System.out.println("7" + "|" + "8" + "|" + "9         " +tabuleiro[2][0] + "|" + tabuleiro[2][1] + "|" + tabuleiro[2][2] );
		System.out.println();
		System.out.println("_________________________________________________________________________________________________________");
	}
	
	
	public char[][] getTabuleiro() { //permite acessar o objeto a partir de outras classes
		return tabuleiro;
	}
	
	
	public void setTabuleiro(char[][] tabuleiro) { //permite modificar o objeto a partir de outras classes
		this.tabuleiro = tabuleiro;
	}	

}
