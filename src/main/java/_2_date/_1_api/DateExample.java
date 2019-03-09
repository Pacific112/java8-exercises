package _2_date._1_api;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Date;
import java.util.Locale;

public class DateExample {

    public static void main(String[] args) {
        Date date = new Date(119, 2, 10);
        System.out.println(date);

        LocalDate today = LocalDate.of(2019, Month.MARCH, 10);
        LocalDate now = LocalDate.now();

        LocalDate twoMonthsLater = now.plusMonths(2);
        System.out.println(twoMonthsLater);

        LocalDate monthEarlier = today.minusDays(10);
        System.out.println(monthEarlier);

        System.out.println(twoMonthsLater.getDayOfWeek());
        System.out.println(twoMonthsLater.getMonth());
        System.out.println(twoMonthsLater.getDayOfMonth());

        LocalDate parsedToday = LocalDate.parse("2019-03-10");
        System.out.println(parsedToday);

        LocalDate americanToday = LocalDate.parse("03-10-2019", DateTimeFormatter.ofPattern("MM-dd-yyyy"));
        System.out.println(americanToday.format(DateTimeFormatter.ofPattern("MMMM-dd-yy", Locale.GERMAN)));

        System.out.println(LocalTime.now());
        System.out.println(LocalDateTime.now());
        System.out.println(Instant.now().getEpochSecond());

        LocalDate birthDate = LocalDate.of(1992, Month.AUGUST, 25);
        LocalDateTime birthTime = birthDate.atTime(LocalTime.of(10, 20));
        LocalDateTime timeNow = LocalDateTime.now();

        System.out.println(ChronoUnit.HOURS.between(birthTime, timeNow));
    }
}
