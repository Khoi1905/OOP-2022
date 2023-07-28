public class Person<T> implements Comparable<Person> {
    protected String name;
    protected int age;
    protected String address;

    public Person() {

    }

    /**
     * constructor.
     *
     * @param name    is
     * @param age     is
     * @param address is
     */
    public Person(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * viết lại hàm compareTo để so sánh, việc gọi hàm compareTo ở dòng 42 kp là đệ quy mà là.
     * gọi tới phương thức compareTo của một đối tượng khác.
     * ngoài ra có thể thay dòng 46 thành return this.age.compareTo(o.getAge()) nếu age là kiểu.
     * Interger vì kiểu int kh có phương thức này.
     *
     * @param o the object to be compared.
     * @return is
     */
    public int compareTo(Person o) {
        int temp = this.name.compareTo(o.getName());
        if (temp == 0) {
            return this.age - o.getAge();
        }
        return temp;
    }
}
