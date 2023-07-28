public class StudentManagement {

    public static Student[] students = new Student[100];

    /**
     * sameGroup method.
     *
     * @param s1 argument s1
     * @param s2 argument s2
     * @return s1==s2
     */
    public static boolean sameGroup(Student s1, Student s2) {
        return (s1.getGroup().equals(s2.getGroup()));
    }

    /**
     * addStudent method.
     *
     * @param newStudent argument newStudent
     */
    public static void addStudent(Student newStudent) {
        int i = 0;
        boolean exited = true;
        for (; i < 100; i++) {
            if (students[i] != null) {
                if (students[i].getId() == newStudent.getId()) {
                    exited = false;
                    break;
                }
            } else {
                break;
            }
        }
        if (exited == true) {
            students[i] = newStudent;
        }
    }

    public static String[] listGr;

    /**
     * getGr method.
     *
     * @return listGr
     */
    public static String[] getGr() {
        listGr = new String[100];
        listGr[0] = students[0].getGroup();

        for (int i = 0; i < 100; i++) {
            if (students[i] == null) {
                break;
            }
            for (int j = 0; j < 100; j++) {
                if (listGr[j] == null) {
                    listGr[j] = students[i].getGroup();
                }

                if (students[i].getGroup().equals(listGr[j])) {
                    break;
                }
            }
        }
        return listGr;
    }

    /**
     * studentsByGroup method.
     *
     * @return list
     */
    public static String studentsByGroup() {
        listGr = getGr();
        StringBuilder list;
        list = new StringBuilder();
        for (int i = 0; i < listGr.length; i++) {
            if (listGr[i] == null) {
                break;
            }
            list.append(listGr[i]).append('\n');
            for (int j = i; j < students.length; j++) {
                if (students[j] == null) {
                    break;
                }
                if (students[j].getGroup().equals(listGr[i])) {
                    list.append(students[j].getInfo()).append('\n');
                }
            }
        }
        return list.toString();
    }

    /**
     * findid method.
     *
     * @param id argument id
     * @return index
     */
    public static int findid(String id) {
        int i;
        for (i = 0; i < students.length; i++) {
            if (students[i].getId().equals(id)) {
                break;
            }
        }
        return i;
    }

    /**
     * removeStudent method.
     *
     * @param id - argument id
     */
    public static void removeStudent(String id) {
        for (int i = findid(id); i < students.length - 1; i++) {
            students[i] = students[i + 1];
        }
    }

    /**
     * main method.
     *
     * @param args - arguments
     */
    public static void main(String[] args) {
        Student a = new Student();
        a.setName("Nguyen Van An");
        a.setId("17020001");
        a.setGroup("K62CC");
        a.setEmail("17020001@vnu.edu.vn");

        addStudent(a);

        Student b = new Student();
        b.setName("Nguyen Van B");
        b.setId("17020002");
        b.setGroup("K62CC");
        b.setEmail("17020002@vnu.edu.vn");

        addStudent(b);

        Student c = new Student("Nguyen Van C", "17020003", "17020003@vnu.edu.vn");
        addStudent(c);

        Student d = new Student("Nguyen Van D", "17020004", "17020004@vnu.edu.vn");
        addStudent(d);

        removeStudent("17020004");
        System.out.println(studentsByGroup());
    }
}
