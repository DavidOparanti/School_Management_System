public abstract class Staff extends Persion {


    private double salary;
    private double totalMoneyEarn;


    public Staff(int id, String firstName, String lastName, double salary) {
        super(id, firstName, lastName);
        this.salary = salary;
        this.totalMoneyEarn += salary;
    }


    public abstract int TotalMoneyEarn();

    public abstract int getSalary();

    public double getTotalMoneyEarn() {
        return totalMoneyEarn;
    }

    public void setTotalMoneyEarn(double totalMoneyEarn) {
        this.totalMoneyEarn = totalMoneyEarn;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
