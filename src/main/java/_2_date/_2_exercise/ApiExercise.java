package _2_date._2_exercise;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;

public class ApiExercise {

    // TODO: exercise 1 - LocalDate API
    //       1. Utwórz datę reprezentującą twoje urodziny
    //       2. Sprawdź jaki to był dzień tygodnia oraz który dzień roku
    //       3. Utwórz dzisiejszą datę
    //       4. Od utworzonej daty odejmij ilość dni równą rokowi Twojego urodzenia
    //       5. Po dodaniu sprawdź jaki jest to miesiąc, czy jest to weekend oraz czy jest to rok przestępny
    public static void main(String[] args) {
        LocalDate birthday = LocalDate.of(1992, Month.AUGUST, 25);
        System.out.println(birthday.getDayOfWeek());
        System.out.println(birthday.getDayOfYear());

        LocalDate today = LocalDate.now();
        LocalDate earlier = today.minusDays(birthday.getYear());

        System.out.println(earlier.getMonth());
        System.out.println(earlier.isLeapYear());

        DayOfWeek dayOfWeek = earlier.getDayOfWeek();
        if (dayOfWeek == DayOfWeek.SATURDAY || dayOfWeek == DayOfWeek.SUNDAY) {
            System.out.println("It is weekend");
        } else {
            System.out.println("It is not weekend");
        }
    }
}
