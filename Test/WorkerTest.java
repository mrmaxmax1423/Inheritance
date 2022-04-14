import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WorkerTest {

    Worker w1, w2, w3;
    SalaryWorker s1, s2, s3;

    @BeforeEach
    void setUp()
    {
        w1 = new Worker("000001", "Alex", "Tester1", "Mr.", 1995, 25.0);
        w2 = new Worker("000002", "Susan", "Tester2", "Mrs.", 1999, 32.50);
        w3 = new Worker("000003", "Jake", "Tester3", "Mr.", 1990, 35.0);
    }
    @Test
    void setHourlyRate() {
        w2.setHourlyRate(35.0);
        assertEquals(35.0, w2.getHourlyRate());
    }

    @Test
    void calculateWeeklyPay() {
        assertEquals(2450.0, w3.calculateWeeklyPay(60));//60 hours worked means (40 * 35) + (20 * 42.5) = 2450
    }

    @Test
    void displayWeeklyPay() {
        assertEquals("40 Hours at hourly rate, 10.0 hours at time and a half. Total Pay: $" + w3.calculateWeeklyPay(50), w3.displayWeeklyPay(50)); //calculateWeeklyPay should return 1925.0
    }
}