package Chess;

public class Piece {

    private Color color;
    private PieceType type;
    private MovementStrategy strategy;

    public Piece(Color color,
                 PieceType type,
                 MovementStrategy strategy) {

        this.color = color;
        this.type = type;
        this.strategy = strategy;
    }

    public Color getColor() {
        return color;
    }

    public PieceType getType() {
        return type;
    }

    public boolean canMove(Position from,
                           Position to,
                           Board board) {

        return strategy.canMove(from, to, board);
    }
}