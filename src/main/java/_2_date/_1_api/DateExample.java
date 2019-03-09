package _2_date._1_api;

import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;
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
    }
}
