package _2_date._1_api;

import java.time.LocalDate;
import java.time.Month;
import java.util.Date;

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
    }
}
