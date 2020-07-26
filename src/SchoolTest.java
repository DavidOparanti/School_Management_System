import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SchoolTest {
    /**
    * Global Variable
    */
    School sc = new School("David Oparanti", "Smith Wood");
    Staff principal = new Principal(1,"Idowu","Malik Bello", 400.00);
    Staff teacher = new Teachers(3, "Benedict", "Opanachi", 300.00);
    Students student = new Students(1,"Isreal", "Olamilekan", 4, 2000);



    @Test
    public void getId(){
        assertEquals(3,teacher.getId());
        assertEquals(3,student.getId());
        assertEquals(1, principal.getId());
        //assertEquals(3000, principal.getEpence());
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
    public void removeStaff() {
        assertEquals("", sc.removeStaff());
    }

    @Test
    public void getSalay() {
        assertEquals(500, teacher.getSalary());
        assertEquals(700, principal.getSalary());
    }

    @Test
    public void fullName() {
        assertEquals("David Oparanti", teacher.getFullName());
        assertEquals("Benedict Opanachi", student.getFullName());
        assertEquals("Akanbi Kikelomo", principal.getFullName());
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
        assertEquals(3,student.getGrade());
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