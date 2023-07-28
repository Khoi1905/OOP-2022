import java.util.Objects;

public class Rectangle extends Shape {
    protected double width;
    protected double length;
    protected Point topLeft;

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
     * cconstructor method.
     * @param point is
     * @param width is
     * @param length is
     * @param color is
     * @param filled is
     */
    public Rectangle(Point point, double width, double length, String color, boolean filled) {
        super(color, filled);
        this.width = width;
        this.length = length;
        this.topLeft = point;
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
        return String.format("Rectangle[topLeft=%s,width=%.1f,length=%.1f,color=%s,filled=%s]",
                topLeft.toString(), width, length, color, filled);
    }

    /**
     * get method.
     *
     * @return topleft
     */
    public Point getTopLeft() {
        return topLeft;
    }

    /**
     * set method.
     *
     * @param topLeft is topleft
     */
    public void setTopLeft(Point topLeft) {
        this.topLeft = topLeft;
    }

    /**
     * equal.
     *
     * @param object is obj
     * @return boolean
     */
    public boolean equals(Object object) {
        if (object instanceof Rectangle) {
            Rectangle other = (Rectangle) object;
            boolean sswith = Math.abs(other.width - this.width) <= 0.001;
            boolean sslength = Math.abs(other.length - this.length) <= 0.001;
            return topLeft.equals(other.topLeft) && sswith && sslength;
        }
        return false;
    }

    /**
     * sd.
     *
     * @return hashcode
     */
    public int hashCode() {
        return Objects.hash(this.getWidth(), this.getTopLeft(), this.getLength());
    }


}
