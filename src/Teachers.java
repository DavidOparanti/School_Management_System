public class Teachers extends Staff {


    private double totalMoneyEarn;


    public Teachers(int id, String firstName, String lastName, double salary) {
        super(id, firstName, lastName, salary);


    }


    /**
     *
     * @return The total money earn by the teacher
     */
    @Override
    public int TotalMoneyEarn() {
        return 0;
    }

    @Override
    public int getSalary() {
        return 0;
    }


}
