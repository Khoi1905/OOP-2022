public class ExpressionTest {
    /**
     * Main method.
     */
    public static void main(String[] args) {
        Numeral numeral10 = new Numeral(10);
        Square square1 = new Square(numeral10);
        Numeral numeral3 = new Numeral(3);
        Numeral numeral4 = new Numeral(4);
        Subtraction subtraction0 = new Subtraction(square1, numeral3);
        Multiplication multiplication34 = new Multiplication(numeral4, numeral3);
        Addition addition1 = new Addition(subtraction0, multiplication34);
        Square square2 = new Square(addition1);
        System.out.println(square2);
    }
}
