public class Square extends Rectangle {
    /**
     * constructor method.
     */
    public Square() {

    }

    /**
     * constructor method.
     *
     * @param point  is
     * @param side   is
     * @param color  is
     * @param filled is
     */
    public Square(Point point, double side, String color, boolean filled) {
        super(point, side, side, color, filled);
    }

    /**
     * constructor method.
     *
     * @param side is side
     */
    public Square(double side) {
        this.width = side;
        this.length = side;
    }

    /**
     * constructor method.
     *
     * @param side   is side
     * @param color  is color
     * @param filled is filled
     */
    public Square(double side, String color, boolean filled) {
        super(side, side, color, filled);
    }

    @Override
    public void setWidth(double side) {
        super.setWidth(side);
        super.setLength(side);
    }

    @Override
    public void setLength(double side) {
        super.setLength(side);
        super.setWidth(side);
    }

    /**
     * set method.
     *
     * @param side is side
     */
    public void setSide(double side) {
        super.setLength(side);
        super.setWidth(side);
    }

    /**
     * get method.
     *
     * @return get
     */
    public double getSide() {
        return super.getLength();
    }

    /**
     * dsd.
     *
     * @param object is ob.
     * @return ds.
     */
    public boolean equals(Object object) {
        if (object instanceof Square) {
            boolean x = Math.abs(((Square) object).width - this.width) <= 0.001;
            boolean y = Math.abs(((Square) object).length - this.length) <= 0.001;
            return topLeft.equals(((Square) object).topLeft) && x && y;
        }
        return false;
    }

    @Override
    public String toString() {
        return String.format("Square[topLeft=%s,side=%.1f,color=%s,filled=%s]",
                topLeft.toString(), width, color, filled);
    }
}
