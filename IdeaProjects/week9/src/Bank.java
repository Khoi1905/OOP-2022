import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Bank {
    private List<Customer> customerList = new ArrayList<>();

    /**
     * is.
     *
     * @param inputStream is
     */
    public void readCustomerList(InputStream inputStream) {
        try {
            InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
            String line = bufferedReader.readLine();
            Customer customer = new Customer();
            Account acc;
            if (line != null) {
                String name;
                String id;
                name = line.substring(0, line.length() - 10);
                id = line.substring(name.length() + 1, line.length());
                long idNumber = Long.parseLong(id);
                customer = new Customer(idNumber, name);
            }
            while ((line = bufferedReader.readLine()) != null) {
                if (!(line.charAt(0) <= '9' && line.charAt(0) >= '0')) {
                    customerList.add(customer);
                    String name;
                    String id;
                    name = line.substring(0, line.length() - 10);
                    id = line.substring(name.length() + 1, line.length());
                    long idNumber = Long.parseLong(id);
                    customer = new Customer(idNumber, name);
                } else {
                    String[] parts = line.split(" ");
                    long number = Long.parseLong(parts[0]);
                    double balance = Double.parseDouble(parts[2]);
                    if (parts[1].equals("CHECKING")) {
                        acc = new CheckingAccount(number, balance);
                    } else {
                        acc = new SavingsAccount(number, balance);
                    }
                    customer.addAccount(acc);
                }
            }
            customerList.add(customer);
        } catch (Exception e) {
            System.out.println("Error input file");
        }
    }

    /**
     * is.
     *
     * @return is
     */
    public String getCustomersInfoByNameOrder() {
        List<Customer> list = new ArrayList<>(this.customerList);
        list.sort(Comparator.comparing(Customer::getFullName));
        StringBuilder ans = new StringBuilder();
        for (Customer customer : list) {
            ans.append(customer.getCustomerInfo()).append("\n");
        }
        return ans.toString().trim();
    }

    /**
     * is.
     *
     * @return is
     */
    public String getCustomersInfoByIdOrder() {
        List<Customer> list = new ArrayList<>(this.customerList);
        list.sort(Comparator.comparing(Customer::getIdNumber));
        StringBuilder ans = new StringBuilder();
        for (Customer customer : list) {
            ans.append(customer.getCustomerInfo()).append("\n");
        }
        return ans.toString().trim();
    }

    /**
     * is.
     *
     * @return is
     */
    public List<Customer> getCustomerList() {
        return customerList;
    }

}
