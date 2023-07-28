public class Point {
    private double pointX;
    private double pointY;

    public Point(double pointX, double pointY) {
        this.pointX = pointX;
        this.pointY = pointY;
    }

    public double getPointX() {
        return pointX;
    }

    public void setPointX(double pointX) {
        this.pointX = pointX;
    }

    public double getPointY() {
        return this.pointY;
    }

    public void setPointY(double pointY) {
        this.pointY = pointY;
    }

    /**
     * distance.
     *
     * @param other is
     * @return is
     */
    public double distance(Point other) {
        return Math.sqrt(Math.pow((other.getPointX() - this.getPointX()), 2)
                + Math.pow((other.getPointY() - this.getPointY()), 2));
    }
}
