public abstract class Shape {
    protected String color;
    protected boolean filled;

    /**
     * constructor method.
     */
    public Shape() {

    }

    /**
     * constructor method.
     *
     * @param color  is color
     * @param filled is filled
     */
    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    /**
     * get method.
     *
     * @return color
     */
    public String getColor() {
        return this.color;
    }

    /**
     * set method.
     *
     * @param color is color
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * get method.
     *
     * @return filled
     */
    public boolean isFilled() {
        return this.filled;
    }

    /**
     * set method.
     *
     * @param filled is filled
     */
    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    /**
     * get method.
     *
     * @return area
     */
    public abstract double getArea();

    /**
     * get method.
     *
     * @return perimeter
     */
    public abstract double getPerimeter();

    /**
     * tostring method.
     *
     * @return string
     */
    public String toString() {
        return "Shape["
                + "color='" + color
                + ",filled=" + filled
                + ']';
    }
}