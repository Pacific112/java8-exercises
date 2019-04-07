package _4_streams;

import java.util.Arrays;
import java.util.List;

public class Apple {

    private final String color;
    private final Integer weight;

    public Apple(String color, Integer weight) {
        this.color = color;
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public Integer getWeight() {
        return weight;
    }

    public Juice makeJuice() {
        return new Juice(weight / 10);
    }

    @Override
    public String toString() {
        return "Apple{" +
                "color='" + color + '\'' +
                ", weight=" + weight +
                '}';
    }

    public static List<Apple> apples() {
        return Arrays.asList(
                new Apple("red", 250),
                new Apple("red", 170),
                new Apple("green", 190),
                new Apple("red", 400),
                new Apple("green", 350),
                new Apple("red", 330)
        );
    }
}