/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.i2rtech.twinshoreapp.utils;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author mrsagar
 */
public class AppDateUtils {

    public static Date getCurrentDate() {
        
        return getTimeZoneDate("Asia/Kolkata");
    }

    public static Date getCurrentDateAndTime() {
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Date date = getTimeZoneDate("Asia/Kolkata");
        String strDt = (String) dateFormat.format(date);
        try {
            date = dateFormat.parse(strDt);
        } catch (ParseException ex) {
            Logger.getLogger(AppDateUtils.class.getName()).log(Level.SEVERE, null, ex);
        }
        return date;
    }

    public static Date getTimeZoneDate(String timeZone) {
        TimeZone tz = TimeZone.getTimeZone(timeZone);
        Calendar timeZoneDt = Calendar.getInstance(tz);
        Calendar calendar = Calendar.getInstance();
        calendar.set(timeZoneDt.get(Calendar.YEAR), timeZoneDt.get(Calendar.MONTH), timeZoneDt.get(Calendar.DATE),
                timeZoneDt.get(Calendar.HOUR_OF_DAY), timeZoneDt.get(Calendar.MINUTE), (timeZoneDt.get(Calendar.SECOND) + 90));
        return calendar.getTime();
    }
}
