public class Circle extends Shape {
    protected double radius;
    protected Point center;


    /**
     * constructor method.
     */
    public Circle() {

    }

    /**
     * constructor method.
     *
     * @param point  is
     * @param radius is
     * @param color  is
     * @param filled is
     */
    public Circle(Point point, double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
        this.center = point;
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

    /**
     * get method.
     *
     * @return center
     */
    public Point getCenter() {
        return center;
    }

    /**
     * set method.
     *
     * @param center is center
     */
    public void setCenter(Point center) {
        this.center = center;
    }

    /**
     * equals.
     *
     * @param a í a
     * @return bôlean
     */
    public boolean equals(Object a) {
        if (a instanceof Circle) {
            Circle other = (Circle) a;
            boolean ssradius = Math.abs(other.getRadius() - this.getRadius()) <= 0.001;
            return ssradius && other.getCenter().equals(this.getCenter());
        }
        return false;
    }

    /**
     * hashcode.
     *
     * @return ?
     */
    public int hashCode() {
        return 0;
    }

    @Override
    public String toString() {
        return String.format("Circle[center=%s,radius=%.1f,color=%s,filled=%s]",
                this.getCenter().toString(), this.radius, this.color, this.filled);
    }
}
