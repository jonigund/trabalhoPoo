package jogoDaVelha;

public class Tabuleiro {
	
	static char[][] tabuleiro = {{' ',' ',' '},{' ',' ',' '},{' ',' ',' '}};
	public static void imprimeTela(char[][] tabuleiro) {
		System.out.println("1" + "|" + "2" + "|" + "3         " + tabuleiro[0][0] + "|" + tabuleiro[0][1] + "|" + tabuleiro[0][2] );
		System.out.println("-+-+-         " + "-+-+-");
		System.out.println("4" + "|" + "5" + "|" + "6         " +tabuleiro[1][0] + "|" + tabuleiro[1][1] + "|" + tabuleiro[1][2] );
		System.out.println("-+-+-         " + "-+-+-");
		System.out.println("7" + "|" + "8" + "|" + "9         " +tabuleiro[2][0] + "|" + tabuleiro[2][1] + "|" + tabuleiro[2][2] );
		System.out.println();
		System.out.println("_________________________________________________________________________________________________________");
	}
	public char[][] getTabuleiro() {
		return tabuleiro;
	}
	public void setTabuleiro(char[][] tabuleiro) {
		this.tabuleiro = tabuleiro;
	}	

}
