public class Staff extends Person {
    private String school;
    private double pay;

    /**
     * contructor method.
     *
     * @param name    is name
     * @param address is address
     * @param school  is school
     * @param pay     is pay
     */
    public Staff(String name, String address, String school, double pay) {
        super(name, address);
        this.school = school;
        this.pay = pay;
    }

    /**
     * get method.
     *
     * @return this
     */
    public String getSchool() {
        return school;
    }

    /**
     * set method.
     *
     * @param school is school
     */
    public void setSchool(String school) {
        this.school = school;
    }

    /**
     * get method.
     *
     * @return this
     */
    public double getPay() {
        return pay;
    }

    /**
     * set method.
     *
     * @param pay is pay
     */
    public void setPay(double pay) {
        this.pay = pay;
    }

    /**
     * tostring method.
     *
     * @return this
     */
    public String toString() {
        return "Staff["
                + super.toString()
                + ",school=" + school
                + ",pay=" + pay
                + "]";
    }
}
