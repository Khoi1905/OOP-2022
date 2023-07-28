import java.util.Objects;

public class Point {
    private double pointX;
    private double pointY;

    /**
     * contrustor method.
     *
     * @param pointX is x
     * @param pointY is y
     */
    public Point(double pointX, double pointY) {
        this.pointX = pointX;
        this.pointY = pointY;
    }

    /**
     * get method.
     *
     * @return x
     */
    public double getPointX() {
        return pointX;
    }

    /**
     * set method.
     *
     * @param pointX is x
     */
    public void setPointX(double pointX) {
        this.pointX = pointX;
    }

    /**
     * get method.
     *
     * @return y
     */
    public double getPointY() {
        return pointY;
    }

    /**
     * set method.
     *
     * @param pointY is y
     */
    public void setPointY(double pointY) {
        this.pointY = pointY;
    }

    /**
     * khoangcach method.
     *
     * @param a is diem
     * @return khoangcach
     */
    public double distance(Point a) {
        double temp1 = a.getPointX() - this.getPointX();
        double temp2 = a.getPointY() - this.getPointY();
        return Math.sqrt(Math.pow(temp1, 2) + Math.pow(temp2, 2));
    }

    /**
     * sosanh method.
     *
     * @param a is a
     * @return bang
     */
    public boolean equals(Object a) {
        if (a instanceof Point) {
            Point other = (Point) a;
            boolean sspointx = Math.abs(other.getPointX() - this.getPointX()) <= 0.001;
            boolean sspointy = Math.abs(other.getPointY() - this.getPointY()) <= 0.001;
            return sspointx && sspointy;
        }
        return false;
    }

    /**
     * deohieu method.
     *
     * @return h
     */
    public int hashCode() {
        return Objects.hash(this.getPointX(), this.getPointY());
    }

    @Override
    public String toString() {
        return String.format("(%.1f,%.1f)", pointX, pointY);
    }
}

