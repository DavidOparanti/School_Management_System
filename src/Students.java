public class Students<amount, amt> {

    private int id;
    private String firstName;
    private String lastName;
    private int grade;
    private int schoolFee;
    private int feePid = 0;
    private static int studentCount = 0;


    /**
     *Create a new Student object.
     * @param id for the student.
     * @param firstName for the student
     * @param lastName for the student
     * @param grade for the student
     * @param schoolFee for the student
     */
    public Students(int id, String firstName, String lastName, int grade, int schoolFee) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.grade = grade;
        studentCount++;

    }

    /**
     * Pay student school fee
     */
    public void payFees(int amount) {
        this.feePid = amount;
    }

    public int getStudentCount() {
        return studentCount;
    }

    public int getFeeBalance() {
        return this.schoolFee - feePid;
    }

    public  int getSchoolFee() {
        return this.schoolFee;
    }

    public int getId() {
        return this.id;
    }

    public String getFullName() {
        return this.firstName + "" + this.lastName;
    }

    public int getGrade() {
        return this.grade;
    }
}
