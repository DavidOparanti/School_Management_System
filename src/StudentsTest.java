import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentsTest {


    /**
     * student object was instantiated globally to test all methods.
     *
     * All methods passed test.
     */
    Students student = new Students(1,"Benedict", "look", 4,15_000.00);

    @Test
    void getGrade() {
        assertEquals(4, student.getGrad());
    }


    @Test
    void setGrad() {
        student.setGrad(3);
        assertEquals(3,student.getGrad());
    }

    @Test
    void getSchoolFee() {
        assertEquals(15000, student.getSchoolFee());
    }

    @Test
    void setSchoolFee() {
        student.setSchoolFee(24_000.00);
        assertEquals(24_000, student.getSchoolFee());
    }

    @Test
    void getFeePaid() {
        student.setFeePaid(15000);
        assertEquals(15000, student.getFeePaid());
    }

    @Test
    void setFeePaid() {
        student.setFeePaid(1500.00);
        assertEquals(1500, student.getFeePaid());
    }

    @Test
    void getFeeOwn() {
        double schoolfee = student.getSchoolFee(); // 15000
        double feePaid = student.setFeePaid(7500);
        assertEquals(feePaid, student.getFeeOwn());
    }



}