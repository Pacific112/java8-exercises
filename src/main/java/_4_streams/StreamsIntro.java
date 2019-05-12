package _4_streams;

import java.util.*;
import java.util.stream.Collectors;

import static _4_streams.Apple.apples;

public class StreamsIntro {

    public static void main(String[] args) {
        List<Apple> apples = apples();

        List<Apple> heavy = apples.stream()
                .filter(a -> a.getWeight() > 300)
                .collect(Collectors.toList());
        System.out.println(heavy);

        Optional<Apple> first = apples.stream()
                .filter(a -> a.getWeight() > 300)
                .findFirst();
        System.out.println(first);
        System.out.println(first.isPresent());
//        System.out.println(first.get());
        System.out.println(first.orElse(new Apple("Blue", 10)));

        boolean b = apples.stream()
                .anyMatch(a -> a.getWeight() > 300);
        boolean b2 = apples.stream()
                .allMatch(a -> a.getWeight() > 300);
        boolean b3 = apples.stream()
                .noneMatch(a -> a.getWeight() > 300);

        Set<Apple> collect = apples.stream()
                .sorted(Comparator.comparing(Apple::getColor).thenComparing(Apple::getWeight))
                .skip(2)
                .collect(Collectors.toSet());

        Map<Integer, String> map = apples.stream()
                .collect(Collectors.toMap(Apple::getWeight, Apple::getColor));

        Map<String, List<Apple>> map2 = apples.stream()
                .collect(Collectors.groupingBy(Apple::getColor));

        Map<Boolean, List<Apple>> map3 = apples.stream()
                .collect(Collectors.partitioningBy(a -> a.getWeight() > 300));
        System.out.println(map);
        System.out.println(map2);
        System.out.println(map3.get(true));
        System.out.println(map3.get(false));


    }
}