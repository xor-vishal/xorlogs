package edu.def.dateformatters;

import edu.dateformatters.DateFormatter;
import java.util.Date;
import java.text.SimpleDateFormat;

public class MMDDYYDateFormatter implements DateFormatter {

    public SimpleDateFormat format = new SimpleDateFormat("MM/dd/yy");

    public String format() {
        return format.toPattern();
    }

    public String format(Date date) {
        return format.format(date);
    }

}