package io.github.js.sponge;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class TimeUtil {

    private static final String BASIC_DATE_TIME_FORMAT = "yyyy-MM-dd hh:mm:ss";

    public static String format(LocalDateTime localDateTime) {
        if (localDateTime == null) {
            return "";
        }
        return localDateTime.format(DateTimeFormatter.ofPattern(BASIC_DATE_TIME_FORMAT));
    }

}
