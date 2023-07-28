public class Cylinder extends Circle {
    private double height = 1.0;

    /**
     * khoitao method.
     */
    public Cylinder() {

    }

    /**
     * khoitao method.
     *
     * @param radius is bankinh
     */
    public Cylinder(double radius) {
        super(radius);
    }

    /**
     * khoitao method.
     *
     * @param radius is bankinh
     * @param height is chieucao
     */
    public Cylinder(double radius, double height) {
        super(radius);
        this.height = height;
    }

    /**
     * khoitao method.
     *
     * @param radius is bankinh
     * @param color  is mausac
     * @param height is chieucao
     */
    public Cylinder(double radius, double height, String color) {
        super(radius, color);
        this.height = height;
    }

    /**
     * get method.
     *
     * @return this
     */
    public double getHeight() {
        return height;
    }

    /**
     * set method.
     *
     * @param height is height
     */
    public void setHeight(double height) {
        this.height = height;
    }

    /**
     * dttp method.
     *
     * @return this
     */
    public double getArea() {
        return 2 * super.getArea() + 2 * this.height * PI * super.getRadius();
    }

    /**
     * thetich method.
     *
     * @return this
     */
    public double getVolume() {
        return height * getArea();
    }

    /**
     * tostring method.
     *
     * @return this
     */
    public String toString() {
        return "[" + super.toString() + ",height=" + this.height + "]";
    }
}
