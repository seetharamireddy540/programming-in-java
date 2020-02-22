package com.ram.modules.test;

import com.ram.modules.Engine;

import java.security.Timestamp;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class EngineImpl implements Engine {
    @Override
    public String process(final String arg) {
        Instant timestamp = Instant.now();
        LocalDateTime ldt = LocalDateTime.ofInstant(timestamp, ZoneId.systemDefault());
        System.out.printf("%s %d %d at %d:%d%n", ldt.getMonth(), ldt.getDayOfMonth(),
            ldt.getYear(), ldt.getHour(), ldt.getMinute());
        return "HELLOW ";
    }
}
