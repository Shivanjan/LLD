package Tic_Tac_Toe;

public class Board {

    private Symbol[][] board;
    private int size;

    public Board(int size) {
        this.size = size;
        this.board = new Symbol[size][size];
    }

    public int getSize() {
        return size;
    }

    public boolean isValidMove(int row, int col) {


        if (row < 0 || row >= size || col < 0 || col >= size) {
            return false;
        }


        return board[row][col] == null;
    }

    public void placeSymbol(int row, int col, Symbol symbol) {
        board[row][col] = symbol;
    }

    public boolean isWon(Symbol symbol) {


        for (int i = 0; i < size; i++) {

            boolean rowWon = true;

            for (int j = 0; j < size; j++) {
                if (board[i][j] != symbol) {
                    rowWon = false;
                    break;
                }
            }

            if (rowWon) {
                return true;
            }
        }


        for (int j = 0; j < size; j++) {

            boolean columnWon = true;

            for (int i = 0; i < size; i++) {
                if (board[i][j] != symbol) {
                    columnWon = false;
                    break;
                }
            }

            if (columnWon) {
                return true;
            }
        }


        boolean diagonalWon = true;

        for (int i = 0; i < size; i++) {
            if (board[i][i] != symbol) {
                diagonalWon = false;
                break;
            }
        }

        if (diagonalWon) {
            return true;
        }

        boolean antiDiagonalWon = true;

        for (int i = 0; i < size; i++) {
            if (board[i][size - 1 - i] != symbol) {
                antiDiagonalWon = false;
                break;
            }
        }

        return antiDiagonalWon;
    }

    public boolean isFull() {

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {

                if (board[i][j] == null) {
                    return false;
                }
            }
        }

        return true;
    }
}