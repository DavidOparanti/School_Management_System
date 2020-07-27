public abstract class Staff extends Persion {


    public Staff(int id, String firstName, String lastName) {
        super(id, firstName, lastName);
    }


    public abstract int TotalMoneyEarn();

    public abstract int getSalary();
}
