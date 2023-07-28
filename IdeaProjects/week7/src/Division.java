public class Division extends BinaryExpression {

    /**
     * constructor method.
     * vì chưa xác định đuược rõ ràng phép tính giữa hai đối tượng nào, nên để là abstract.
     * (vd phép chia thì cần phân biệt trái phải nên cần hàm này).
     *
     * @param left  is left
     * @param right is right
     */
    public Division(Expression left, Expression right) {
        super(left, right);
    }

    @Override
    public double evaluate() throws ArithmeticException {
        if (right.evaluate() == 0) {
            throw new ArithmeticException("Lỗi chia cho 0");
        } else {
            return left.evaluate() / right.evaluate();
        }
    }

    @Override
    public String toString() {
        return String.format("(%s / %s)", left, right);
    }
}
