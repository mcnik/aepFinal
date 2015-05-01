package app.nikhil.date;

import org.junit.Test;

import static org.junit.Assert.*;

public class DateAdderTest {

    @Test
    public void TwentyFifteenIncrementedByOneIsTwentySixteen() {
        DateAdder dateAdder = new DateAdder();
        assertEquals(dateAdder.add("01/01/2015", 1, 1), "01/01/2016");
    }

    @Test
    public void JanIncrementedByTwelveIsJanNextYear() {
        DateAdder dateAdder = new DateAdder();
        assertEquals(dateAdder.add("01/01/2015", 2, 12), "01/01/2016");
    }

    @Test
    public void FirstJanIncrementedByThreeSixtyFiveIsNextYear() {
        DateAdder dateAdder = new DateAdder();
        assertEquals(dateAdder.add("01/01/2015", 5, 365), "01/01/2016");
    }
}