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

    /**
     *
     * @return the Teacher salary
     */
    @Override
    public int getSalary() {
        return (int) this.salary;
    }

    /**
     *
     * @return The total money earn by the teacher
     */
    @Override
    public int TotalMoneyEarn() {
        return 0;
    }

    /**
     *
     * @return The teachers full name;
     */
    @Override
    public String getFullName() {
        return this.firstName + " " + this.lastName;
    }

    /**
     *
     * @return the Teacher ID;
     */
    @Override
    public int getId() {
        return this.id;
    }
}
