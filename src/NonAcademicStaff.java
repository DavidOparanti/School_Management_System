public class NonAcademicStaff  extends Staff{
    Boolean canTeach;

    public NonAcademicStaff(int id, String firstName, String lastName, double salary,Boolean canTeach) {
        super(id, firstName, lastName, salary);
        this.canTeach = false;
    }

    @Override
    public int getSalary() {
        return 0;
    }

    @Override
    public int TotalMoneyEarn() {
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
}
