package Snake_Ladder;
import  java.util.*;

public class Game {
    private Dice dice;
    private Board board;
    private Queue<Player> players;

    public Game(Dice dice,Board  board,Queue<Player> players){
        this.dice=dice;
        this.board=board;
        this.players=players;

    }

    public void play(){

        while(true){
                Player currPlayer=players.poll();

                int pos=dice.roll();
                int newpos=currPlayer.getPosition()+pos;
                if(newpos>100){
                    players.offer(currPlayer);
                    continue;
                }
                int dest=board.getDestination(newpos);

                currPlayer.moveto(dest);
                if(dest==board.getSize()){
                    System.out.println(currPlayer.getName()+" wins");
                    break;
                }



                players.offer(currPlayer);
        


        }
    }
}
