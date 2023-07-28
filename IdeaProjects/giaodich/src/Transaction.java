public class Transaction {
    private String operation;
    private double amount;
    private double balance;
    public static final String DEPOSIT = "deposit";
    public static final String WITHDRAW = "withdraw";

    /**
     * hamkhoitao method.
     *
     * @param operation is loai giao dich
     * @param amount    is so tien giao dich
     * @param balance   is do du
     */
    public Transaction(String operation, double amount, double balance) {
        this.operation = operation;
        this.amount = amount;
        this.balance = balance;
    }

    /**
     * getope method.
     *
     * @return this ope
     */
    public String getOperation() {
        return this.operation;
    }

    /**
     * setope method.
     *
     * @param operation is ope
     */
    public void setOperation(String operation) {
        this.operation = operation;
    }

    /**
     * getamount method.
     *
     * @return this amount
     */
    public double getAmount() {
        return this.amount;
    }

    /**
     * setamount method.
     *
     * @param amount is amount
     */
    public void setAmount(double amount) {
        this.amount = amount;
    }

    /**
     * getbalan method.
     *
     * @return this balan
     */
    public double getBalance() {
        return this.balance;
    }

    /**
     * setbalan method.
     *
     * @param balance is balan
     */
    public void setBalance(double balance) {
        this.balance = balance;
    }


}