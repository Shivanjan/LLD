package Tic_Tac_Toe;

public class Main {
	public static void main(String[] args) {
		Board board = new Board(4);
		Player player1 = new Player("Player 1", Symbol.X);
		Player player2 = new Player("Player 2", Symbol.O);

		Game game = new Game(board, player1, player2);
		game.startgame();
	}
}
