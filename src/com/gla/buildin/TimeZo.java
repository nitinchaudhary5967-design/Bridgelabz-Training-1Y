package com.gla.BuildIn;
import java.time.ZonedDateTime;
import java.time.ZoneId;
public class TimeZo {
    public static void main(String[] args) {
        ZoneId gmt = ZoneId.of("GMT");
        ZoneId ist = ZoneId.of("Asia/Kolkata");
        ZoneId pst = ZoneId.of("America/Los_Angeles");
        ZonedDateTime timeGMT = ZonedDateTime.now(gmt);
        ZonedDateTime timeIST = ZonedDateTime.now(ist);
        ZonedDateTime timePST = ZonedDateTime.now(pst);
        System.out.println("GMT: " + timeGMT);
        System.out.println("IST: " + timeIST);
        System.out.println("PST: " + timePST);
    }
}

