public class Car extends Vehicle {

    private int numberOfDoors;
    private String car = "Car";

    /**
     * constructor.
     *
     * @param brand              is
     * @param model              is
     * @param registrationNumber is
     * @param owner              is
     * @param numberOfDoors      is
     */
    public Car(String brand, String model, String registrationNumber,
               Person owner, int numberOfDoors) {
        super(brand, model, registrationNumber, owner);
        this.numberOfDoors = numberOfDoors;
    }

    /**
     * get.
     *
     * @return is
     */
    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    /**
     * get.
     *
     * @param numberOfDoors is
     */
    public void setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }

    @Override
    public String getInfo() {
        return
                String.format("%s:\n", car)
                        + String.format("\tBrand: %s\n", this.getBrand())
                        + String.format("\tModel: %s\n", this.getModel())
                        + String.format("\tRegistration Number: %s\n", this.getRegistrationNumber())
                        + String.format("\tNumber of Doors: %d\n", this.getNumberOfDoors())
                        + String.format("\tBelongs to %s - %s\n",
                        owner.getName(), owner.getAddress());
    }
}
