public class NonAcademicStaff  extends Staff{
    Boolean canTeach;

    public NonAcademicStaff(int id, String firstName, String lastName, double salary,Boolean canTeach) {
        super(id, firstName, lastName, salary);
        this.canTeach = false;
    }

    @Override
    public int TotalMoneyEarn() {
        return 0;
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
    public void setId(int id) {

    }

    @Override
    public String getFirstName() {
        return null;
    }

    @Override
    public void setFirstName(String firstName) {

    }

    @Override
    public String getLastName() {
        return null;
    }

    @Override
    public void setLastName(String lastName) {

    }

}
