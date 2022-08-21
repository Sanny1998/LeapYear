import org.junit.Test;

import static org.junit.Assert.*;

public class LeapYearTest {

    @Test
    /*
     This function will check if year is divisible by 4 but not century
     than leap year
    */
    public void isleapyear_test_divisible_by_4() {
        LeapYear year = new LeapYear();
        assertEquals(false,year.isleapyear(2022));
    }

    /*
    This function will check if year is divisible by 4 and
    by 100 and also divisible by 400 than leap year
     */
    @Test
    public void isleapyear_test_divisible_by_400_4() {
        LeapYear year = new LeapYear();
        assertEquals(false,year.isleapyear(2022));
    }
}