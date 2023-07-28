public class CheckingAccount extends Account {
    public CheckingAccount(long accountnumber, double balance) {
        super(accountnumber, balance);
    }

    @Override
    public void withdraw(double input) {
        try {
            double money = this.getBalance();
            this.doWithdrawing(input);
            this.addTransaction(new Transaction(2, input, money, this.getBalance()));
        } catch (BankException e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public void deposit(double input) {
        try {
            double money = this.getBalance();
            this.doDepositing(input);
            this.addTransaction(new Transaction(1, input, money, this.getBalance()));
        } catch (BankException e) {
            System.out.println(e.getMessage());
        }
    }

}
