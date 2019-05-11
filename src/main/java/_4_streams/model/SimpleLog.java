package _4_streams.model;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

public class SimpleLog {

    private final String message;
    private final LocalDate date;
    private final SimpleLogLevel level;

    public SimpleLog(String message, LocalDate date, SimpleLogLevel level) {
        this.message = message;
        this.date = date;
        this.level = level;
    }

    public String getMessage() {
        return message;
    }

    public LocalDate getDate() {
        return date;
    }

    public SimpleLogLevel getLevel() {
        return level;
    }

    public static List<SimpleLog> logs() {
        return Arrays.asList(
                new SimpleLog("elit enim ad culpa labore velit excepteur qui consectetur excepteur", LocalDate.of(2019, 5, 2), SimpleLogLevel.DEBUG),
                new SimpleLog("cupidatat aute ea adipisicing eiusmod cupidatat aute incididunt ea pariatur", LocalDate.of(2019, 2, 28), SimpleLogLevel.INFO),
                new SimpleLog("reprehenderit excepteur proident labore reprehenderit consectetur id aliqua labore ut", LocalDate.of(2019, 1, 28), SimpleLogLevel.DEBUG),
                new SimpleLog("aliqua anim labore velit dolor fugiat deserunt sunt magna ex", LocalDate.of(2019, 1, 25), SimpleLogLevel.ERROR),
                new SimpleLog("adipisicing enim enim laboris dolore pariatur ipsum officia ipsum minim", LocalDate.of(2019, 3, 13), SimpleLogLevel.DEBUG),
                new SimpleLog("excepteur ea laboris ex ut excepteur amet ut in labore", LocalDate.of(2019, 1, 15), SimpleLogLevel.DEBUG),
                new SimpleLog("consectetur mollit occaecat esse excepteur nulla do deserunt Lorem commodo", LocalDate.of(2019, 1, 30), SimpleLogLevel.INFO),
                new SimpleLog("exercitation dolor commodo reprehenderit eu quis sunt ex laborum consectetur", LocalDate.of(2019, 4, 30), SimpleLogLevel.INFO),
                new SimpleLog("magna ea duis dolor est pariatur ut enim dolor in", LocalDate.of(2019, 1, 2), SimpleLogLevel.DEBUG),
                new SimpleLog("dolor proident cupidatat sit excepteur mollit Lorem fugiat pariatur ipsum", LocalDate.of(2019, 3, 30), SimpleLogLevel.ERROR),
                new SimpleLog("fugiat ipsum excepteur ipsum labore pariatur voluptate eiusmod consequat irure", LocalDate.of(2019, 1, 10), SimpleLogLevel.INFO),
                new SimpleLog("ut et non quis anim minim culpa dolore est eu", LocalDate.of(2019, 4, 7), SimpleLogLevel.INFO),
                new SimpleLog("quis enim commodo tempor enim Lorem veniam deserunt consequat id", LocalDate.of(2019, 4, 18), SimpleLogLevel.DEBUG),
                new SimpleLog("nostrud reprehenderit qui proident sunt non non occaecat aliqua tempor", LocalDate.of(2019, 4, 9), SimpleLogLevel.DEBUG),
                new SimpleLog("sunt incididunt qui in cupidatat pariatur incididunt aute laboris pariatur", LocalDate.of(2019, 1, 20), SimpleLogLevel.DEBUG),
                new SimpleLog("sint laboris id ad reprehenderit laboris tempor ullamco dolor laboris", LocalDate.of(2019, 4, 26), SimpleLogLevel.INFO),
                new SimpleLog("nulla in aliquip id occaecat dolore est irure dolor ipsum", LocalDate.of(2019, 4, 20), SimpleLogLevel.DEBUG),
                new SimpleLog("dolore id do et sint proident aliqua sint aliquip officia", LocalDate.of(2019, 2, 5), SimpleLogLevel.INFO),
                new SimpleLog("proident ad exercitation id labore ullamco id irure eiusmod pariatur", LocalDate.of(2019, 1, 11), SimpleLogLevel.ERROR),
                new SimpleLog("exercitation laboris magna in ex qui quis aute amet Lorem", LocalDate.of(2019, 4, 16), SimpleLogLevel.INFO),
                new SimpleLog("minim cillum elit excepteur non consectetur ex reprehenderit deserunt proident", LocalDate.of(2019, 2, 24), SimpleLogLevel.INFO),
                new SimpleLog("nostrud minim et ullamco et tempor duis eiusmod nostrud sit", LocalDate.of(2019, 1, 30), SimpleLogLevel.ERROR)
        );
    }

}
