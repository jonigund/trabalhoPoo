package jogoDaVelha; //denominacao da "pasta" que agrupa todas as classes d aplicacao


import java.util.Scanner; //importa biblioteca para captura de entrada de dados


public class Principal extends Tabuleiro{ //metodo que instancia a classe e herda os atributos da classe Tabuleiro
	static Scanner scanner = new Scanner(System.in); //instancia o objeto scanner
	static String verEscolha; //variavel do tipo string que ira receber a leitura do scanner


	public static void main(String[] args) { //metodo principa, que inicia a aplicacao
			
		configInicio(); //chama o metodo configInicio
		
		alternador(); //chama o metodo alternador

	}


	private static void alternador() { //metodo que vai executar a alternancia das jogadas entre o usuario e o computador
		while (true) { //estrutura de controle de laço que verifica a validade da jogada, somente é interrompida com uma jogada valida
			Tabuleiro.imprimeTela(tabuleiro);; //chama o objeto tabuleiro da classe Tabuleiro
			jogadaHumano(tabuleiro, scanner); //faz a leitura da escolha do usuario
			if (Validador.validate.fimDeJogo(tabuleiro)) { //se a jogada do usuario for valida pelo metodo e configurar verdadeiro para as regras de fim de jogo, a rotina é interrompida
				break;
			}
		
			
			jogadaPc(tabuleiro);
			if (Validador.validate.fimDeJogo(tabuleiro)) { //se a jogada do computador for valida pelo metodo e configurar verdadeiro para as regras de fim de jogo, a rotina é interrompida
				break;
			}
		}				
	}



	public static void configInicio() { //metodo para configurar a escolha do adversario, no caso, 3 possibilidades de computador
		String nivel; //variavel que ira armazenar a escolha do usuario
		System.out.println("Selecione o nível de dificuldade digitando  a , b ou c: "); //imprime no terminal a solicitacao ao usuario para escolher o nivel, que no caso sera uma das 3 opcoes de logica de jogo do computador
		nivel = scanner.nextLine(); //atribui a leitura do que foi digitado no teclado na variavel "nivel"
		
		switch(nivel) { //estrutura de controle de laço definido em funcao da escolha do usuario
		case "a": //no caso da opcao pre definida "a", e o mesmo vale para todas, executa o bloco de codigo abaixo até o break
			System.out.println("Você escolheu 'a', o nível mais fácil!");
			System.out.println("");
			verEscolha = "a";
			break;
		case "b":
			System.out.println("Você escolheu 'b', agora vai ficar mais difícil!");
			System.out.println("");
			verEscolha = "b";
			break;
		case "c":
			System.out.println("\"Você escolheu 'c', o nível dos mestres!");
			System.out.println("");
			verEscolha = "c";
			break;
		default: //caso nenhuma opcao pre definida seja atendida, executa o bloco a seguir até o proximo break
			System.out.println("Opção não válida!, ");
			configInicio();
			break;
		}
	}
	
		

	public static void jogadaPc(char[][] tabuleiro) { // metodo que executa a classe correspondente a escolha de adversario feita pelo usuario
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
		
	
	
	public static void jogadaHumano (final char[][] tabuleiro, Scanner scanner) { // metodo que posiciona o caracter no "avatar" correspondente a jogada do usuario na posicao validada quando chamado pelo alternador
		Jogador.jogada(); //chama o metodo jogada da classe Jogador
		Validador.validate.posicionador(tabuleiro, Jogador.escolha, 'X'); //posiciona a jogada no array
	}
}
	
	
	

	
	

