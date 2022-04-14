import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SalaryWorkerTest {
    SalaryWorker s1, s2, s3;

    @BeforeEach
    void setUp() {
        s1 = new SalaryWorker("000004", "Gage", "Tester4", "Mr.", 1995, 25.0, 52000.0);
        s2 = new SalaryWorker("000005", "Alex", "Tester5", "Mr.", 1995, 35.0, 72800.0);
        s3 = new SalaryWorker("000006", "Alison", "Tester6", "Mrs.", 1995, 40.0, 83200.0);
    }

    @Test
    void setAnnualSal()
    {
        s2.setAnnualSal(62500);
        assertEquals(62500, s2.getAnnualSal());
    }

    @Test
    void calculateWeeklyPay() {
        assertEquals(1000, s1.calculateWeeklyPay(43));
    }

    @Test
    void displayWeeklyPay() {
        assertEquals("Weekly Pay: $1000.0 *Weekly Pay is a set amount calculated using annual salary.", s1.displayWeeklyPay(36));
    }
}