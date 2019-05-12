package _4_streams._1_basic;

import _4_streams.model.SimpleLog;
import _4_streams.model.SimpleLogLevel;

import java.util.List;
import java.util.stream.Collectors;

import static _4_streams.model.SimpleLog.logs;

public class StreamRepetition {

    public static final String LOG_MESSAGE = "[%s]-[%s]: %s";

    public static void main(String[] args) {
        exercise3();
    }

    // TODO: Znajdź wszystkie logi, które mają level DEBUG
    public static void exercise1() {
        List<SimpleLog> logs = logs();
    }

    // TODO: Znajdź wszystkie logi, które zostały wykonane przed walentynkami
    public static void exercise2() {
        List<SimpleLog> logs = logs();

    }

    // TODO: Znajdź błędy. Wypisz je w formacie [<level>]-[<date>]: <message>
    public static void exercise3() {
        List<SimpleLog> logs = logs();
        List<String> errors = logs.stream()
                .filter(log -> log.getLevel() == SimpleLogLevel.ERROR)
                .map(log -> String.format(LOG_MESSAGE, log.getLevel(), log.getDate(), log.getMessage()))
                .collect(Collectors.toList());

        System.out.println(errors);


    }
}
