public class Move {
    private int startX;
    private int startY;
    private int endX;
    private int endY;
    private Piece movedPiece;
    private Piece killedPiece;

    /**
     * í.
     *
     * @param startX     is
     * @param startY     is
     * @param endX       is
     * @param andY       is
     * @param movedPiece is
     */
    public Move(int startX, int startY, int endX, int andY, Piece movedPiece) {
        this.startX = startX;
        this.startY = startY;
        this.endX = endX;
        this.endY = andY;
        this.movedPiece = movedPiece;
    }

    /**
     * is.
     *
     * @param startX      is
     * @param startY      is
     * @param endX        is
     * @param andY        is
     * @param movedPiece  is
     * @param killedPiece is
     */
    public Move(int startX, int startY, int endX, int andY, Piece movedPiece, Piece killedPiece) {
        this.startX = startX;
        this.startY = startY;
        this.endX = endX;
        this.endY = andY;
        this.movedPiece = movedPiece;
        this.killedPiece = killedPiece;
    }

    public int getStartX() {
        return startX;
    }

    public void setStartX(int startX) {
        this.startX = startX;
    }

    public int getStartY() {
        return startY;
    }

    public void setStartY(int startY) {
        this.startY = startY;
    }

    public int getEndX() {
        return endX;
    }

    public void setEndX(int endX) {
        this.endX = endX;
    }

    public int getEndY() {
        return endY;
    }

    public void setEndY(int andY) {
        this.endY = andY;
    }

    public Piece getMovedPiece() {
        return movedPiece;
    }

    public void setMovedPiece(Piece movedPiece) {
        this.movedPiece = movedPiece;
    }

    public Piece getKilledPiece() {
        return killedPiece;
    }

    public void setKilledPiece(Piece killedPiece) {
        this.killedPiece = killedPiece;
    }

    /**
     * chuyển từ số sang kiểu abcd, để vd a7, e3 trong cờ.
     *
     * @param x is
     * @return is
     */
    public String getAlpha(int x) {
        return String.valueOf((char) (x + 96));
    }

    @Override
    public String toString() {
        return String.format("%s-%s%s%s",
                movedPiece.getColor(),
                movedPiece.getSymbol(),
                getAlpha(endX), endY);
    }
}
