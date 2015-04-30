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

}