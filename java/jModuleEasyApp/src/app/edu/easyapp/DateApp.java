package edu.easyapp;

import java.util.Date;
import edu.dateformatters.MMDDYYFormatter;

public class DateApp {

    public static void main(String args[]) {
        MMDDYYFormatter fmt = new MMDDYYFormatter();
        String fmtDate = fmt.format(new Date());

        System.out.println(fmtDate);
    }
}