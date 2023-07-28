public abstract class BinaryExpression extends Expression {
    protected Expression left;
    protected Expression right;

    /**
     * constructor method.
     * vì chưa xác định đuược rõ ràng phép tính giữa hai đối tượng nào, nên để là abstract.
     * (vd phép chia thì cần phân biệt trái phải nên cần hàm này).
     *
     * @param left  is left
     * @param right is right
     */
    public BinaryExpression(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }
}
