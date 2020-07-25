import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SchoolTest {
    @Test
    public void TestSchool() {
        School sc = new School("David Oparanti", "Smith Wood");
        assertEquals("David Oparnti", sc.getStaff(1));

    }

}