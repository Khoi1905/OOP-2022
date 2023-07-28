import java.util.ArrayList;

public class Board {
    public static final int WIDTH = 8;
    public static final int HEIGHT = 8;
    private ArrayList<Piece> pieces = new ArrayList<Piece>();

    public Board() {

    }

    /**
     * is.
     *
     * @param piece is
     */
    public void addPiece(Piece piece) {
        if (validate(piece.getCoordinatesX(), piece.getCoordinatesY())
                && getAt(piece.getCoordinatesX(), piece.getCoordinatesY()) != null) {
            pieces.add(piece);
        }
    }

    /**
     * is.
     *
     * @param x is
     * @param y is
     * @return is
     */
    public boolean validate(int x, int y) {
        if (x <= 8 && x > 0 && y > 0 && y <= 8) {
            return true;
        }
        return false;
    }

    /**
     * is.
     *
     * @param x is
     * @param y is
     * @return is
     */
    public Piece getAt(int x, int y) {
        for (int i = 0; i < pieces.size(); i++) {
            if (pieces.get(i).getCoordinatesX() == x
                    && pieces.get(i).getCoordinatesY() == y) {
                return pieces.get(i);
            }
        }
        return null;
    }

    /**
     * is.
     *
     * @param x is
     * @param y is
     */
    public void removeAt(int x, int y) {
        for (int i = 0; i < pieces.size(); i++) {
            if (pieces.get(i).getCoordinatesX() == x
                    && pieces.get(i).getCoordinatesY() == y) {
                pieces.remove(pieces.get(i));
            }
        }
    }

    public ArrayList<Piece> getPieces() {
        return pieces;
    }

    public void setPieces(ArrayList<Piece> pieces) {
        this.pieces = pieces;
    }
}