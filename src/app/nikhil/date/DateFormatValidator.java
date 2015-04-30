package app.nikhil.date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormatValidator {

    public boolean validator(String date, String format) {

        if (date == null) {
            return false;
        }

        SimpleDateFormat sdf = new SimpleDateFormat(format);
        sdf.setLenient(false);

        try {
            Date d = sdf.parse(date);
            System.out.println(d);
        } catch (ParseException e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }
}