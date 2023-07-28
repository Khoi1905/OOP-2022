public abstract class Piece {
    private int coordinatesX;
    private int coordinatesY;
    private String color = "white";

    /**
     * constructor.
     *
     * @param x is
     * @param y is
     */
    public Piece(int x, int y) {
        coordinatesX = x;
        coordinatesY = y;
    }

    /**
     * constructor.
     *
     * @param x     is
     * @param y     is
     * @param color is
     */
    public Piece(int x, int y, String color) {
        coordinatesY = y;
        coordinatesX = x;
        this.color = color;
    }

    public int getCoordinatesX() {
        return coordinatesX;
    }

    public void setCoordinatesX(int coordinatesX) {
        this.coordinatesX = coordinatesX;
    }

    public int getCoordinatesY() {
        return coordinatesY;
    }

    public void setCoordinatesY(int coordinatesY) {
        this.coordinatesY = coordinatesY;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    /**
     * is.
     *
     * @return is
     */
    public abstract String getSymbol();

    /**
     * í.
     *
     * @param piece is
     * @return is
     */
    public boolean checkPosition(Piece piece) {
        int x = piece.getCoordinatesX();
        int y = piece.getCoordinatesY();
        if (x < 1 || x > Board.WIDTH) {
            return false;
        }
        if (y < 1 || y > Board.HEIGHT) {
            return false;
        }
        return true;
    }

    /**
     * is.
     *
     * @param board is
     * @param x     is
     * @param y     is
     * @return is
     */
    public abstract boolean canMove(Board board, int x, int y);

}
