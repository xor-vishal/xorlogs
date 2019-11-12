package edu.factory;

import java.text.SimpleDateFormat;

public class DateFormatsFactory {

    public SimpleDateFormat get(String desiredFormat) {
        return new SimpleDateFormat(desiredFormat);
    }
}