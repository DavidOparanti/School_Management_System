public class Teachers extends Staff {

    Boolean canTeach;
    private double totalMoneyEarn;
    private int id;
    private int salary;
    private String firstName;
    private String lastName;

    /**
     *
     * @param id for id
     * @param firstName for first name;
     * @param lastName for last name;
     * @param salary for salary
     */
    public Teachers(int id, String firstName, String lastName, double salary) {
        super(id, firstName, lastName, salary);
        this.canTeach = true;


    }

    @Override
    public int TotalMoneyEarn() {
        totalMoneyEarn = totalMoneyEarn + salary;
        return (int) totalMoneyEarn;
    }

    public Boolean getCanTeach() {
        return this.canTeach;
    }

    @Override
    public int getSalary() {
        return this.salary;
    }


    public double getTotalMoneyEarn() {
        return totalMoneyEarn;
    }

    public void setTotalMoneyEarn(double salary) {
        this.totalMoneyEarn += totalMoneyEarn;
    }


    @Override
    public int getId() {
        return this.id;
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
       this.firstName = firstName;
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
}
