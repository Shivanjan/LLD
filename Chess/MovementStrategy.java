package Chess;

public interface MovementStrategy {
    boolean canMove(Position from, Position to, Board board);
}