import org.junit.Test;

import static org.junit.Assert.*;

public class LeapYearTest {

    @Test
    public void isleapyear_test() {
        LeapYear year = new LeapYear();
        assertEquals(true,year.isleapyear(12));
    }
}