import java.util.ArrayList;
import java.util.List;

public class Students extends Persion {
    private int grad;
    private double schoolFee;
    private double feePaid;
    private double feeOwn;
    private List course;

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

    public void setFeePaid(double feePaid) {
        this.feePaid = feePaid;
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