import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SchoolTest {
    /**
    * Global Variable
    */
    School sc = new School("David Oparanti", "Smith Wood");
    Staff principal = new Principal(1,"Idowu","Malik Bello", 400.00);
    Staff teacher = new Teachers(3, "Benedict", "Opanachi", 300.00);
    Students student = new Students(1,"Isreal", "Olamilekan", 4);




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
    public void studentsPopulation() {
        assertEquals(100, sc.getStudentCount());
    }


    @Test
    public void expelledStudent() {
        assertEquals("", sc.expellStudent());
    }
}