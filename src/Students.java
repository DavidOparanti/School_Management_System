import java.util.ArrayList;
import java.util.List;

public class Students extends Persion {
    private int grad;
    private double schoolFee;
    private double feePaid;
    private double feeOwn;
    private List course;
    private int id;
    private String firstName;
    private String lastName;

    public Students(int id, String firstName, String lastName, int grad, double schoolFee) {
        super(id, firstName, lastName);

        this.grad = grad;
        this.schoolFee = schoolFee;
    }
    public Students(int id) {
        super(id);
    }

    @Override
    public int getId() {
        return this. id;
    }

    @Override
    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String getFirstName() {
        return this.firstName;
    }

    @Override
    public void setFirstName(String firstName) {
        this.firstName = this.firstName;
    }

    @Override
    public String getLastName() {
        return this.lastName;
    }

    @Override
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String getFullName() {
        return this.firstName + " " + this.lastName;
    }

    public int getGrade() {
        return this.grad;
    }

    public int getGrad() {
        return grad;
    }

    public void setGrad(int grad) {
        this.grad = grad;
    }

    public double getSchoolFee() {
        return schoolFee;
    }

    public void setSchoolFee(double schoolFee) {
        this.schoolFee = schoolFee;
    }

    public double getFeePaid() {
        return feePaid;
    }

    public double setFeePaid(double feePaid) {
        this.feePaid = feePaid;
        return feePaid;
    }

    public double getFeeOwn() {
        return this.schoolFee - this.feePaid;
    }

    public void setFeeOwn(double feeOwn) {
        this.feeOwn = this.getFeeOwn();
    }

    public String getCourse() {
        return course.toString();
    }

    public void setCourse(List course) {
        this.course = new ArrayList<>();
    }
}