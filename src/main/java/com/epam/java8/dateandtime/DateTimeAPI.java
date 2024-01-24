package com.epam.java8.dateandtime;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjusters;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class DateTimeAPI {
    public static final DateTimeFormatter customFormatter = DateTimeFormatter.ofPattern("MM/dd/yyyy 'at' hh:mma z");
    public static final LocalDate today = LocalDate.now();
    public static final LocalDateTime localDateAndTime = LocalDateTime.now();

    public static Predicate<LocalDate> isYesterdaysDate = (date) -> date.isEqual(today.minus(1, ChronoUnit.DAYS));

    public static Supplier<LocalDate> getDateForNextThursday = () -> today.with(TemporalAdjusters.next(DayOfWeek.THURSDAY));

    public static Function<String, LocalDate> dateForNextGivenWeekDay = (dayOfWeek) ->
            today.with(TemporalAdjusters.next(Enum.valueOf(DayOfWeek.class, dayOfWeek)));

    public static Supplier<String> convertCurrentTimeToESTTimeZone = () -> customFormatter.format(localDateAndTime.atZone(ZoneId.of("America/New_York")));

    public static Function<String, String> convertCurrentTimeToGivenTimeZone = (timeZone) ->
            customFormatter.format(localDateAndTime.atZone(ZoneId.of(timeZone)));

    public static int calculateAge(LocalDate dateOfBirth) {
        return Period.between(dateOfBirth, today).getYears();
    }
}
