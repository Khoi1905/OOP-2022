public abstract class Vehicle {
    protected String brand;
    protected String model;
    protected String registrationNumber;
    protected Person owner;

    /**
     * constructor.
     *
     * @param brand              is
     * @param model              is
     * @param registrationNumber is
     * @param owner              is
     */
    public Vehicle(String brand, String model, String registrationNumber, Person owner) {
        this.brand = brand;
        this.model = model;
        this.registrationNumber = registrationNumber;
        this.owner = owner;
    }

    /**
     * get method.
     *
     * @return brand
     */
    public String getBrand() {
        return brand;
    }

    /**
     * set method.
     *
     * @param brand is
     */
    public void setBrand(String brand) {
        this.brand = brand;
    }

    /**
     * get.
     *
     * @return is
     */
    public String getModel() {
        return model;
    }

    /**
     * set.
     *
     * @param model is
     */
    public void setModel(String model) {
        this.model = model;
    }

    /**
     * get.
     *
     * @return is
     */
    public String getRegistrationNumber() {
        return registrationNumber;
    }

    /**
     * set.
     *
     * @param registrationNumber is
     */
    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    /**
     * get.
     *
     * @return is
     */
    public Person getOwner() {
        return owner;
    }

    /**
     * set.
     *
     * @param owner is
     */
    public void setOwner(Person owner) {
        this.owner = owner;
    }

    /**
     * get.
     *
     * @param newOwer is
     */
    public void transferOwnership(Person newOwer) {
        this.setOwner(newOwer);
    }

    /**
     * get.
     *
     * @return is
     */
    public abstract String getInfo();
}