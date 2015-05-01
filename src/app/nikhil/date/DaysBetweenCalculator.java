package app.nikhil.date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

/**
 * Created by nikhil on 30-04-2015.
 */
public class DaysBetweenCalculator {

    public long difference(String d1, String d2) {
        SimpleDateFormat myFormat = new SimpleDateFormat("dd/MM/yyyy");
        long daysBetween = 0;

        try {
            Date date1 = myFormat.parse(d1);
            Date date2 = myFormat.parse(d2);
            long diff = date2.getTime() - date1.getTime();
            daysBetween = TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return (daysBetween);
    }
}
