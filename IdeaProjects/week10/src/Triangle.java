public class Triangle implements GeometricObject {
    private Point p1;
    private Point p2;
    private Point p3;

    /**
     * constructor.
     *
     * @param p1 is
     * @param p2 is
     * @param p3 is
     * @throws RuntimeException is
     */

    public Triangle(Point p1, Point p2, Point p3) throws RuntimeException {
        double a1 = p1.distance(p2);
        double a2 = p2.distance(p3);
        double a3 = p3.distance(p1);
        if (a1 + a2 <= a3 || a1 + a3 <= a2 || a2 + a3 <= a1) {
            throw new RuntimeException();
        }
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
    }

    public Point getP1() {
        return p1;
    }

    public Point getP2() {
        return p2;
    }

    public Point getP3() {
        return p3;
    }

    @Override
    public double getArea() {
        return Math.abs(p1.getPointX() * (p2.getPointY() - p3.getPointY())
                + p2.getPointX() * (p3.getPointY() - p1.getPointY())
                + p3.getPointX() * (p1.getPointY() - p2.getPointY())) / 2;
    }

    @Override
    public double getPerimeter() {
        return (p1.distance(p2) + p2.distance(p3) + p3.distance(p1));
    }

    @Override
    public String getInfo() {
        return String.format("Triangle[(%.2f,%.2f),(%.2f,%.2f),(%.2f,%.2f)]",
                p1.getPointX(), p1.getPointY(), p2.getPointX(), p2.getPointY(),
                p3.getPointX(), p3.getPointY());
    }
}
