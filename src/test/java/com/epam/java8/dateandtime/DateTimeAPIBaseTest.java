package com.epam.java8.dateandtime;

import com.epam.java8.BaseTest;
import org.testng.annotations.Test;

import java.time.LocalDate;

import static com.epam.java8.dateandtime.DateTimeAPI.*;

public class DateTimeAPIBaseTest extends BaseTest {

    @Test
    public void testIsYesterdaysDate() {
        LocalDate localDate = LocalDate.of(2020, 04, 04);
        System.out.println(GREEN_BOLD + "HomeTask_9_1: " + RESET + "Predicate to check if the given date is yesterday date"
                + "\nInput:" + localDate.toString()
                + "\nOutput:" + isYesterdaysDate.test(localDate) + "\n");
    }

    @Test
    public void testGetDateForNextThursday() {
        System.out.println(GREEN_BOLD + "HomeTask_9_2: " + RESET + "Supplier to get Date for next Thursday"
                + "\nOutput:" + getDateForNextThursday.get() + "\n");
    }

    @Test
    public void testConvertTimeToESTTimeZone() {
        System.out.println(GREEN_BOLD + "HomeTask_9_3: " + RESET + "Supplier to get CurrentTime in EST timezone"
                + "\nOutput:" + convertCurrentTimeToESTTimeZone.get() + "\n");
    }

    @Test
    public void testCalculateAge() {
        LocalDate localDate = LocalDate.of(1995, 04, 04);
        System.out.println(GREEN_BOLD + "HomeTask_9_4: " + RESET + "Calculate the age of a person given date of birth"
                + "\nInput:" + localDate.toString()
                + "\nOutput:" + calculateAge(localDate) + "\n");
    }
}