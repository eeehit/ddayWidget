package com.eeehit.widget;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;

/**
 * Created by sppark on 2017-05-06.
 */

public class LoveCalculator {
    private static SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
    private static String start = "2015-07-11";

    public static long getLoveDay() {
        long diffDays = 0;

        try {
            Date startDate = formatter.parse(start);
            Date endDate = formatter.parse(getToday());
            long diff = endDate.getTime() - startDate.getTime();
            diffDays = diff / (24 * 60 * 60 * 1000) + 1;
        } catch (java.text.ParseException e) {
            e.printStackTrace();
        }
        return diffDays;
    }
    private static String getToday(){
        String today = formatter.format(new Date());
        return today;
    }
}