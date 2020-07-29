public class Principal extends Staff implements administrative {

    private double moneyEarned;

    public Principal(int id, String firstName, String lastName, double salary) {
        super(id, firstName, lastName, salary);

    }



    @Override
    public int TotalMoneyEarn() {
        return (int) this.getTotalMoneyEarn();
    }

    @Override
    public int getSalary() {
        return this.getSalary();
    }

    @Override
    public String getFullName() {
        return this.getFullName();
    }

    @Override
    public int getId() {
        return this.getId();
    }

    @Override
    public void expelledStudent() {

    }


    @Override
    public void assignedClassToTeacher() {

    }
}
