package app.nikhil.date;

import org.junit.Test;

import static org.junit.Assert.*;

public class DaysBetweenCalculatorTest {

    @Test
    public void daysBetweenWorks() {
        DaysBetweenCalculator dateDiff = new DaysBetweenCalculator();
        assertEquals(dateDiff.difference("01/01/2015", "30/04/2015"), 118);
    }

    @Test
    public void daysBetweenTodayAndTomorrowIsOne() {
        DaysBetweenCalculator dateDiff = new DaysBetweenCalculator();
        assertEquals(dateDiff.difference("30/04/2015", "01/05/2015"), 1);
    }
}