package _4_streams._1_basic;

import _4_streams.model.SimpleLog;

import java.util.List;

import static _4_streams.model.SimpleLog.logs;

public class StreamRepetition {

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

    }
}
