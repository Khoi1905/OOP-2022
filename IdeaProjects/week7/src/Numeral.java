public class Numeral extends Expression {
    private double value;

    @Override
    public double evaluate() {
        return value;
    }

    @Override
    public String toString() {
        return String.format("%.0f", value);
    }

    /**
     * construction method.
     *
     * @param value is value
     */
    public Numeral(double value) {
        this.value = value;
    }

    /**
     * hi.
     */
    public Numeral() {

    }
}
