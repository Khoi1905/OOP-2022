public class Circle {
    protected static final double PI = 3.14;
    private double radius = 1.0;
    private String color = "red";

    public static final double Pi = 3.14;

    /**
     * bump method.
     */
    public Circle() {

    }

    /**
     * bankinh method.
     *
     * @param radius is bankinh
     */
    public Circle(double radius) {
        this.radius = radius;
    }

    /**
     * khoitao method.
     *
     * @param radius is bankinh
     * @param color  is mau
     */
    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    /**
     * get method.
     *
     * @return this
     */
    public double getRadius() {
        return radius;
    }

    /**
     * s method.
     *
     * @param radius is radius
     */
    public void setRadius(double radius) {
        this.radius = radius;
    }

    /**
     * get method.
     *
     * @return this
     */
    public String getColor() {
        return color;
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
     * dientich method.
     *
     * @return this
     */
    public double getArea() {
        return this.radius * PI * this.radius;
    }

    /**
     * in method.
     *
     * @return this
     */
    public String toString() {
        return "Circle[radius=" + this.radius + ",color=" + this.color + "]";
    }
}