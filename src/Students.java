public class Students extends Persion {
    private int grad;
    private double schoolFee;
    private double feePaid;
    private double feeOwn;

    public Students(int id, String firstName, String lastName, int grad, double schoolFee) {
        super(id, firstName, lastName);

        this.grad = grad;
        this.schoolFee = schoolFee;
    }

    public int getGrade() {
        return this.grad;
    }
}