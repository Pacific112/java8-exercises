package _4_streams._2_exercise;

import java.time.Month;
import java.util.OptionalDouble;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static java.time.LocalDate.of;

public class StreamExercise {

    public static void main(String[] args) {
        exercise1();
    }

    // TODO: Utwórz stream składający się z liczb 32, 19, 5, 17, 19 po czym zsumuj wszystkie liczby.
    private static void exercise1() {
        System.out.println(IntStream.of(32, 19, 5, 17, 19 ).sum());
    }

    // TODO: Utwórz stream składający się z liczb 16, 9, -5, 22 do każdej dodaj 17 i znajdź największą.
    private static void exercise2() {
        System.out.println(IntStream.of(16, 9, -5, 22).map(i -> i + 17).sum());
    }

    // TODO: Sprawdź ile liczb podzielnych przez 3 znajduje się w zakresie 300 - 1400.
    private static void exercise3() {
        System.out.println(IntStream.rangeClosed(300, 1400).filter(i -> i % 3 == 0).count());
    }

    // TODO: Znajdź wszystkie potęgi liczb 2, 4, 8, 16, 32, 64, 128 większe od 500. Policz ich średnią
    private static void exercise4() {
        OptionalDouble average = IntStream.of(2, 4, 8, 16, 32, 64, 128)
                                          .map(i -> i * i)
                                          .filter(i -> i > 500)
                                          .average();

        System.out.println(average.getAsDouble());
    }

    // TODO*: Utwórz stream składający się z następujących dat 1992-08-25, 1895-01-20, 2019-03-10. Ile dat spełnia ten warunek?
    private static void exercise5() {
        long count = Stream.of(of(1992, Month.AUGUST, 25), of(1895, Month.JANUARY, 20), of(2019, Month.MARCH, 10))
                           .filter(date -> date.getYear() < 2000 && date.getYear() > 1900)
                           .count();

        System.out.println(count);
    }
}
