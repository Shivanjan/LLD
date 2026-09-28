package Snake_Ladder;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        // Create Snakes
        List<Snake> snakes = Arrays.asList(
                new Snake(99, 10),
                new Snake(70, 20),
                new Snake(50, 30)
        );

        // Create Ladders
        List<Ladder> ladders = Arrays.asList(
                new Ladder(5, 25),
                new Ladder(15, 45),
                new Ladder(30, 60)
        );

        // Create Board
        Board board = new Board(100, snakes, ladders);

        // Create Dice
        Dice dice = new Dice(6);

        // Create Players
        Queue<Player> players = new LinkedList<>();

        players.offer(new Player("Player 1"));
        players.offer(new Player("Player 2"));

        // Create Game
        Game game = new Game(dice, board, players);

        // Start Game
        game.play();
    }
}