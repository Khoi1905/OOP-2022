import java.util.List;

public class Rook extends Piece {
    /**
     * is.
     *
     * @param x is
     * @param y is
     */
    public Rook(int x, int y) {
        super(x, y);
    }

    /**
     * is.
     *
     * @param x     is
     * @param y     is
     * @param color is
     */
    public Rook(int x, int y, String color) {
        super(x, y, color);
    }

    @Override
    public String getSymbol() {
        return "R";
    }

    @Override
    public boolean canMove(Board board, int x, int y) {
        if (x < 0 || x >= 8 || y < 0 || y >= 8) {
            return false;
        }
        Piece destPiece = board.getAt(x, y);
        if (destPiece != null && destPiece.getColor() == this.getColor()) {
            return false;
        }
        if (this.getCoordinatesX() == x) {
            int delta = (this.getCoordinatesY() < y) ? 1 : -1;
            for (int j = this.getCoordinatesY() + delta; j != y; j += delta) {
                if (board.getAt(x, j) != null) {
                    return false;
                }
            }
        } else if (this.getCoordinatesY() == y) {
            int delta = (this.getCoordinatesX() < x) ? 1 : -1;
            for (int i = this.getCoordinatesX() + delta; i != x; i += delta) {
                if (board.getAt(i, y) != null) {
                    return false;
                }
            }
        } else {
            return false;
        }
        return true;
    }
}
