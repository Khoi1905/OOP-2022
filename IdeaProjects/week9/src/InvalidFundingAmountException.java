public class InvalidFundingAmountException extends BankException {
    /**
     * ngoại lệ.
     *
     * @param input is số tiền giao dịch
     */
    public InvalidFundingAmountException(double input) {
        super(String.format("Số tiền không hợp lệ: $%.2f", input));
    }
}
