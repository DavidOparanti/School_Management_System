public class Teachers extends Staff {


    private double totalMoneyEarn;


    public Teachers(int id, String firstName, String lastName, double salary) {
        super(id, firstName, lastName, salary);


    }

    @Override
    public int TotalMoneyEarn() {
        return 0;
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
