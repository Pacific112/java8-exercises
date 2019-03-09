package _2_date._4_exercise;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class DateExercise {

    // TODO: Exercise 3 - Date Summary
    //       Napisz aplikację, która znajdzie najbliższy dzień pracujący.
    //       Następnie wypisze ten dzień na ekran w formacie <nazwa-dnia-tygodnia> <dzien miesiaca> <nazwa-miesiaca> <rok>
    //       Zakładamy że dni wolne od pracy to jedynie weekendy.
    //       Dla chętnych: wypisz na ekran informację ile minut pozostało do następnego dnia pracującego.
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();

        LocalDate workingDay = nextWorkingDay(now.toLocalDate());
        System.out.println(workingDay.format(DateTimeFormatter.ofPattern("EEEE dd MMMM yyyy")));

        System.out.println("Do poniedziałku pozostało minut: " + ChronoUnit.MINUTES.between(now, workingDay.atStartOfDay()));
    }

    private static LocalDate nextWorkingDay(LocalDate today) {
        if (today.getDayOfWeek() == DayOfWeek.SATURDAY) {
            return today.plusDays(2);
        }
        if (today.getDayOfWeek() == DayOfWeek.SUNDAY) {
            return today.plusDays(1);
        }

        return today;
    }
}
