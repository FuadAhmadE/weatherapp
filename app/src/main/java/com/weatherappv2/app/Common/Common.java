package com.weatherappv2.app.Common;

import android.location.Location;
import java.text.SimpleDateFormat;
import java.text.DateFormat;
import java.util.Date;

public class Common {
    public static final String APP_ID = "c1487e773fff1f21d74829749446a2cc";
    public static Location current_location=null;

    public static String convertUnixToDate(long dt) {
        Date date = new Date(dt*1000L);
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm EEEE, dd MMMM yyyy");
        String formate = sdf.format(date);
        return  formate;
    }

    public static String convertUnixToHour(long dt) {
        Date date = new Date(dt*1000L);
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm");
        String formated = sdf.format(date);
        return  formated;
    }
}
