public class Teachers extends Staff {

    Boolean canTeach;
    private double totalMoneyEarn;


    public Teachers(int id, String firstName, String lastName, double salary) {
        super(id, firstName, lastName, salary);
        this.canTeach = true;


    }

    @Override
    public int TotalMoneyEarn() {
        return 0;
    }

    public Boolean getCanTeach() {
        return this.canTeach;
    }

    @Override
    public int getSalary() {
        return 0;
    }


    public double getTotalMoneyEarn() {
        return totalMoneyEarn;
    }

    public void setTotalMoneyEarn(double salary) {
        this.totalMoneyEarn += totalMoneyEarn;
    }


}
