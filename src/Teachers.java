public class Teachers extends Staff {
    private int id;
    private String firstName;
    private String lastName;
    private double salary;
    private double totalMoneyEarn;

    public Teachers(int id, String firstName, String lastName, double salary) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
    }

    @Override
    public int getSalary() {
        return 0;
    }

    @Override
    public int TotalMoneyEarn() {
        return 0;
    }
}
