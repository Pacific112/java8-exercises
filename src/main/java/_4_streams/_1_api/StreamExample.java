package _4_streams._1_api;

import java.util.stream.IntStream;

public class StreamExample {

    public static void main(String[] args) {
        long count = IntStream.of(1, 2, 3).count();
        long sum = IntStream.of(1, 2, 3).sum();
        double average = IntStream.of(1, 2, 3).average().getAsDouble();

        int mapSum = IntStream.of(1, 2, 3)
                              .map(i -> i * 2)
                              .sum();

        long filterCount = IntStream.of(1, 2, 3, 4, 5)
                                    .filter(i -> i > 2)
                                    .count();
    }
}
