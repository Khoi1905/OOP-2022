import java.util.ArrayList;

public class Game {
    private Board board;
    private ArrayList<Move> moveHistory;

    public Game(Board board) {
        this.board = board;
    }

    /**
     * í.
     *
     * @param piece is
     * @param x     is
     * @param y     is
     */
    public void movePiece(Piece piece, int x, int y) {
        if (piece.canMove(board, x, y)) {
            if (board.getAt(x, y) != null) {
                moveHistory.add(new Move(piece.getCoordinatesX(), x,
                        piece.getCoordinatesY(), y, piece, board.getAt(x, y)));
                board.removeAt(x, y);
            } else {
                moveHistory.add(new Move(piece.getCoordinatesX(), x,
                        piece.getCoordinatesY(), y, piece));
            }
            piece.setCoordinatesX(x);
            piece.setCoordinatesY(y);
        }
    }

    public Board getBoard() {
        return board;
    }

    public void setBoard(Board board) {
        this.board = board;
    }

    public ArrayList<Move> getMoveHistory() {
        return moveHistory;
    }
}
