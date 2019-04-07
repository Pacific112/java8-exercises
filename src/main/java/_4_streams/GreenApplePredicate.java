package _4_streams;

public class GreenApplePredicate implements ApplePredicate {

    @Override
    public boolean test(Apple apple) {
        return apple.getColor().equals("green");
    }
}