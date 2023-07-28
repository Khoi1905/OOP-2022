public class Square extends Expression {

    private Expression expression;

    /**
     * trả về bình phương phép tính, vd numeral sẽ trả về value*value.
     * addition sẽ trả về phép cộng*phép cộng.
     *
     * @return hi
     */
    public double evaluate() {
        return expression.evaluate() * expression.evaluate();
    }

    @Override
    public String toString() {
        return String.format("(%s) ^ 2", expression);
    }

    /**
     * hi.
     *
     * @param expression is một phép tính
     */
    public Square(Expression expression) {
        this.expression = expression;
    }
}
