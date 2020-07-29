public class Principal extends Staff implements administrative {

    private double moneyEarned;
    private int salary;
    private String firstName;
    private String lastName;
    private int id;

    public Principal(int id, String firstName, String lastName, double salary) {
        super(id, firstName, lastName, salary);

    }



    @Override
    public int TotalMoneyEarn() {
        return (int) this.getTotalMoneyEarn();
    }

    @Override
    public int getSalary() {
        return this.salary;
    }

    //@Override
    public String getFullName() {
        return this.firstName + " " + this.lastName;
    }

    @Override
    public int getId() {
        return this.id;
    }

    @Override
    public void expelledStudent() {

    }


    @Override
    public void assignedClassToTeacher() {

    }
}
