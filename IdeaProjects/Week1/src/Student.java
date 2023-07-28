public class Student {
    private String name;
    private String id;
    private String group;
    private String email;


    /**
     * Student mothod.
     */
    public Student() {
        this.name = "Student";
        this.id = "000";
        this.group = "K62CB";
        this.email = "uet@vnu.edu.vn";
    }

    /**
     * Student method.
     *
     * @param name  argument name
     * @param id    argument id
     * @param email argument email
     */
    public Student(String name, String id, String email) {
        this.name = name;
        this.id = id;
        this.group = "K62CB";
        this.email = email;
    }

    /**
     * Student method.
     *
     * @param s argument s
     */
    public Student(Student s) {
        this.name = s.getName();
        this.id = s.getId();
        this.group = s.getGroup();
        this.email = s.getEmail();
    }

    /**
     * getName method.
     *
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * setName method.
     *
     * @param name argument name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * getId method.
     *
     * @return id
     */
    public String getId() {
        return id;
    }

    /**
     * setId method.
     *
     * @param id argument id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * getGroup method.
     *
     * @return group
     */
    public String getGroup() {
        return group;
    }

    /**
     * setGroup method.
     *
     * @param group argument group
     */
    public void setGroup(String group) {
        this.group = group;
    }

    /**
     * getEmail method.
     *
     * @return email
     */
    public String getEmail() {
        return email;
    }

    /**
     * setEmail method.
     *
     * @param email argument email
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * getInFor method.
     *
     * @return ten
     */
    public String getInfo() {

        return (name + " - " + id + " - " + group + " - " + email);
    }
}