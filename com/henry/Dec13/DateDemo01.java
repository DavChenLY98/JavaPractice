package com.henry.Dec13;

import java.time.Instant;
import java.time.ZoneId;
import java.util.Set;

public class DateDemo01 {
    public static void main(String[] args) {
        Set<String> zoneIds = ZoneId.getAvailableZoneIds();
        ZoneId systemDefault = ZoneId.systemDefault();
        System.out.println(zoneIds);
        System.out.println(systemDefault);
        ZoneId zoneId = ZoneId.of("Asia/Pontianak");
        System.out.println(zoneId);
        Instant now = Instant.now();
        System.out.println(now);
        Instant instant1= Instant.ofEpochMilli(0L);
        System.out.println(instant1);
        Instant instant2=Instant.ofEpochMilli(1000L);
        System.out.println(instant2);
        System.out.println(instant2.isAfter(instant1));
        System.out.println(Instant.now().atZone(ZoneId.of("Asia/Pontianak")));


    }
}
