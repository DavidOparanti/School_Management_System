import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

class SchoolTest <principal> {

    /**
     * Defining global variable to use for test case;
     */
    Teachers teacher = new Teachers(1,"Lara", "George", 17_000.00);
    Courses algorithm = new Courses(1, "CSC304", "Algorithm", 4);
    Courses algebra = new Courses(2,"MTH101", "Algebra", 3);
    Students student = new Students(1,"Benedict", "look", 4,15_000.00);


    ArrayList<Students> studentsList = new ArrayList<Students>();
    List<Staff> staffsList = new ArrayList<>();
    List<Courses> courseList = new ArrayList<>();
    List<Classes> classList = new ArrayList<>();




    @Test
    void getTeachers() {
    }

    @Test
    void addTeacher() {
    }

    @Test
    void getStudents() {
    }

    @Test
    void addStudent() {
    }

    @Test
    void getTotalMoneyEarned() {
    }

    @Test
    void updateTotalMoneyEarned() {
    }

    @Test
    void getTotalMoneySpent() {
    }

    @Test
    void updateTotalMoneySpent() {
    }




}