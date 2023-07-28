public class MotorBike extends Vehicle {
    private boolean hasSidecar;
    private String motorbike = "Motor Bike";

    /**
     * constructor.
     *
     * @param brand              is
     * @param model              is
     * @param registrationNumber is
     * @param owner              is
     * @param hasSidecar         is
     */
    public MotorBike(String brand, String model, String registrationNumber,
                     Person owner, boolean hasSidecar) {
        super(brand, model, registrationNumber, owner);
        this.hasSidecar = hasSidecar;
    }

    /**
     * set.
     *
     * @param hasSidecar is
     */
    public void setHasSidecar(boolean hasSidecar) {
        this.hasSidecar = hasSidecar;
    }

    /**
     * get.
     *
     * @return is
     */
    boolean isHasSidecar() {
        return this.hasSidecar;
    }

    @Override
    public String getInfo() {
        return
                String.format("%s:\n", motorbike)
                        + String.format("\tBrand: %s\n", this.getBrand())
                        + String.format("\tModel: %s\n", this.getModel())
                        + String.format("\tRegistration Number: %s\n", this.getRegistrationNumber())
                        + String.format("\tHas Side Car: %s\n", this.isHasSidecar())
                        + String.format("\tBelongs to %s - %s\n",
                        owner.getName(), owner.getAddress());
    }
}
