import java.util.List;

public class School {

    private List<Teachers> teachers;
    private List<Students> students;
    private List<Courses> courses;
    private List<Classes> stacks;
    private static int  totalMoneyEarned;
    private static int totalMoneySpent;


    public School(List<Teachers> teachers, List<Students> students, List<Courses> courses, List<Classes> stacks) {
        this.teachers = teachers;
        this.students = students;
        this.courses = courses;
        this.stacks= stacks;
        totalMoneyEarned = 0;
        totalMoneySpent = 0;
    }


    public List<Teachers> getTeachers() {
        return teachers;
    }


    public void addTeacher(Teachers teacher) {
        teachers.add(teacher);
    }


    public List<Students> getStudents() {
        return students;
    }


    public void addStudent(Students student) {
        students.add(student);
    }


    public int getTotalMoneyEarned() {
        return totalMoneyEarned;
    }


    public static void updateTotalMoneyEarned(int MoneyEarned) {
        totalMoneyEarned += MoneyEarned;
    }


    public int getTotalMoneySpent() {
        return totalMoneySpent;
    }


    public static void updateTotalMoneySpent(int moneySpent) {
        totalMoneyEarned-=moneySpent;
    }
}
