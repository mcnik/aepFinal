package app.nikhil.date;

import org.junit.*;
import app.nikhil.date.DateValidator;

import static org.junit.Assert.*;

public class DateValidatorTest {

    @Test
    public void testDateIsNull() {
        DateValidator dateValidator = new DateValidator();
        assertFalse(dateValidator.validator(null, "dd/MM/yyyy"));
    }

    @Test
    public void testDayIsInvalid() {
        DateValidator dateValidator = new DateValidator();
        assertFalse(dateValidator.validator("32/02/2012", "dd/MM/yyyy"));
    }

    @Test
    public void testMonthIsInvalid() {
        DateValidator dateValidator = new DateValidator();
        assertFalse(dateValidator.validator("11/20/2014", "dd/MM/yyyy"));
    }

    @Test
    public void testYearIsInvalid() {
        DateValidator dateValidator = new DateValidator();
        assertFalse(dateValidator.validator("31/20/191", "dd/MM/yyyy"));
    }

    @Test
    public void testDateFormatIsInvalid() {
        DateValidator dateValidator = new DateValidator();
        assertFalse(dateValidator.validator("2015/02/02", "dd/MM/yyyy"));
    }

    @Test
    public void testImpossibleDate() {
        DateValidator dateValidator = new DateValidator();
        assertTrue(dateValidator.validator("29/02/2012", "dd/MM/yyyy"));
    }

}