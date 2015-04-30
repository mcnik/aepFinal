package app.nikhil.date;

import org.junit.Test;

import static org.junit.Assert.*;

public class DateDifferenceCalculatorTest {

    @Test
    public void daysBetweenWorks() {
        DateDifferenceCalculator dateDiff = new DateDifferenceCalculator();
        assertEquals(dateDiff.difference("01/01/2015", "30/04/2015"), 118);
    }

    @Test
    public void daysBetweenTodayAndTomorrowIsOne() {
        DateDifferenceCalculator dateDiff = new DateDifferenceCalculator();
        assertEquals(dateDiff.difference("30/04/2015", "01/05/2015"), 1);
    }
}