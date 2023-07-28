public class InsufficientFundsException extends BankException {
    /**
     * ngoại lệ.
     *
     * @param input is
     */
    public InsufficientFundsException(double input) {
        super(String.format("Số dư tài khoản không đủ $%.2f để thực hiện giao dịch", input));
    }
}
