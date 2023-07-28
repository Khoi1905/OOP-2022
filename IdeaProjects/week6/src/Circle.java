public class Circle extends Shape {
    protected double radius;

    /**
     * constructor method.
     */
    public Circle() {

    }

    /**
     * constructor method.
     *
     * @param radius is radius
     */
    public Circle(double radius) {
        this.radius = radius;
    }

    /**
     * constructor method.
     *
     * @param radius is radius
     * @param color  is color
     * @param filled is filled
     */
    public Circle(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }

    /**
     * get method.
     *
     * @return radius
     */
    public double getRadius() {
        return this.radius;
    }

    /**
     * set method.
     *
     * @param radius is radius
     */
    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.pow(radius, 2) * Math.PI;
    }

    @Override
    public double getPerimeter() {
        return 2 * radius * Math.PI;
    }

    @Override
    public String toString() {
        return "Circle["
                + "radius=" + radius
                + ",color=" + color
                + ",filled=" + filled
                + ']';
    }
}
