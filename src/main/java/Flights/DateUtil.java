package Flights;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtil {

    private final static SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy;HH:mm");

    public static Date getDateTime(String dateString) {
        try {
            return sdf.parse(dateString);
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
    }

    public static String toDateString(Date date) {
        return sdf.format(date);
    }
}
