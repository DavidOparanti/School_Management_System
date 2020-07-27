import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SchoolTest {
    /**
    * Global Variable
     *
     * classes used for the test
    */

    Staff principal = new Principal(1,"Idowu","Malik Bello", 400.00);
    Staff teacher = new Teachers(3, "Benedict", "Opanachi", 300.00);
    Students student1 = new Students(1,"Isreal", "Olamilekan", 4, 2000.00);
    Students student2 = new Students(2,"Daniel", "Adeleke", 3,4000.00);
    Courses algorithm = new Courses(1, "CSC304", "Algorithm", 4);
    Courses algebra = new Courses(2,"MTH101", "Algebra", 3);


    /**
     * List of classes to poly fill test.
     */

     List<Students> studentsList = new ArrayList<>();
     List<Staff> staffsList = new ArrayList<>();
     List<Courses> courseList = new ArrayList<>();
     List<Classes> classList = new ArrayList<>();



    School decagon = new School()



    @Test
    public void getId(){
        assertEquals(3,teacher.getId());
    }

    @Test
    public void getStaff() {
        assertEquals("David Oparnti", sc.getStaff());

    }

    @Test
    public void population() {
        assertEquals(25, sc.getStaffCount());
        //assertEquals(1000, sc.getStudentCount);
    }



    @Test
    public void getSalay() {
        assertEquals(500, teacher.getSalary());
    }

    @Test
    public void fullName() {
        assertEquals("David Oparanti", teacher.getFullName());
    }

    @Test
    public void paySalary() {
        assertEquals(5000, teacher.TotalMoneyEarn() + teacher.getSalary());
    }


     @Test
    public void getStudent() {
        assertEquals("Bob Gass", sc.getStudent());

    }

    @Test
    public void getGrade() {
        assertEquals(4,student.getGrade());
    }

    @Test
    public void studentsPopulation() {
        assertEquals(100, sc.getStudentCount());
    }


}