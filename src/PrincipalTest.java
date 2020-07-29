import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PrincipalTest {
<<<<<<< HEAD
    /**
     * Principal is instantiated globally for the purpose of the overall test;
     *
     */
    Principal principal = new Principal(1,"David", "Oparanti",25_000.00);
=======
>>>>>>> parent of 9dce229... Add principal test

    @Test
    void totalMoneyEarn() {
    }

    @Test
    void getSalary() {
    }

    @Test
    void getFullName() {
    }

    @Test
    void getFirstName() {
        assertEquals("David",principal.getFirstName());
    }
    @Test
    void getId() {
    }

    @Test
    void expelledStudent() {
    }

    @Test
    void assignedClassToTeacher() {
    }
}