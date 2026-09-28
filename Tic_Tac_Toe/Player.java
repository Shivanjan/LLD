package Tic_Tac_Toe;

public class Player {
    private String name;
    private Symbol symbol;

    public Player(String name,Symbol symbol){
        this.name=name;
        this.symbol=symbol;
    }

    public String getname(){
        return this.name;
    }
    public Symbol getSymbol(){
        return this.symbol;
    }
}



