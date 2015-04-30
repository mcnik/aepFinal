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
    public void testForLeapYear() {
        DateValidator dateValidator = new DateValidator();
        assertTrue(dateValidator.validator("29/02/2012", "dd/MM/yyyy"));
    }

    /*@Test
    public void testDateFeb29_2011() {
        DateValidator dateValidator = new DateValidator();
        assertFalse(dateValidator.validator("29/02/2011", "dd/MM/yyyy"));
    }

    @Test
    public void testDateFeb28() {
        DateValidator dateValidator = new DateValidator();
        assertTrue(dateValidator.validator("28/02/2011", "dd/MM/yyyy"));
    }

    @Test
    public void testDateIsValid_1() {
        DateValidator dateValidator = new DateValidator();
        assertTrue(dateValidator.validator("31/01/2012", "dd/MM/yyyy"));
    }

    @Test
    public void testDateIsValid_2() {
        DateValidator dateValidator = new DateValidator();
        assertTrue(dateValidator.validator("30/04/2012", "dd/MM/yyyy"));
    }

    @Test
    public void testDateIsValid_3() {
        DateValidator dateValidator = new DateValidator();
        assertTrue(dateValidator.validator("31/05/2012", "dd/MM/yyyy"));
    }*/

}