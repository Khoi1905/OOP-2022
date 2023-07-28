public class Rectangle extends Shape {
    protected double width;
    protected double length;

    /**
     * constructor method.
     */
    public Rectangle() {

    }

    /**
     * constructor method.
     *
     * @param width  is width
     * @param length is length
     */
    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    /**
     * constructor method.
     *
     * @param width  is width
     * @param length is length
     * @param color  is color
     * @param filled is filled
     */
    public Rectangle(double width, double length, String color, boolean filled) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    /**
     * get method.
     *
     * @return width
     */
    public double getWidth() {
        return width;
    }

    /**
     * set method.
     *
     * @param width is width
     */
    public void setWidth(double width) {
        this.width = width;
    }

    /**
     * get method.
     *
     * @return length
     */
    public double getLength() {
        return length;
    }

    /**
     * set method.
     *
     * @param length is length
     */
    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public double getArea() {
        return width * length;
    }

    @Override
    public double getPerimeter() {
        return 2 * (width + length);
    }

    @Override
    public String toString() {
        return "Rectangle["
                + "width=" + width
                + ",length=" + length
                + ",color=" + color
                + ",filled=" + filled
                + ']';
    }
}
