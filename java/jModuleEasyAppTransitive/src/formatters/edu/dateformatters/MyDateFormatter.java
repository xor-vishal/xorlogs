package edu.dateformatters;

import java.util.Date;
import java.text.SimpleDateFormat;
import edu.factory.DateFormatsFactory;

public class MyDateFormatter {
    final DateFormatsFactory factory;
    
    public MyDateFormatter(DateFormatsFactory factory) {
        this.factory = factory;
    }

    public String format(SimpleDateFormat format, Date date) {
        return format.format(date);
    }

    public String format(String format, Date date) {
        return factory.get(format).format(date);
    }
}