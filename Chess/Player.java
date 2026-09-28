package Chess;


public class Player{
    private String name;
    private Color color;
    

    public Player(String name,Color color){
        this.name=name;
        this.color=color;
    }

    public String getName(){
        return this.name;
    }

    public Color getColor(){
        return this.color;
    }
}