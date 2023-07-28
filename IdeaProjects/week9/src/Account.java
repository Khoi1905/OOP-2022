import java.util.ArrayList;
import java.util.List;

public abstract class Account {
    public static final String CHECKING = "CHECKING";
    public static final String SAVINGS = "SAVINGS";
    private long accountNumber;
    private double balance;
    protected List<Transaction> transactionList = new ArrayList<>();

    public Account() {

    }

    public Account(long accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public long getAccountNumber() {
        return this.accountNumber;
    }

    public double getBalance() {
        return this.balance;
    }

    /**
     * phuong thuc de rut tien.
     *
     * @param input is tien rut
     * @throws BankException ngoai le
     */
    public void doWithdrawing(double input) throws BankException {
        if (input > balance) {
            throw new InsufficientFundsException(input);
        } else if (input <= 0) {
            throw new InvalidFundingAmountException(input);
        } else {
            balance -= input;
        }
    }

    /**
     * phuong thuc nap tien.
     *
     * @param input is tien nap
     * @throws BankException ngoai le
     */
    public void doDepositing(double input) throws BankException {
        if (input <= 0) {
            throw new InvalidFundingAmountException(input);
        } else {
            balance += input;
        }
    }

    /**
     * abstract.
     *
     * @param input is so tien rut
     */
    public abstract void withdraw(double input);

    /**
     * abstract.
     *
     * @param input is so tien nap
     */
    public abstract void deposit(double input);

    /**
     * to string method.
     *
     * @return string
     */
    public String getTransactionHistory() {
        StringBuilder ans = new StringBuilder("Lịch sử giao dịch của tài khoản "
                + this.accountNumber + ":\n");
        for (int i = 0; i < transactionList.size(); i++) {
            ans.append(transactionList.get(i).getTransactionSummary());
        }
        return ans.toString();
    }

    /**
     * them giao dich.
     *
     * @param transaction is giao dich
     */
    public void addTransaction(Transaction transaction) {
        transactionList.add(transaction);
    }

    /**
     * equals method.
     *
     * @param temp is
     * @return boolean
     */
    public boolean equals(Object temp) {
        if (temp instanceof Account) {
            Account other = (Account) temp;
            if (other.getAccountNumber() == this.getAccountNumber()) {
                return true;
            }
        }
        return false;
    }
}