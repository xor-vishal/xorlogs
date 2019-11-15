package edu.service;

import java.util.ServiceLoader;
import java.util.Date;
import edu.dateformatters.DateFormatter;

public class DateFormatterApp {

    public static void main(String[] args) {
        ServiceLoader<DateFormatter> loader = ServiceLoader.load(DateFormatter.class);
        for (DateFormatter df: loader) {
            System.out.println(df.format());
            if (df.format().equals("MM/dd/yy")) {
                String fmttedDate = df.format(new Date());
                System.out.println(fmttedDate);
            } else {
                System.out.println(df.format());
            }
        }
    }
}