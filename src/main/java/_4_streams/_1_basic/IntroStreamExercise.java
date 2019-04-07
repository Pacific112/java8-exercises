package _4_streams._1_basic;


import _4_streams.Apple;
import _4_streams.Juice;

import java.util.List;
import java.util.stream.Collectors;

import static _4_streams.Apple.apples;


public class IntroStreamExercise {

    public static void main(String[] args) {
        exercise1();
    }

    // TODO: Znajdź wszystkie zielone jabłka.
    public static void exercise1() {
        List<Apple> apples = apples()
                .stream()
                .filter(a -> a.getColor().equals("green"))
                .collect(Collectors.toList());
        System.out.println(apples);
    }

    // TODO: Znajdź wszystkie jabłka, które ważą więcej niz 260.
    public static void exercise2() {
        List<Apple> apples = apples()
                .stream()
                .filter(a -> a.getWeight() > 260)
                .collect(Collectors.toList());

        System.out.println(apples);
    }

    // TODO: Policz czerwone jabłka.
    public static void exercise3() {
        long apples = apples()
                .stream()
                .filter(a -> a.getColor().equals("red"))
                .count();

        System.out.println(apples);
    }

    // TODO: Zamień wszystkie zielone jabłka na sok
    public static void exercise4() {
        List<Apple> apples = apples();
        List<Juice> juices = apples
                .stream()
                .filter(apple -> apple.getColor().equals("green"))
                .map(apple -> apple.makeJuice())
                .collect(Collectors.toList());

        System.out.println(juices);
    }
}
