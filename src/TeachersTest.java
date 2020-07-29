import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TeachersTest {
    /**
     * teacher object was instantiated globally to make it amiable for all methods test.
     */
    Teachers teacher = new Teachers(1,"Lara", "George", 17_000.00);

    @Test
    void totalMoneyEarn() {
        assertEquals(17_000.00,teacher.getTotalMoneyEarn());
    }


    @Test
    void getSalary() {
        assertEquals(17_000, teacher.getSalary());
    }

    @Test
    void getTotalMoneyEarn() {
        assertEquals(17_000, teacher.getTotalMoneyEarn());
    }

    @Test
    void setTotalMoneyEarn() {
        teacher.setTotalMoneyEarn(23_000.00);
        assertEquals(23_000.00, teacher.getTotalMoneyEarn());
    }
}