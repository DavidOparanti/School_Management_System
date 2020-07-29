import java.util.ArrayList;
import java.util.List;

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
        List<String> stu = new ArrayList<>();
        stu.add("Benedict");
        School sch = new School(stu);


    }

    @Override
    public void assignedClassToTeacher() {

    }
}
