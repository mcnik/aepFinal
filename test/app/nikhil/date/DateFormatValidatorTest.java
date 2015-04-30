package app.nikhil.date;

import org.junit.*;

import static org.junit.Assert.*;

public class DateFormatValidatorTest {

    @Test
    public void nullIsInvalid() {
        DateFormatValidator dateFormatValidator = new DateFormatValidator();
        assertFalse(dateFormatValidator.validator(null, "dd/MM/yyyy"));
    }

    @Test
    public void thirtyTwoIsInvalidAsDay() {
        DateFormatValidator dateFormatValidator = new DateFormatValidator();
        assertFalse(dateFormatValidator.validator("32/02/2012", "dd/MM/yyyy"));
    }

    @Test
    public void twentyIsInvalidAsMonth() {
        DateFormatValidator dateFormatValidator = new DateFormatValidator();
        assertFalse(dateFormatValidator.validator("11/20/2014", "dd/MM/yyyy"));
    }

    @Test
    public void threeDigitNumberInvalidAsYear() {
        DateFormatValidator dateFormatValidator = new DateFormatValidator();
        assertFalse(dateFormatValidator.validator("31/20/191", "dd/MM/yyyy"));
    }

    @Test
    public void threeDigitNumberInvalidAsDay() {
        DateFormatValidator dateFormatValidator = new DateFormatValidator();
        assertTrue(dateFormatValidator.validator("131/01/2015", "dd/MM/yyyy"));
    }

    @Test
    public void ZeroInvalidAsMonth() {
        DateFormatValidator dateFormatValidator = new DateFormatValidator();
        assertTrue(dateFormatValidator.validator("03/0/2014", "dd/MM/yyyy"));
    }

    @Test
    public void yyyyMMDDIsInvalid() {
        DateFormatValidator dateFormatValidator = new DateFormatValidator();
        assertFalse(dateFormatValidator.validator("2015/02/02", "dd/MM/yyyy"));
    }

    @Test
    public void twentyTwelveHasFebTwentyNine() {
        DateFormatValidator dateFormatValidator = new DateFormatValidator();
        assertTrue(dateFormatValidator.validator("29/02/2012", "dd/MM/yyyy"));
    }

    @Test
    public void twentyElevenDoesNotHaveFebTwentyNine() {
        DateFormatValidator dateFormatValidator = new DateFormatValidator();
        assertFalse(dateFormatValidator.validator("29/02/2011", "dd/MM/yyyy"));
    }

    @Test
    public void twentyFourteenHasFebTwentyEight() {
        DateFormatValidator dateFormatValidator = new DateFormatValidator();
        assertTrue(dateFormatValidator.validator("28/02/2014", "dd/MM/yyyy"));
    }

    @Test
    public void JanFirstTwoThousandIsAValidDate() {
        DateFormatValidator dateFormatValidator = new DateFormatValidator();
        assertTrue(dateFormatValidator.validator("01/01/2000", "dd/MM/yyyy"));
    }

}