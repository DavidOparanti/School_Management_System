import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SchoolTest {
    School sc = new School("David Oparanti", "Smith Wood");


    @Test
    public void getStaff() {
        assertEquals("David Oparnti", sc.getStaff(1));

    }

     @Test
    public void getStudent() {
        assertEquals("Bob Gass", sc.getStudent(2));

    }

    @Test
    public void studentsPopulation() {
        assertEquals(100, sc.getStudentCount());
    }

    @Test
    public void StaffPopulation() {
        assertEquals(25, sc.getStaffCount());
    }

    @Test
    public void removeStaff() {
        assertEquals("", sc.removeStaff(3));
    }
}