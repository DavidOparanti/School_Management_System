public class Principal extends Staff implements administrative {

    private double moneyEarned;

    public Principal(int id, String firstName, String lastName, double salary) {
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

    @Override
    public String getFullName() {
        return null;
    }

    @Override
    public int getId() {
        return 0;
    }

    @Override
    public void expelledStudent() {

    }

    @Override
    public void assignedClassToTeacher() {

    }
}
