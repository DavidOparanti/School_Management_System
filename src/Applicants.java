public class Applicants extends Persion {
    private String phoneNo;
    private String address;
    private String yearApply;
    private String courseApply;
    private String dateOfBirth;

    public Applicants(int id, String firstName, String lastName, String phoneNo, String address, String yearApply, String courseApply, String dateOfBirth) {
        super(id, firstName, lastName);
        this.phoneNo = phoneNo;
        this.address = address;
        this.yearApply = yearApply;
        this.courseApply = courseApply;
        this.dateOfBirth = dateOfBirth;
    }

}
