package app.nikhil.date;

import org.junit.*;
import app.nikhil.date.DateValidator;

import static org.junit.Assert.*;

public class DateValidatorTest {

    @Test
    public void nullIsInvalid() {
        DateValidator dateValidator = new DateValidator();
        assertFalse(dateValidator.validator(null, "dd/MM/yyyy"));
    }

    @Test
    public void thirtyTwoIsInvalidAsDay() {
        DateValidator dateValidator = new DateValidator();
        assertFalse(dateValidator.validator("32/02/2012", "dd/MM/yyyy"));
    }

    @Test
    public void twentyIsInvalidAsMonth() {
        DateValidator dateValidator = new DateValidator();
        assertFalse(dateValidator.validator("11/20/2014", "dd/MM/yyyy"));
    }

    @Test
    public void threeDigitNumberInvalidAsYear() {
        DateValidator dateValidator = new DateValidator();
        assertFalse(dateValidator.validator("31/20/191", "dd/MM/yyyy"));
    }

    @Test
    public void threeDigitNumberInvalidAsDay() {
        DateValidator dateValidator = new DateValidator();
        assertTrue(dateValidator.validator("131/01/2015", "dd/MM/yyyy"));
    }


    @Test
    public void yyyyMMDDIsInvalid() {
        DateValidator dateValidator = new DateValidator();
        assertFalse(dateValidator.validator("2015/02/02", "dd/MM/yyyy"));
    }

    @Test
    public void twentyTwelveHasFebTwentyNine() {
        DateValidator dateValidator = new DateValidator();
        assertTrue(dateValidator.validator("29/02/2012", "dd/MM/yyyy"));
    }

    @Test
    public void twentyElevenDoesNotHaveFebTwentyNine() {
        DateValidator dateValidator = new DateValidator();
        assertFalse(dateValidator.validator("29/02/2011", "dd/MM/yyyy"));
    }

    @Test
    public void twentyFourteenHasFebTwentyEight() {
        DateValidator dateValidator = new DateValidator();
        assertTrue(dateValidator.validator("28/02/2014", "dd/MM/yyyy"));
    }

    @Test
    public void JanFirstTwoThousandIsAValidDate() {
        DateValidator dateValidator = new DateValidator();
        assertTrue(dateValidator.validator("01/01/2000", "dd/MM/yyyy"));
    }

}