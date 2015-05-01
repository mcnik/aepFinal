package app.nikhil.date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * Created by nikhil on 30-04-2015.
 */
public class DateAdder {

    private static final int[][] fields = {
            {Calendar.DAY_OF_MONTH},
            {Calendar.MONTH},
            {Calendar.YEAR}};

    public static String add(String d, int timeField, int increment) {
        SimpleDateFormat myFormat = new SimpleDateFormat("dd/MM/yyyy");
        Date date = null;
        try {
            date = myFormat.parse(d);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        Calendar c = Calendar.getInstance();
        c.setTime(date);
        c.add(timeField, increment);
        return myFormat.format(c.getTime());
    }
}
