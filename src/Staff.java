public abstract class Staff extends Persion {
     private double salary;

    public Staff(int id, String firstName, String lastName, double salary) {
        super(id, firstName, lastName);
        this.salary = salary;
    }


    public abstract int TotalMoneyEarn();

    public abstract int getSalary();
}
