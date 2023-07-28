public class Addition extends BinaryExpression {

    /**
     * constructor method.
     * vì chưa xác định đuược rõ ràng phép tính giữa hai đối tượng nào, nên để là abstract.
     * (vd phép chia thì cần phân biệt trái phải nên cần hàm này).
     *
     * @param left  is left
     * @param right is right
     */
    public Addition(Expression left, Expression right) {
        super(left, right);
    }

    @Override
    public double evaluate() {
        return left.evaluate() + right.evaluate();
    }

    /**
     * %s là chuỗi ký tự, in theo mẫu string của bài.
     *
     * @return hi
     */
    public String toString() {
        return String.format("(%s + %s)", left, right);
    }
}
