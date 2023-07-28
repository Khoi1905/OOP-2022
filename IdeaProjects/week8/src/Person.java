import java.util.ArrayList;
import java.util.List;

public class Person {
    private String name;
    private String address;
    private List<Vehicle> vehicleList = new ArrayList<>();

    /**
     * constructor.
     *
     * @param name    is
     * @param address is
     */
    public Person(String name, String address) {
        this.name = name;
        this.address = address;
    }

    /**
     * get.
     *
     * @return is
     */
    public String getName() {
        return name;
    }

    /**
     * set.
     *
     * @param name is
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * get.
     *
     * @return is
     */
    public String getAddress() {
        return address;
    }

    /**
     * set.
     *
     * @param address is
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * add.
     *
     * @param vehicle is
     */
    public void addVehicle(Vehicle vehicle) {
        vehicleList.add(vehicle);
    }

    /**
     * remove.
     *
     * @param registrationNumber is
     */
    public void removeVehicle(String registrationNumber) {
        for (int i = 0; i < vehicleList.size(); ++i) {
            if (vehicleList.get(i).getRegistrationNumber().equals(registrationNumber)) {
                vehicleList.remove(vehicleList.get(i));
            }
        }
    }

    /**
     * get.
     *
     * @return is
     */
    public String getVehiclesInfo() {
        if (vehicleList.size() == 0) {
            return String.format("%s has no vehicle!", this.getName());
        } else {
            String ans = this.getName() + " has:\n\n";
            for (int i = 0; i < vehicleList.size(); ++i) {
                ans += vehicleList.get(i).getInfo();
            }
            return ans;
        }
    }
}
