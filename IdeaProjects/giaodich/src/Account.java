import java.util.ArrayList;
import java.util.List;

public class Account {
    private double balance;
    private ArrayList<Transaction> transitionList = new ArrayList<>();

    /**
     * naptien method.
     *
     * @param amount is tiennap
     */
    private void deposit(double amount) {
        if (amount <= 0) {
            System.out.println("So tien ban nap vao khong hop le!");
        } else {
            balance += amount;
        }
    }

    /**
     * ruttien method.
     *
     * @param amount is tienrut
     */
    private void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("So tien ban rut ra khong hop le!");
        } else {
            if (amount > balance) {
                System.out.println("So tien ban rut vuot qua so du!");
            } else {
                balance -= amount;
            }
        }
    }

    /**
     * giaodich method.
     *
     * @param amount    is tiengiaodich
     * @param operation is loaigiaodich
     */
    public void addTransaction(double amount, String operation) {
        if (operation.equals(Transaction.DEPOSIT)) {
            deposit(amount);
            transitionList.add(new Transaction(Transaction.DEPOSIT, amount, this.balance));
        } else {
            if (operation.equals(Transaction.WITHDRAW)) {
                withdraw(amount);
                transitionList.add(new Transaction(Transaction.WITHDRAW, amount, this.balance));
            } else {
                System.out.println("Yeu cau khong hop le!");
            }
        }
    }

    /**
     * inlenh method.
     */
    public void printTransaction() {
        for (int i = 0; i < transitionList.size(); i++) {
            double amountcuagiaodich = transitionList.get(i).getAmount();
            double balancesaugiaodich = transitionList.get(i).getBalance();
            if (transitionList.get(i).getOperation().equals(Transaction.DEPOSIT)) {
                System.out.printf("Giao dich %d: ", i + 1);
                System.out.printf("Nap tien $%.2f. ", amountcuagiaodich);
                System.out.printf("So du luc nay: $%.2f.\n", balancesaugiaodich);
            } else {
                System.out.printf("Giao dich %d: ", i + 1);
                System.out.printf("Rut tien $%.2f. ", amountcuagiaodich);
                System.out.printf("So du luc nay: $%.2f.\n", balancesaugiaodich);
            }

        }
    }
}

