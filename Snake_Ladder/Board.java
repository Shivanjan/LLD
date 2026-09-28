package Snake_Ladder;

import java.util.*;
public class Board {

    private int size;
    private Map<Integer, Integer> jumps;

    public Board(int size, List<Snake> snakes, List<Ladder> ladders) {

        this.size = size;
        this.jumps = new HashMap<>();

        for (Snake snake : snakes) {
            jumps.put(snake.getStart(), snake.getEnd());
        }

        for (Ladder ladder : ladders) {
            jumps.put(ladder.getStart(), ladder.getEnd());
        }
    }

    public int getSize() {
        return size;
    }

    public int getDestination(int position) {
        return jumps.getOrDefault(position, position);
    }
}