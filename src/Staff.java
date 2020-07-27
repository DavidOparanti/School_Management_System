public abstract class Staff extends Persion {


    public Staff(String firstName, String lastName) {
        super(firstName, lastName);
    }

    public abstract int getSalary();

    public abstract int TotalMoneyEarn();

    public abstract String getFullName();

    public abstract int getId();


}
