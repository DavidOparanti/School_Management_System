import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PrincipalTest {
    /**
     * Principal is instantiated globally for the purpose of the overall test;
     *
     */
    Principal principal = new Principal(1,"David", "Oparanti",25_000.00);

    @Test
    void totalMoneyEarn() {
        assertEquals(25000, principal.getTotalMoneyEarn());
    }

    @Test
    void getSalary() {
        assertEquals(25000, principal.getTotalMoneyEarn());
    }

    @Test
    void getFullName() {
        assertEquals("David Oparanti",principal.getFullName());
    }

    @Test
    void getId() {
        assertEquals(1, principal.getId());
    }

    @Test
    void expelledStudent() {
    }

    @Test
    void assignedClassToTeacher() {
    }
}