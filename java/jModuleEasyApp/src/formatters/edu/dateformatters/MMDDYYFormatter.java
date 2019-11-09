package edu.dateformatters;

import java.util.Date;
import java.text.SimpleDateFormat;

public class MMDDYYFormatter {
    SimpleDateFormat format = new SimpleDateFormat("MM/dd/yy");

    public String format(Date date) {
        return format.format(date);
    }
}