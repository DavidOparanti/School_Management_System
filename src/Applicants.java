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

    @Override
    public int getId() {
        return 0;
    }

    @Override
    public void setId(int id) {

    }

    @Override
    public String getFirstName() {
        return null;
    }

    @Override
    public void setFirstName(String firstName) {

    }

    @Override
    public String getLastName() {
        return null;
    }

    @Override
    public void setLastName(String lastName) {

    }

    @Override
    public String getFullName() {
        return null;
    }
}
