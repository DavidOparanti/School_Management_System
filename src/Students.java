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

    /**
     *
     * @return the total number of students
     */
    public int getStudentCount() {
        return studentCount;
    }

    /**
     *
     * @return the amount owns(the school fees balance)
     */
    public int getFeeBalance() {
        return this.schoolFee - feePid;
    }

    /**
     *
     * @return return the school to be paid by the student.
     */
    public  int getSchoolFee() {
        return this.schoolFee;
    }

    /**
     *
     * @return the student ID;
     */
    public int getId() {
        return this.id;
    }

    /**
     *
     * @return the full name of student.
     */
    public String getFullName() {
        return this.firstName + "" + this.lastName;
    }

    /**
     *
     * @return the current grade of the student
     */
    public int getGrade() {
        return this.grade;
    }
}
