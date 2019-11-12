package edu.easyapp;

import java.util.Date;
import edu.dateformatters.MyDateFormatter;
import edu.factory.DateFormatsFactory;

public class DateApp {

    public static void main(String args[]) {
        DateFormatsFactory factory = new DateFormatsFactory();
        
        MyDateFormatter mdf = new MyDateFormatter(factory);
        String fmtDate = mdf.format("MM/dd/yy", new Date());

        System.out.println(fmtDate);
    }
}