public class Student extends Person {
    private String program;
    private int year;
    private double fee;

    /**
     * contructor method.
     *
     * @param name    is name
     * @param address is address
     * @param program is program
     * @param year    is year
     * @param fee     is fee
     */
    public Student(String name, String address, String program, int year, double fee) {
        super(name, address);
        this.program = program;
        this.year = year;
        this.fee = fee;
    }

    /**
     * get method.
     *
     * @return this
     */
    public String getProgram() {
        return program;
    }

    /**
     * set method.
     *
     * @param program is program
     */
    public void setProgram(String program) {
        this.program = program;
    }

    /**
     * get method.
     *
     * @return this
     */
    public int getYear() {
        return year;
    }

    /**
     * set method.
     *
     * @param year is year
     */
    public void setYear(int year) {
        this.year = year;
    }

    /**
     * get method.
     *
     * @return this
     */
    public double getFee() {
        return fee;
    }

    /**
     * se method.
     *
     * @param fee is fee
     */
    public void setFee(double fee) {
        this.fee = fee;
    }

    /**
     * tostirng method.
     *
     * @return this
     */
    public String toString() {
        return "Student["
                + super.toString()
                + ",program=" + program
                + ",year=" + year
                + ",fee=" + fee
                + "]";
    }
}
