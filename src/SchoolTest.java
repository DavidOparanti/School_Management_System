import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SchoolTest {
    /**
    * Global Variable
    */
    School sc = new School("David Oparanti", "Smith Wood");
    Staff principal = new Principal("Malik Bello");
    Staff teacher = new Teachers("Benedict Opanachi");
    Students student = new Students("Olamilekan");




    @Test
    public void getStaff() {
        assertEquals("David Oparnti", sc.getStaff());

    }

    @Test
    public void StaffPopulation() {
        assertEquals(25, sc.getStaffCount());
    }

    @Test
    public void removeStaff() {
        assertEquals("", sc.removeStaff());
    }

    @Test
    public void getSalay() {
        assertEquals(500, teacher.getSalary());
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
    public void studentsPopulation() {
        assertEquals(100, sc.getStudentCount());
    }


    @Test
    public void expelledStudent() {
        assertEquals("", sc.expellStudent());
    }
}