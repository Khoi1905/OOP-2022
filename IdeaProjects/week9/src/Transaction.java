public class Transaction {
    public static final int TYPE_DEPOSIT_CHECKING = 1;
    public static final int TYPE_WITHDRAW_CHECKING = 2;
    public static final int TYPE_DEPOSIT_SAVINGS = 3;
    public static final int TYPE_WITHDRAW_SAVINGS = 4;

    protected int type;
    protected double amount;
    protected double initialBalance;
    protected double finalBalance;

    /**
     * is.
     *
     * @param type           i
     * @param amount         í
     * @param initialBalance ì
     * @param finalBalance   i
     */
    public Transaction(int type, double amount, double initialBalance, double finalBalance) {
        this.type = type;
        this.amount = amount;
        this.initialBalance = initialBalance;
        this.finalBalance = finalBalance;
    }

    /**
     * nhan dien tai khoan.
     *
     * @param input is
     * @return loai tai khoan
     */
    private String getTransactionTypeString(int input) {
        if (input == TYPE_DEPOSIT_CHECKING) {
            return "Nạp tiền vãng lai";
        }
        if (input == TYPE_WITHDRAW_CHECKING) {
            return "Rút tiền vãng lai";
        }
        if (input == TYPE_DEPOSIT_SAVINGS) {
            return "Nạp tiền tiết kiệm";
        }
        if (input == TYPE_WITHDRAW_SAVINGS) {
            return "Rút tiền tiết kiệm";
        }
        return null;
    }

    /**
     * to string.
     *
     * @return string
     */
    protected String getTransactionSummary() {
        return String.format("- Kiểu giao dịch: %s. Số dư ban đầu: $%.2f."
                        + " Số tiền: $%.2f. Số dư cuối: $%.2f.\n",
                this.getTransactionTypeString(this.type),
                this.initialBalance, this.amount, this.finalBalance);
    }
}
