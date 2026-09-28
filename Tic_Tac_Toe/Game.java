package Tic_Tac_Toe;
import java.util.*;
public class Game {
    private Board board;
    private Player player1;
    private Player player2;
    private Player currPlayer;

    public Game(Board board,Player player1,Player player2){
        this.board=board;
        this.player1=player1;
        this.player2=player2;
        this.currPlayer=player1;
    }
     Scanner sc=new Scanner(System.in);

    public void startgame(){
        while(true){
            
            
             int x=sc.nextInt();

             int y=sc.nextInt();

             if(!board.isValidMove(x,y)){
                   System.out.print("Invalid Move try again");
                   continue;
             }

            board.placeSymbol(x, y, currPlayer.getSymbol());
             if(board.isWon(currPlayer.getSymbol())){
                    System.out.println(currPlayer.getname()+" won");
                    break;
             }

             else if(board.isFull()){
                        System.out.println("Draw");
                        break;
             }

             if(currPlayer==player1){
                currPlayer=player2;
             }
             else{
                currPlayer=player1;
             }
        }
    }
}
