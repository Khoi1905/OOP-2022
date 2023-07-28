public class Square extends Rectangle {
    /**
     * constructor method.
     */
    public Square() {

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
        this.color = color;
        this.width = side;
        this.length = side;
        this.filled = filled;
    }

    @Override
    public void setWidth(double side) {
        this.width = side;
    }

    @Override
    public void setLength(double side) {
        this.length = side;
    }

    /**
     * set method.
     *
     * @param side is side
     */
    public void setSide(double side) {
        this.setLength(side);
        this.setWidth(side);
    }

    public double getSide() {
        return super.getLength();
    }

    @Override
    public String toString() {
        return "Square["
                + "side=" + this.getSide()
                + ",color=" + super.color
                + ",filled=" + super.filled
                + ']';
    }
}
